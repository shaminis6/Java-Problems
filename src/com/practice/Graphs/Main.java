package com.practice.Graphs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph g = new Graph(7);
		
		/*
		 Graph structure
		 
		    1
		    /
		   2
		   /\
		  3  4
		  \  / \
		   5    6
		*/
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 5);
		g.addEdge(4, 5);
		g.addEdge(4, 6);
		
		g.dfsUtil(1);
	}

}
