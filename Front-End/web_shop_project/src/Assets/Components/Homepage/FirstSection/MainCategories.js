import React from  "react";
import "../../../Styling/MainCategoriesStyling.css";
const  MainCategories = (props)=>{
    return(
        <div>
            <h3>{props.label}</h3>
        </div>
    );
}
export default MainCategories;