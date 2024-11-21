import React from 'react';
import '/node_modules/bootstrap/dist/css/bootstrap.min.css';
import ReservationForm from './ReservationForm.js';
import AccountCreation from './AccountCreation.js';
import Login from './routes/Login.js';
import Homepage from './routes/Homepage.js';
import * as ReactDOM from "react-dom/client";
import AppLayout from './routes/AppLayout.js';
import {
  createBrowserRouter, 
  createRoutesFromElements,
  RouterProvider,
  Route,
  Link,
  Outlet
} from "react-router-dom";
import Index from './routes/AppLayout.js';
import ReservationTable from './routes/ReservationTable.js';

const router = createBrowserRouter([
  {
    path: "/",
    element: <AppLayout/>,
    children: [
      {
        path: "login",
        element: (
          <Login/>
        )
      },
      {
        path:"signup",
        element: (
          <AccountCreation/>
        )
      },
      {
        path:"reserve",
        element:(
          <ReservationForm />
        )
      },
      {
        path:"admin",
        element:(
          <ReservationTable/>
        )
      },
      {
        path:"",
        element:(<Homepage/>)
      }
    ]
  }
]);


function App() {

  return <RouterProvider router={router}/>;

}


export default App;
