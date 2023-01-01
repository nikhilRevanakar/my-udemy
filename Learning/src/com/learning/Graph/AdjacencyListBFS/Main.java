package com.learning.Graph.AdjacencyListBFS;

import java.util.ArrayList;
import java.util.List;


public class Main {
	
	
	// a  -	b
	//			\
	// |  \				e				
	//         /
	// c  -	d 
	
//	A ->B ->C ->D ->
//	B ->A ->E ->
//	C ->A ->D ->
//	D ->A ->E ->C ->
//	E ->D ->B ->

	public static void main(String[] args) {
		List<GraphNode> list = new ArrayList<>(); 
		
		list.add(new GraphNode("A",0));
		list.add(new GraphNode("B",1));
		list.add(new GraphNode("C",2));
		list.add(new GraphNode("D",3));
		list.add(new GraphNode("E",4));
		
		Graph g = new Graph(list);
		g.addUndirectedEdge(0, 1);
		g.addUndirectedEdge(0, 2);
		g.addUndirectedEdge(0, 3);
		g.addUndirectedEdge(3, 4);
		g.addUndirectedEdge(3, 2);
		g.addUndirectedEdge(1, 4);
		
		g.print();
		
		g.bfs();
		
	}

}
