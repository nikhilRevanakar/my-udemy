package com.learning.Graph.AdjacencyList;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	List<GraphNode> list;

	public Graph(List<GraphNode> list) {
		super();
		this.list = list;
	}

	
	public void addUndirectedEdge(int i, int j) {
		GraphNode first = list.get(i);
		GraphNode second = list.get(j);
		first.neighbors.add(second);
		second.neighbors.add(first);
	}


	public void print() {
		for(GraphNode node:list) {
			System.out.print(node.value + " ->");
			for(GraphNode neigh:node.neighbors) {
				System.out.print(neigh.value + " ->");
			}
			System.out.println();

		}
		
	}
	
}
