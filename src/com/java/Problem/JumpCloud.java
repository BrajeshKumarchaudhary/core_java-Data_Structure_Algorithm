package com.java.Problem;

public class JumpCloud {
	static int jumpingOnClouds(int[] c) {
		int i = 0;
		int count = 0;
		int n = c.length;
		while (i < n) {
			if ((i + 1) == n - 1) {
				i = i + 1;
				count++;
				continue;
			}
			if ((i + 2) < n) {
				count++;
				if (c[i + 2] != 1)
					i = i + 2;
				else
					i = i + 1;
			} else
				break;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0 ,0 ,1 ,0 ,0 ,1 ,0};
		System.out.println(jumpingOnClouds(a));

	}

}
