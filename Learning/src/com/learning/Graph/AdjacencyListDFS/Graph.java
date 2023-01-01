package com.learning.Graph.AdjacencyListDFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;



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
	
	// BFS Internal
	public void bfsVisit(GraphNode node) {
		LinkedList<GraphNode> queue = new LinkedList<>();
		queue.add(node);
		
		while(!queue.isEmpty()) {
			GraphNode currentNode = queue.remove();
			currentNode.isVisited=true;
			System.out.print(currentNode.value+" ");
			for(GraphNode neighNode: currentNode.neighbors) {
				if(!neighNode.isVisited) {
					neighNode.isVisited=true;
					queue.add(neighNode);
				}
			}
		}
	}
	
	public void bfs() {
		for(GraphNode node: list) {
			
			if(!node.isVisited) {
				bfsVisit(node);
			}
		}
			
	}
	
	// DFS
	public void dfsVisit(GraphNode node) {
		Stack<GraphNode> stack = new Stack<>();
		stack.push(node);
		while(!stack.isEmpty()) {
			GraphNode currentNode = stack.pop();
			currentNode.isVisited = true;
			System.out.print(currentNode.value+ " ");
			List<GraphNode> neighbors = currentNode.neighbors;
			for(GraphNode neighbor : neighbors) {
				if(!neighbor.isVisited) {
					neighbor.isVisited=true;
					stack.push(neighbor);
					
				}
			}
		}
		
	}
	
	public void dfs() {
		for(GraphNode node : list) {
			if(!node.isVisited) {
				dfsVisit(node);
			}
		}
	}
}
