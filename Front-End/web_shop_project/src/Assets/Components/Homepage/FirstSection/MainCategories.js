import React from  "react";
import "../../../Styling/MainCategoriesStyling.css";


const  MainCategories = (props)=>{
    return(
        <div className="Main_Window">
        <img src ={props.imageSource} alt="imgSource" />
        <h3>{props.label}</h3>
        </div>
    );
}
export default MainCategories;