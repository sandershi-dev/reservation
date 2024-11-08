import React from 'react';
import '/node_modules/bootstrap/dist/css/bootstrap.min.css';
import ReservationForm from './ReservationForm.js';
import Navbar from './Navbar.js';

function App() {

  return (
    <div>
      <Navbar/>
      <ReservationForm/>
    </div>
  );
}


export default App;
