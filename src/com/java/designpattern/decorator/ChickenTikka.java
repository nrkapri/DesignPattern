package com.java.designpattern.decorator;


public class ChickenTikka extends FoodDecorator
{

    public ChickenTikka(Food f)
    {
        super(f);
    }
    
    @Override
    public void prepareFood()
    {
        super.prepareFood();
        System.out.print("Added Chicken Tikka ");
    }

    @Override
    public int price()
    {
        return super.price()+150;
    }

}

