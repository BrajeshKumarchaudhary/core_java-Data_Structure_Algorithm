package com.java.classesObject;

public interface SaleTxn {

	static void initTxn() {
		System.out.println("Txn initiated Successfull");
	}

	abstract void doTxn();

   static void updateTxnStatus(String str) {
		System.out.println("Txn updated Successfull");
	}

	default void logTxn(String str) {
		System.out.println("Txn log Successfull");
	}
}
