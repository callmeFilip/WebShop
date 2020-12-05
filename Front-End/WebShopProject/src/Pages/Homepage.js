import React from "react";
import MainCategories from "../Assets/Components/Homepage/FirstSection/MainCategories";
import "../Assets/Styling/MainCategoriesStyling.css";
    function Homepage(){
        return(     
           
           <div className="grid-container">
               <MainCategories label ="Shoes" className ="ShoeLabel"  />   
                <MainCategories label ="Clothes" />
                <MainCategories label ="Accessories"/>

            </div> 
        );
    }

 export default Homepage;