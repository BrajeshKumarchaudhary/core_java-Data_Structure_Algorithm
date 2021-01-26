package com.datastructure.Graph;

import java.util.Scanner;

/**
 * @author brajesh 
 * PROBLEM: You have been given an undirected graph consisting
 *         of N nodes and M edges. This graph can consist of self-loops as well
 *         as multiple edges. In addition , you have also been given Q queries.
 *         For each query , you shall be given 2 integers A and B. You just need
 *         to find if there exists an edge between node A and node B. If yes,
 *         print "YES" (without quotes) else , print "NO"(without quotes).
 *
 *INPUT:  The first line consist of 2 integers N and M denoting the
 *         number of nodes and edges respectively. Each of the next M lines
 *         consist of 2 integers A and B denoting an undirected edge between
 *         node A and B. The next line contains a single integer Q denoting the
 *         number of queries. The next Line contains 2 integers A and B denoting
 *         the details of the query.
 * 
 *
 */
public class Problem1 {

	int graph[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of nodes");
		int N = sc.nextInt();
		System.out.println("Enter ths number of edges");
		int M = sc.nextInt();
		if (M != N - 1) {
			System.out.println("Invalid Number of Edges");
			System.exit(1);
		}

		Problem1 object = new Problem1();
		object.initializeGraph(N);

		// Take Input of Edges
		for (int i = 0; i < M; i++) {
			System.out.println("Enter the source");
			int source = sc.nextInt();
			System.out.println("Enter the Destination");
			int dest = sc.nextInt();
			object.addEdge(source, dest);
		}
		System.out.println("Number of Query---");
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int s1 = sc.nextInt();
			int dest1 = sc.nextInt();
			object.checkExists(s1, dest1);
		}

	}

	private void checkExists(int s1, int dest1) {
		if (graph[s1][dest1] != 0) {
			System.out.println("Edge exists between " + s1 + " and " + dest1);
		}
		else {
			System.out.println("Edge does not exists between " + s1 + " and " + dest1);
		}
	}

	private void addEdge(int source, int dest) {
		graph[source][dest] = 1;
		graph[dest][source] = 1;
	}

	private void initializeGraph(int N) {
		graph = new int[N][N];
//		for(int i=0;i<N;i++) {
//			for(int j=0;j<N;j++) {
//				graph[i][j]=0;
//			}
//		}
	}
}
