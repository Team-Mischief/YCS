import React from 'react';
import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Button, ButtonToolbar, Navbar, Container } from 'react-bootstrap';
import Routing from './Components/routing.component';

function App() {
  return (
    <div className="App">

      <Routing></Routing>
    <br></br>
    <br></br>
     

    
    <div class="bg-secondary text-center" style={{marginBottom:0}}>
    <h1>Team Mischief</h1>
    <h2>Creating Bugs Since 2019</h2>
   </div>
   </div>
  );
}

export default App;
