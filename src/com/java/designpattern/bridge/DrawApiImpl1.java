package com.java.designpattern.bridge;


public class DrawApiImpl1 implements DrawApi
{

    @Override
    public void draw(int x, int y, int radius)
    {
       System.out.println("DrawaPI 1 x:"+x+",y:"+y+",radius:"+radius);
    }

    

}

