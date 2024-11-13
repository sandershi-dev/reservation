import React from 'react';
import '/node_modules/bootstrap/dist/css/bootstrap.min.css';
import ReservationForm from './ReservationForm.js';
import AccountCreation from './AccountCreation.js';
import Login from './Login.js';
import Navbar from './Navbar.js';

function App() {

  return (
    <div>
      <Navbar/>
      <AccountCreation/>
      <Login/>
    </div>
  );
}


export default App;
