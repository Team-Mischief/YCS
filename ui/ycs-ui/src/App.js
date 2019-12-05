import React from 'react';
import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Button, ButtonToolbar } from 'react-bootstrap';
import Routing from './Components/routing.component';

function App() {
  return (
    <div className="App">
      <Routing></Routing>        
    </div >
  );
}

export default App;
