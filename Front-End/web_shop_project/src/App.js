import React from 'react';
import './App.css';
import {Route, BrowserRouter as Router } from "react-router-dom";
import Homepage from "./Pages/Homepage.js";
function  App() {
  return (
    <Router>
    <div className = "container">
    <Route path="/Home" component={Homepage}/>
    </div>
    
    </Router>
  )
}

export default App;
