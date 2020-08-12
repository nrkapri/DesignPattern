package com.java.designpattern.decorator;


public class Desert extends FoodDecorator
{

    public Desert(Food f)
    {
        super(f);
        
    }

    @Override
    public void prepareFood()
    {
       super.prepareFood();
       System.out.print("Added icecream");
    }

    @Override
    public int price()
    {

        return super.price()
               +30; 
    }

    
    
}

