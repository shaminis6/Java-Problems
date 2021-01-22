package com.practice.Graphs;

import java.util.LinkedList;
import java.util.List;

public class Graph {
	
	int vertex;
	List<Integer> adj[];
	
	Graph(int v)
	{
		this.vertex = v;
		this.adj = new LinkedList[v+1];
		
		for(int i=0;i<v;i++)
		{
			adj[i]= new LinkedList<>();
		}
	}
	
	void addEdge(int v,int w)
	{
		adj[v].add(w);
		adj[w].add(v);
	}
	
	void dfsUtil(int v)
	{
	  boolean visited[]= new boolean[vertex];
	  
	  // do a DFS from vertex v
	 
	  dfs(visited,v);
	}
	
	void dfs(boolean visited[],int i)
	{
		visited[i]=true;
		System.out.print(i+ " ");
		// Iterate through every edges
		for(int node:adj[i])
		{
			if(!visited[node])
			{
				dfs(visited,node);
			}
		}
	}

}
