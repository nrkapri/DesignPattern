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

