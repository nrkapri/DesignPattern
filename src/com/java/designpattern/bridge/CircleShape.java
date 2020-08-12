package com.java.designpattern.bridge;


public class CircleShape extends Shape
{

   

    public CircleShape(int x, int y, int r, DrawApi d)
    {
        super(x, y, r, d);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void resizeByPercentage(int pct)
    {
        radius *=(1+pct*0.01);

    }

}

