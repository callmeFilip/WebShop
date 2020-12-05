import React from "react";
import MainCategories from "../Assets/Components/Homepage/FirstSection/MainCategories";
import "../Assets/Styling/MainCategoriesStyling.css";
import "../Assets/Components/Homepage/FirstSection/BrowseAllButton";
import BrowseAllButton from "../Assets/Components/Homepage/FirstSection/BrowseAllButton";
    function Homepage(){
        return(     
           <div>
           <div className="grid-container">
               <MainCategories label ="Shoes"  />   
                <MainCategories label ="Clothes" />
                <MainCategories label ="Accessories"/>
                
            </div>
            <BrowseAllButton/>
            </div>
           
        );
    }

 export default Homepage;