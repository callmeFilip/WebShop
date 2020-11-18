import React from  "react";
import "../../../Styling/MainCategoriesStyling.css";

const  MainCategories = (props)=>{
    return(
        <div>
            <p>Category: {props.name}</p>

        </div>
    );
}
export default MainCategories;