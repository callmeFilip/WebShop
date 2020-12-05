import React from  "react";
import "../../../Styling/MainCategoriesStyling.css";

const  MainCategories = (props)=>{
    return(
        <div className="ShoeLabel">
           {props.label}
        </div>
    );
}
export default MainCategories;