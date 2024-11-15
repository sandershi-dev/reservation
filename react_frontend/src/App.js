import React from 'react';
import '/node_modules/bootstrap/dist/css/bootstrap.min.css';
import ReservationForm from './ReservationForm.js';
import AccountCreation from './AccountCreation.js';
import Login from './Login.js';
import Navbar from './Navbar.js';
import * as ReactDOM from "react-dom/client";
import {
  createBrowserRouter, 
  createRoutesFromElements,
  RouterProvider,
  Route,
  Link,
} from "react-router-dom";
import Index from './routes/Index.js';

const router = createBrowserRouter([
  {
    path: "/",
    element: <Index/>
  },
{
    path: "/login", 
    element: (
      <div>
        <h1>Hello from About</h1> 
        <Link to="/">Home</Link>
      </div>
    ),
  },
]);


function App() {

  return <RouterProvider router={router}/>;

}


export default App;
