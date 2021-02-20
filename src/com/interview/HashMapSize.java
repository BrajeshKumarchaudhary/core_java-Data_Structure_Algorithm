package com.interview;

import java.util.*;

public class HashMapSize {

	public static void main(String[] args) {
		final Map<E, Integer> map = new HashMap<>();
		map.put(new E(20, "Brajesh"), 2000);
		map.put(new E(20, "Brajesh"), 2000);
		map.put(new E(20, "Brajesh"), 2000);
		System.out.println(map.size());
	}

}

class E {
	private int age;
	private String name;

	public E(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
		return 0;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		E other = (E) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}

}
