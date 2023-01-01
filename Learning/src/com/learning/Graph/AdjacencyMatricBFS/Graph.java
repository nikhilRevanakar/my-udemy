package com.learning.Graph.AdjacencyMatricBFS;

import java.util.ArrayList;
import java.util.LinkedList;
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
	
	
	// Get neighbors
	public ArrayList<GraphNode> getNeighbors(GraphNode node) {
		
		ArrayList<GraphNode> neighbors = new ArrayList<>();
		int nodeInex = node.index;
		
		for(int i=0;i<adjancenyMatrix.length;i++) {
			if(adjancenyMatrix[nodeInex][i]  == 1) {
				neighbors.add(graphList.get(i));
			}
		}
		
		return neighbors;
	}
		
	// BSF internal
	void bsfVisit(GraphNode node) {
		LinkedList<GraphNode> queu = new LinkedList<>();
		queu.add(node);
		
		while(!queu.isEmpty()) {
			GraphNode currentNode = queu.remove(0);
			currentNode.isVisited = true;
			System.out.print(currentNode.value+" ");
			ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
			for(GraphNode neighbor: neighbors) {
				if(!neighbor.isVisited) {
					neighbor.isVisited = true;
					queu.add(neighbor);
				}
			}
		}
	}

	void bsf() {
		for(GraphNode node:graphList) {
			if(!node.isVisited) {
				bsfVisit(node);
			}
		}
	}
	

}
