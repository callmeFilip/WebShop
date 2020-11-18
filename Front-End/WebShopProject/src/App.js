import React from 'react';
import './App.css';
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import Homepage from "./Pages/Homepage.js";
function  App() {
  return (
    <Router>
    
    <Switch>    <Route path="/" component={Homepage}/>

    </Switch>
    </Router>
  )
}

export default App;
