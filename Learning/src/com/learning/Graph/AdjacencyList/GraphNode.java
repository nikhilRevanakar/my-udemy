package com.learning.Graph.AdjacencyList;

import java.util.ArrayList;

public class GraphNode {
	
	String value;
	int index;
	
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
