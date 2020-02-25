package com.java.Problem;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SOCKSolution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count=0;
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<n;i++)
     {
         if(map.containsKey(ar[i]))
         {
             int temp=map.get(ar[i]);
             map.put(ar[i],++temp);
         }
         else
         {
             map.put(ar[i],1);
         }
     }
    
     for (Integer i : map.keySet()) {
           count=count+map.get(i)/2;
        }

   return count;
 }
    

    public static void main(String[] args) throws IOException {
    	
    	int n=9;
    	int ar[]= {10,20,20,10,10,30,50,10,20};
    	System.out.println(sockMerchant(n,ar));
            }
}
