package com.datastructure.Graph;

import java.util.LinkedList;

public class WeightedGraph {
	public static void main(String[] args) {

		int v=6;
		Graph graph=new Graph(v);
		graph.addEdge(0,1,4);
		graph.addEdge(0,2,3);
		graph.addEdge(1 ,3,2);
		graph.addEdge(1 ,2,5);
		graph.addEdge(2 ,3,7);
		graph.addEdge(3 ,4,2);
		graph.addEdge(4 ,0,4);
		graph.addEdge(4 ,1,4);
		graph.addEdge(4 ,5,6);
		graph.printGraph();
		
		
		
	}
}
class Graph{
	private LinkedList<Edge> adj[];
	int v;
	
	Graph(int v){
		this.v=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<>();
		}
	}
	
	public void addEdge(int source,int dest,int weight) {
		Edge edge=new Edge();
		edge.setDest(dest);
		edge.setSource(source);
		edge.setWeight(weight);
		adj[source].addFirst(edge);
	}
	
	
	public void printGraph() {
		for(int i=0;i<v;i++) {
			LinkedList<Edge> list=adj[i];
			for(int j=0;j<list.size();j++) {
				System.out.println("Vertex of "+i+" is connected to "+list.get(j).getDest()+" and weight is "+list.get(j).getWeight());
			}
		}
	}
}

class Edge{
	int source;
	int dest;
	int weight;
	public int getSource() {
		return source;
	}
	public void setSource(int source) {
		this.source = source;
	}
	public int getDest() {
		return dest;
	}
	public void setDest(int dest) {
		this.dest = dest;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
