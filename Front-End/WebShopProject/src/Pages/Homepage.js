import React from "react";
import MainCategories from "../Assets/Components/Homepage/FirstSection/MainCategories";

    function Homepage(){
        return(     
            <div>
                <MainCategories name ="Shoes" className = "Shoes"/>
                <MainCategories name ="Clothes"/>
                <MainCategories name ="Accessories" id = "Clothes"/>

            </div>
        );
    }

 export default Homepage;