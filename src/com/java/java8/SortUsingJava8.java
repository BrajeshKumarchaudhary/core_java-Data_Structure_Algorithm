package com.java.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingJava8 {

	public static void main(String[] args) {

		List<Result> resultList = new ArrayList<Result>();
		resultList.add(new Result(12, "Nikhil"));
		resultList.add(new Result(13, "Jeetu"));
		Collections.sort(resultList, Comparator.comparing(Result::getName));
		resultList.sort((Result o1,Result o2)->{
			return o1.getName().compareTo(o2.getName());
		});
		resultList.forEach(n->{
			System.out.println(n.getName());
		});

	}

}

class Result {
	private int score;
	private String name;

	public Result(int score, String name) {
		super();
		this.score = score;
		this.name = name;
	}

	public int getScore() {
		return this.score;
	}

	public String getName() {
		return this.name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setName(String name) {
		this.name = name;
	}
}