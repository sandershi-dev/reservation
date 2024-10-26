package com.example.reservation.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.reservation.domain.Reservation;
import com.example.reservation.service.DBService;

public class DBServiceImpl implements DBService{
    @Autowired
    private Connection connection;

    private PreparedStatement preparedStatement;

    public void init(){
        // log.info("MySql Connection is " + connection);
        // log.info("creating table if not exists")
        String query = "create table if not exists reservation(id int primary key auto_increment, guest_name varchar(50), reserved_date DATE, reserved_time TIME, reservation_timestamp TIMESTAMP);";
        try(Statement statement = connection.createStatement()){
            statement.executeQuery(query);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }

        try {
            preparedStatement = connection.prepareStatement("insert into reservations (guest_name,reserved_date,reserved_time,reservation_timestamp) values (?,?,?,?)");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public Connection getDatabase(){
        if(Objects.isNull(connection)){
            createConnection();
        }
        return connection;
    }

    private void createConnection(){

    }

    public Reservation addReservation(Reservation reservation){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        reservation.setTimestamp(timestamp);
        try{
            preparedStatement = connection.prepareStatement("insert into reservations (guest_name,reserved_date,reserved_time,reservation_timestamp) values (?,?,?,?)");
            preparedStatement.setString(1, reservation.getGuest());
            preparedStatement.setDate(2, reservation.getDate());
            preparedStatement.setTime(3, reservation.getTime());
            preparedStatement.setTimestamp(4, reservation.getTimestamp());
            preparedStatement.execute();
            return reservation;
        }catch (SQLException e){
            System.out.println("Error adding reservation to DB");

        }
        return null;

    }
    
    public boolean removeReservation(String id){
        try {
            preparedStatement = connection.prepareStatement("delete from reservations where id='(?)'");
            preparedStatement.setString(1, id);
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error removing reservation from DB");

        }
        return false;
    }

    public Reservation changeReservation(String id, Reservation newReservation){
        return null;
    }

    public List<Reservation> getAllReservations(){
        String query = "select * from reservations";
        List<Reservation> reservations = new ArrayList<>();
        try(Statement statement= connection.createStatement()){
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                Reservation reservation = new Reservation();
                reservation.setId(resultSet.getString("id"));
                reservation.setGuest(resultSet.getString("guest_name"));
                reservation.setDate(resultSet.getDate("reserved_date"));
                reservation.setTime(resultSet.getTime("reserved_time"));
                reservation.setTimestamp(resultSet.getTimestamp("reservation_timestamp"));
                reservations.add(reservation);
            }
        }catch(SQLException e){
            System.out.println("Error getting reservations from DB");
        }
        return reservations;
    }
    
}
