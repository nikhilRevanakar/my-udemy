package com.learning.Graph.AdjacencyMatric;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	List<GraphNode> graphList;
	int adjancenyMatrix[][];
	
	public Graph(List<GraphNode> graphList) {
		this.graphList = graphList;
		this.adjancenyMatrix = new int[graphList.size()][graphList.size()];
	}
	
	
	public void addUndirectedEdge(int i, int j) {
		adjancenyMatrix[i][j] = 1;
		adjancenyMatrix[j][i] = 1;
	}
	
	public void print() {
		for(int i=0;i<adjancenyMatrix.length;i++) {
			for(int j=0;j<adjancenyMatrix[i].length;j++) {
				
				System.out.print(adjancenyMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
		

	

}
