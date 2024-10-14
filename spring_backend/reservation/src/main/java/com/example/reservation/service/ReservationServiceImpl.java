package com.example.reservation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.reservation.domain.Reservation;
import com.example.reservation.service.impl.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService{

    private List<Reservation> reservationList = new ArrayList<>();

    @Override
    public void addReservation(Reservation reservation){
        int count =reservationList.size();
        reservation.setReservationId(String.valueOf(count+1));
        reservationList.add(reservation);
    }

    @Override
    public List<Reservation> getAllReservations(){
        return reservationList;
    }

    @Override
    public Reservation getReservation(String id){
        for(int i=0; i<reservationList.size();i++){
            if(reservationList.get(i).getReservationId().equals(id)){
                return reservationList.get(i);
            }
        }

        return null;
    }
    @Override
    public void deleteReservation(String Id){
        int index = -1;
        for(int i = 0; i < reservationList.size(); i++){
            if(reservationList.get(i).getReservationId().equals(Id)){
                index = i;
                break;
            }
        }

        if(index != -1){
            reservationList.remove(index);
        }
    }
}
