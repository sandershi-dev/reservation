<form class="row" onSubmit={handleSubmit}>
        <div class="form-row row">
          <div class="col-md-2"></div>
          <div class="form-group col-md-2">
            <label for="inputFirstName">First name</label>
            <input type="text" class="form-control" id="inputName" placeholder="First Name" input={formData.firstName} onChange={handleChange} name="firstName"/>
          </div>
          <div class="form-group col-md-2">
            <label for="inputLastName>">Last Name</label>
            <input type="text" class="form-control" id="inputPassword4" placeholder="Last Name" input={formData.lastName} onChange={handleChange} name="lastName"/>
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
          <div class="col-md-2"></div>
          <div class="form-group col-md-3">
              <label for="inputEmail">Email</label>
              <input type="email" class="form-control" id="inputEmail" input={formData.email} onChange={handleChange} name="email"/>
          </div>
          <div class="form-group col-md-2">
              <label for="inputNumber">Mobile Number</label>
              <input type="tel" class="form-control" id="inputNumber" input={formData.number} onChange={handleChange} name="number"/>
          </div>
        </div>
        <div class="form-row row">
          <div class="col-md-4"></div>
          <button type="submit" class="btn btn-primary col-md-1">Submit</button>
        </div>
    </form>