package com.learning.Graph.AdjacencyListBFS;

import java.util.ArrayList;

public class GraphNode {
	
	String value;
	int index;
	boolean isVisited = false;
	
	ArrayList<GraphNode> neighbors = new ArrayList<>();
	
	public GraphNode() {
		super();
	}



	public GraphNode(String value, int index) {
		super();
		this.value = value;
		this.index = index;
	}
	
	

}
