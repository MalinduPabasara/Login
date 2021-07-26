import "./App.css";
import { useState } from "react";
import Axios from "axios";

function App() {
  const [nic, setNIC] = useState("");
  const [empNo, setEmpNo] = useState(0);
  const [name, setName] = useState("");
  const [userName, setUserName] = useState("");
  const [password, setPassword] = useState("");
  const [address, setAddress] = useState("");
  const [email, setEmail] = useState("");
  const [mobile, setMobile] = useState(0);
  const [userType, setUserType] = useState("");

  // const [employeeList, setEmployeeList] = useState([]);

  const addEmployee = () => {
    Axios.post("http://localhost:8080/stitchline/login", {
      nic: nic,
      empNo: empNo,
      name: name,
      userName: userName,
      password: password,
      address: address,
      email: email,
      mobile: mobile,
      userType:userType
    }).then(() => {
      
    });
  };

  // const getEmployees = () => {
  //   Axios.get("http://localhost:3001/employees").then((response) => {
  //     // setEmployeeList(response.data);
  //   });
  // };

  // const updateEmployeeWage = (id) => {
  //   Axios.put("http://localhost:3001/update", { wage: newWage, id: id }).then(
  //     (response) => {
  //       setEmployeeList(
  //         employeeList.map((val) => {
  //           return val.id == id
  //             ? {
  //                 id: val.id,
  //                 name: val.name,
  //                 country: val.country,
  //                 age: val.age,
  //                 position: val.position,
  //                 wage: newWage,
  //               }
  //             : val;
  //         })
  //       );
  //     }
  //   );
  // };

  // const deleteEmployee = (id) => {
  //   Axios.delete(`http://localhost:3001/delete/${id}`).then((response) => {
  //     setEmployeeList(
  //       employeeList.filter((val) => {
  //         return val.id != id;
  //       })
  //     );
  //   });
  // };

  return (
    <div className="App">
      <div className="information">
        <div className="mainTitle">
          <label>Register Form</label>
        </div>
       
        <label>User Type:</label>
        <input
          type="text"
          onChange={(event) => {
            setUserType(event.target.value);
          }}
        />
        <label>NIC:</label>
        <input
          type="text"
          onChange={(event) => {
            setNIC(event.target.value);
          }}
        />
        <label>Employee No:</label>
        <input
          type="number"
          onChange={(event) => {
            setEmpNo(event.target.value);
          }}
        />
        <label>Name:</label>
        <input
          type="text"
          onChange={(event) => {
            setName(event.target.value);
          }}
        />
        <label>User Name:</label>
        <input
          type="text"
          onChange={(event) => {
            setUserName(event.target.value);
          }}
        />
        <label>Password:</label>
        <input
          type="text"
          onChange={(event) => {
            setPassword(event.target.value);
          }}
        />
        <label>Address:</label>
        <input
          type="text"
          onChange={(event) => {
            setAddress(event.target.value);
          }}
        />
        <label>Email:</label>
        <input
          type="text"
          onChange={(event) => {
            setEmail(event.target.value);
          }}
        />
        <label>Mobile:</label>
        <input
          type="number"
          onChange={(event) => {
            setMobile(event.target.value);
          }}
        />
        
        <button onClick={addEmployee}>Register</button>
      </div>
      {/* <div className="employees">
        <button onClick={getEmployees}>Show Employees</button>

        {employeeList.map((val, key) => {
          return (
            <div className="employee">
              <div>
                <h3>Name: {val.name}</h3>
                <h3>Age: {val.age}</h3>
                <h3>Country: {val.country}</h3>
                <h3>Position: {val.position}</h3>
                <h3>Wage: {val.wage}</h3>
              </div>
              <div>
                <input
                  type="text"
                  placeholder="2000..."
                  onChange={(event) => {
                    setNewWage(event.target.value);
                  }}
                />
                <button
                  onClick={() => {
                    updateEmployeeWage(val.id);
                  }}
                >
                  {" "}
                  Update
                </button>

                <button
                  onClick={() => {
                    deleteEmployee(val.id);
                  }}
                >
                  Delete
                </button>
              </div>
            </div>
          );
        })}
      </div> */}
    </div>
  );
}

export default App;