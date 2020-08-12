package com.java.designpattern.creational.builder;


public class CarBuildDirector
{
    
    CarBuilder carbuilder;
    
    public CarBuildDirector(CarBuilder b)
    {
        this.carbuilder=b;
        
    }
    
    
    public Car builaCar()
    {
        return carbuilder.addWheels(4).designColor("RED").build();
    }

}

