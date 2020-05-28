package com.java.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String,Integer> map=new HashMap<>();
        map.put("Brahjese", 1);
        map.put("Br", 2);
        map.put("Bjese", 3);
        map.entrySet().stream().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
        
	}

}
