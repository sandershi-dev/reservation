import logo from './logo.svg';
import '/node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';

function App() {
  return (
    <div class = "container w-50">
       <form class="row">
        <div class="form-row row">
          <div class="col-md-2"></div>
          <div class="form-group col-md-2">
            <label for="inputFirstName">First name</label>
            <input type="text" class="form-control" id="inputName" placeholder="First Name"/>
          </div>
          <div class="form-group col-md-2">
            <label for="inputLastName>">Last Name</label>
            <input type="text" class="form-control" id="inputPassword4" placeholder="Last Name"/>
          </div>
        </div>
        <div class="form-row row">
          <div class="col-md-2"></div>
          <div class="form-group col-md-3">
            <label for="inputAddress">Location</label>
            <select id="inputAddress" class="form-control">
              <option selected>Choose...</option>
              <option>2855 South Road, Poughkeepsie, NY, 12601</option>
            </select>
          </div>
          <div class="form-group col-md-1">
            <label for="inputCount">Attendees</label>
            <input type="number" class="form-control" id="inputCount" placeholder="1" min="1" max="20"/>
          </div>
        </div>
        <div class="form-row row">
          <div class="col-md-2"></div>
          <div class="form-group col-md-3">
              <label for="inputDate">Date</label>
              <input type="date" class="form-control" id="inputDate"/>
            </div>
            <div class="form-group col-md-2">
              <label for="inputTime">Time</label>
              <input type="time" class="form-control" id="inputTime"/>
          </div>
        </div>
        <div class="form-row row">
          <div class="col-md-2"></div>
          <div class="form-group col-md-3">
              <label for="inputEmail">Email</label>
              <input type="email" class="form-control" id="inputEmail"/>
          </div>
          <div class="form-group col-md-2">
              <label for="inputNumber">Mobile Number</label>
              <input type="tel" class="form-control" id="inputNumber"/>
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

export default App;
