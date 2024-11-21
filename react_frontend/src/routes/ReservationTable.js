
import React, {useEffect,useState, useMemo} from "react";
import axios from "axios";
import {useTable} from "react-table";

export default function ReservationTable(){
    const [tableData,setTableData] = useState([]);
    useEffect(()=>{
        fetchData();
    },[])

    const fetchData = async() =>{
        axios.get("http://localhost:8080/admin/reservations/all")
        .then(function(response){
          setTableData(response.data);
          console.log(response.data)
        }).catch(function(error){
          console.log(error);
        })
    }

    const columns = useMemo(()=>[
        
        { 
            Header:"Reservation Id",
            accessor:"id",

        },
        { Header:"User ID", accessor:"user_id"},
        { Header:"User", accessor:"user"},
        { Header:"Attendees", accessor:"numOfGuests"},
        { Header:"Time", accessor:"time"},
        { Header:"Date", accessor:"date"},
        { Header:"Timestamp", accessor:"timestamp"},
    
        
    ],[]);

    const {
        getTableProps,
        getTableBodyProps,
        headerGroups,
        rows,
        prepareRow
    } = useTable({columns,data:tableData});
    
    return(
        <div className="table-container">
      <table class ="table"{...getTableProps()}>
        <thead>
          {headerGroups.map((headerGroup) => (
            <tr {...headerGroup.getHeaderGroupProps()}>
              {headerGroup.headers.map((column) => (
                <th scope ="col"{...column.getHeaderProps()}>{column.render("Header")}</th>
              ))}
            </tr>
          ))}
        </thead>
        <tbody {...getTableBodyProps()}>
          {rows.map((row) => {
            prepareRow(row);
            return (
              <tr {...row.getRowProps()}>
                {row.cells.map((cell) => (
                  <td {...cell.getCellProps()}>{cell.render("Cell")}</td>
                ))}
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
    )
};

