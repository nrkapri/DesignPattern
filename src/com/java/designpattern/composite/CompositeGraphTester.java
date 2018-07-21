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
package com.java.designpattern.composite;


public class CompositeGraphTester
{

    public static void main(String[] args)
    {
        Ellipse e1 = new Ellipse(1);
        Ellipse e2 = new Ellipse(2);
        Ellipse e3 = new Ellipse(3);
        Ellipse e4 = new Ellipse(4);
        Ellipse e5 = new Ellipse(5);
        Ellipse e6 = new Ellipse(6);
        
        CompositeGraph cg1 = new CompositeGraph();
        CompositeGraph cg2 = new CompositeGraph();
        CompositeGraph cg3 = new CompositeGraph();

        
        cg1.addChild(e1);
        cg1.addChild(e2);
        cg1.addChild(e3);
        
        cg2.addChild(e4);
        
        cg3.addChild(e5);
        cg3.addChild(e6);
        cg3.addChild(cg1);
        cg3.addChild(cg2);
        
        
        cg3.print();
        
    }

}

