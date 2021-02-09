package com.java.Problem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class StringPattern {

	private static Map<Character, Queue<Integer>> positionMap = new LinkedHashMap<Character, Queue<Integer>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainStringg = "abcdefghiiijklmnopqrstuvwxyzakjafjmafanlakfkkndfkfndmvzvjnvnvjggfdgfhhtqiiddnmdkdjjfdkfofdpfnbjbjsjsjsbhhhgfffff";
		String secondStr = "i m right i";
		printPos(mainStringg, secondStr);

	}

	public static void printPos(String mainstr, String secondstr) {
		char mainArr[] = mainstr.toCharArray();
		char secondArr[] = secondstr.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < mainArr.length; i++) {
			if (positionMap.containsKey(mainArr[i])) {
				Queue eq = positionMap.get(mainArr[i]);
				eq.add(i);
				positionMap.put(mainArr[i], eq);
			} else {
				Queue<Integer> q = new LinkedList<Integer>();
				q.add(i);
				positionMap.put(mainArr[i], q);
			}
		}
		for (int i = 0; i < secondArr.length; i++) {
			char c=secondArr[i];
			if(!Character.isSpace(c)) {
				if (positionMap.containsKey(secondArr[i])) {
				Queue eq = positionMap.get(secondArr[i]);
				if (!eq.isEmpty()) {
					int p=(int) eq.poll();
					System.out.println(secondArr[i] + "-" +p);
				} else {
					System.out.println(secondArr[i] + "-" + " No");
				}
			}
			}else {
				System.out.println(" ");
			}
		}
	}

}
