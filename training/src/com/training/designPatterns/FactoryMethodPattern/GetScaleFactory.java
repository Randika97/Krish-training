package com.training.designPatterns.FactoryMethodPattern;

class GetScaleFactory {
    //Create object from concrete class based on the scale
    public Tasks getScale(String scale){
        if(scale==null){
            return null;
        }
        if (scale.equalsIgnoreCase("Small")){
            return new SmallScale();

        }
        if (scale.equalsIgnoreCase("Medium")){
            return new MediumScale();

        }
        if (scale.equalsIgnoreCase("Large")){
            return new LargeScale();

        }
        return null;
    }
}
