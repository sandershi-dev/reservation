import React, {useState} from 'react';
import '/node_modules/bootstrap/dist/css/bootstrap.min.css';
import axios from 'axios';
import './App.css';

function ReservationForm() {
    const [formData, setFormData] = useState({
      user_id:'',
      numOfGuests: 1,
      date: '',
      time: '',
    });
  
  
    const handleChange = (e) => {
      setFormData({ ...formData, [e.target.name]: e.target.value });
      console.log(formData)

    };
  
    const handleSubmit = (e) => {
      e.preventDefault();
      console.log(formData)
      // Here, we'll add the code to post the form data using Axios
      axios.post("http://localhost:8080/reservation/create",{ 
          user_id: formData.user_id,
          numOfGuests: formData.numOfGuests,
          date: formData.date,
          time: formData.time
      }).then(function(response){
        console.log(response);
      }).catch(function(error){
        console.log(error);
      })
    };

  return (
    <div class = "container w-50">
       <form class="row" onSubmit={handleSubmit}>
        <div class="form-row row">
          <div class="col-md-2"></div>
          <div class="form-group col-md-2">
            <label for="inputFirstName">user_id</label>
            <input type="text" class="form-control" id="inputName" placeholder="User ID" input={formData.user_id} onChange={handleChange} name="user_id"/>
          </div>
        </div>
        <div class="form-row row">
          <div class="col-md-2"></div>
          <div class="form-group col-md-3">
            <label for="inputAddress">Location</label>
            <select id="inputAddress" class="form-control" input={formData.location} onChange={handleChange} name="location">
              <option selected>Choose...</option>
              <option>2855 South Road, Poughkeepsie, NY, 12601</option>
            </select>
          </div>
          <div class="form-group col-md-1">
            <label for="inputCount">Attendees</label>
            <input type="number" class="form-control" id="inputCount" placeholder="1" min="1" max="20" input={formData.attendees} onChange={handleChange} name="attendees"/>
          </div>
        </div>
        <div class="form-row row">
          <div class="col-md-2"></div>
          <div class="form-group col-md-3">
              <label for="inputDate">Date</label>
              <input type="date" class="form-control" id="inputDate" input={formData.date} onChange={handleChange} name="date"/>
            </div>
            <div class="form-group col-md-2">
              <label for="inputTime">Time</label>
              <input type="time" class="form-control" id="inputTime" input={formData.time} onChange={handleChange} name="time" />
          </div>
        </div>
        <div class="form-row row">
          <div class="col-md-4"></div>
          <button type="submit" class="btn btn-primary col-md-1">Submit</button>
        </div>
    </form>
    </div>
  );
}

export default ReservationForm;