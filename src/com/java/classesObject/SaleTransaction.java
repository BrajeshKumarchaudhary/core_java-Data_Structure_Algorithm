package com.java.classesObject;

public abstract class SaleTransaction {
   public abstract void doTxn();
   private void logMessage(String str) {
	   System.out.println(str);
   }
   
}
