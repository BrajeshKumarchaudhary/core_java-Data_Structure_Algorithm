package com.java.Problem;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> contact=new HashMap<>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            contact.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(contact.containsKey(s))
            {
                System.out.println(s+"="+contact.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}