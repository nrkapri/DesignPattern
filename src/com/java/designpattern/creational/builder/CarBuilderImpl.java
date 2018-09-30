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

