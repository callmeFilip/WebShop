import React from "react";
import MainCategories from "../Assets/Components/Homepage/FirstSection/MainCategories";
import "../Assets/Styling/MainCategoriesStyling.css";
import Clothes from '../Pics/ClothesBackground.jpg'
import Accessories from '../Pics/AccessoriesBackground.jpg';
import Shoes from '../Pics/ShoesBackground.jpg';

    function Homepage(){
        return(     
          
           <div className="grid-container">
               <MainCategories label ="Shoes" imageSource = {Shoes}/>   
                <MainCategories label ="Clothes" imageSource={Clothes} />
                <MainCategories label ="Accessories" imageSource= {Accessories}/>
            </div>
        );
    }

 export default Homepage;