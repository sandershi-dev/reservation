
import { useState } from "react";
import axios from "axios";
function AccountCreation(){
    
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
        setFormData({ ...formData, [e.target.name]: e.target.value });
        console.log(formData)
        // Here, we'll add the code to post the form data using Axios
        axios.post("http://localhost:8080/user/create",{ 
            firstName: formData.firstName,
            lastName: formData.lastName,
            email: formData.email,
            mobileNumber: formData.mobileNumber,
            username: formData.username,
            password: formData.password
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
              <label for="inputFirstName">First Name</label>
              <input type="text" class="form-control" id="inputFirstName" placeholder="John" input={formData.firstName} onChange={handleChange} name="firstName"/>
            </div>
            <div class="form-group col-md-2">
                <label for="inputlastName">Last Name</label>
                <input type="text" class="form-control" id="input:astName" placeholder="Smith" input={formData.lastName} onChange={handleChange} name="lastName"/>
              </div>
          </div>
          <div class="form-row row">
            <div class="col-md-2"></div>
            <div class="form-group col-md-3">
                    <label for="inputEmail">Email</label>
                    <input type="email" class="form-control" id="inputEmail" placeholder="JohnSmith@gmail.com" input={formData.email} onChange={handleChange} name="email"/>
            </div>
            <div class="form-group col-md-2">
                    <label for="inputNumber">Mobile Number</label>
                    <input type="tel" class="form-control" id="inputMobileNumber" placeholder="" input={formData.mobileNumber} onChange={handleChange} name="mobileNumber"/>
            </div>
        </div>
          <div class="form-row row">
            <div class="col-md-2"></div>
            <div class="form-group col-md-3">
              <label for="inputUserName">Username</label>
              <input type="text" class="form-control" id="inputUserName" placeholder="username" input={formData.username} onChange={handleChange} name="username"/>
            </div>
            <div class="form-group col-md-3">
              <label for="inputPassword">Password</label>
              <input type="text" class="form-control" id="inputPassword" placeholder="password" input={formData.password} onChange={handleChange} name="password"/>
            </div>
          </div>

          <div class="form-row row">
            <div class="col-md-2"></div>
        
          </div>
          <div class="form-row row">
            <div class="col-md-4"></div>
            <button type="submit" class="btn btn-primary col-md-1">Submit</button>
          </div>
      </form>
      </div>
    );
}
export default AccountCreation;