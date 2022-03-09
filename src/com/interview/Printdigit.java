package com.interview;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Printdigit {

	public static void main(String[] args) {
             System.out.println("Is--"+isB(7));
	}

	public static boolean isB(int a) {

		if(a==0||a<0||a<10) {
			return false;
		}
		int temp = a;
		List<Integer> list = new LinkedList<>();
		int sum = 0;
		while (temp > 0) {
			int r = temp % 10;
			temp = temp / 10;
			sum = sum + r * r;
		}
		if (sum == 10) {
			return true;
		} else  {
		   return 	isB(sum);
		}

	}
}
