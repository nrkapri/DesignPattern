/**-----------------------------------------------------------------------------------------------
 *  Description:	TODO
 *  
 *  Author:		 NAYANK
 *  Supervisor:  TODO
 *  Date:		 May 21, 2018	
 *  Version:	 Design Pattern
 * 
 * @Copyright Amdocs Inc., 2007.
 * This document contains proprietary and confidential information,
 * and shall not be reproduced, transferred, or disclosed to others,
 * without the prior written consent of Amdocs.
 * --------------------------------------------------------------------------------------------------*/
 /* ----------------------------------------------------------------------------------------------------------------
 * Change History :
 * ----------------------------------------------------------------------------------------------------------------
 * ---------
 * Change #1
 * ---------
 * Version:            
 * Defect ID:           
 * CR ID:              
 * Date:               
 * Programmer:         
 * Supervisor:         
 * Changed:			   
 * Description:        
 
 *----------------------------------------------------------------------------------------------------*/
package com.java.designpattern.builder;


public class Car
{
    int wheels ;
    String color;
    
    public int getWheels()
    {
        return wheels;
    }
    public void setWheels(int wheels)
    {
        this.wheels = wheels;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    @Override
    public String toString()
    {
        return "Car [wheels=" + wheels + ", color=" + color + "]";
    }
  
    
    

}

