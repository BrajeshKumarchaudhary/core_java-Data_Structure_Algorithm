package com.datastructure.Graph;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author brajesh An adjacency list represents a graph as an array of linked
 *         lists. The index of the array represents a vertex and each element in
 *         its linked list represents the other vertices that form an edge with
 *         the vertex.
 *
 */
public class GraphUsingAdjacencyList {
	// Add edge
	private LinkedList<Integer> adj[];
	int v;

	GraphUsingAdjacencyList(int V) {
		v = V;
		adj = new LinkedList[v];
		for (int i = 0; i < V; i++) {
			adj[i] = new LinkedList();
		}
	}

	// Function to add an edge into the graph
	void addEdge(int s, int d) {
		adj[s].add(d);
	}

	static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
		am.get(s).add(d);
		am.get(d).add(s);
	}

	public static void main(String[] args) {
		// Creating a graph with 5 vertices
		int V = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

		for (int i = 0; i < V; i++)
			adj.add(new ArrayList<Integer>());

		// Adding edges one by one
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 4);
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 1, 4);
		addEdge(adj, 2, 3);
		addEdge(adj, 3, 4);
	}

}
