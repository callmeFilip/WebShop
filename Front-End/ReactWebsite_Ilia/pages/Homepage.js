import React from 'react';
import ShoesCollumn from "../Assets/Components/Homepage/FirstSection/ShoesCollumn.js";
import ClothesCollumn from "../Assets/Components/Homepage/FirstSection/ClothesCollumn.js";
import AccessoriesCollumn from "../Assets/Components/Homepage/FirstSection/AccessoriesCollumn";

    function Homepage() {
        return(
            <div>
                <ShoesCollumn/>
                <ClothesCollumn/>
                <AccessoriesCollumn/>

            </div>
        )
    
}

export default (Homepage);
