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

import java.util.ArrayList;
import java.util.List;

//Composite
public class CompositeGraph implements Graph
{

    List<Graph> childGraph ;
    
    
    public CompositeGraph()
    {
        childGraph = new ArrayList<Graph>();
    }
    @Override
    public void print()
    {

        for(Graph g :childGraph )
        {
            g.print();
        }
        
    }
    
    public void addChild(Graph g)
    {
        childGraph.add(g);
    }
    public void removeChild(Graph g)
    {
        childGraph.remove(g);
    }

}

