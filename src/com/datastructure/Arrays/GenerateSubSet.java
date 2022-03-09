package com.datastructure.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GenerateSubSet {

	static List<List<Integer>> subset=new LinkedList<>();
	static List<Integer> sublist=new LinkedList<Integer>();
	
	public static void generateSubset(List<Integer> nums) {
        subsetsHelper(subset, new ArrayList<>(), nums, 0);
		
		
	}
	private static void subsetsHelper(List<List<Integer>> list , List<Integer> resultList,  List<Integer> nums, int start){
        list.add(new ArrayList<>(resultList));
        for(int i = start; i < nums.size(); i++){
           // add element
            resultList.add(nums.get(i));
           // Explore
            subsetsHelper(list, resultList, nums, i + 1);
           // remove
            resultList.remove(resultList.size() - 1);
        }
    }
	public static void main(String[] args) {
      List<Integer> inputList=Arrays.asList(1,2,3);
//      System.out.println(inputList.stream().mapToInt(n->n).sum());
//      System.out.println(inputList.size());
      generateSubset(inputList);
      //print list.
      subset.forEach(n->{
    	  System.out.println(n);
      });
	}

}
