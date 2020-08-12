package com.java.designpattern.composite;

//Leaf
public class Ellipse implements Graph
{
    int i;
    
    public Ellipse(int i )
    {
        this.i=i;
    }
    
    @Override
    public void print()
    {
      System.out.println("print ellipse:"+i);
    }

}

