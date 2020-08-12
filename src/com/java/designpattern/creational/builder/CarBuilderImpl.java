package com.java.designpattern.creational.builder;


public class CarBuilderImpl implements CarBuilder
{
    Car car;

    CarBuilderImpl(){
        car= new Car();
    }

    @Override
    public Car build()
    {
        return car ;
    }

    @Override
    public CarBuilder designColor(String color)
    {
        car.setColor(color);
        return this;
    }

    @Override
    public CarBuilder addWheels(int wheels)
    {

        car.setWheels(wheels);
        return this;
    }

}

