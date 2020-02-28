package com.java.ds;

import java.util.Scanner;

public class MyGraphMatrix {

	static int matrix[][];
	int V;
	MyGraphMatrix(int vertices)
	{
		V=vertices;
		matrix=new int [vertices][vertices];	
	}
	public static void addEdge(int source,int dest)
	{
		matrix[source][dest]=1;   //consider undirected graph
		matrix[dest][source]=1;
	}
	
	public  void pringGraph()
	{
		for(int i=0;i<this.V;i++) {
			for(int j=0;j<this.V;j++)
			{
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println("");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter th number of vertices");
		int v=sc.nextInt();
		MyGraphMatrix graph=new MyGraphMatrix(v);
		System.out.println("Enter th number of edges");
		int E=sc.nextInt();
		for(int i=0;i<E;i++)
		{
			System.out.println("Enter the source");
			int s=sc.nextInt();
			System.out.println("Enter the destination");
			int d=sc.nextInt();
			addEdge(s, d);
		}
		
		graph.pringGraph();
		
		
		
	}

}
