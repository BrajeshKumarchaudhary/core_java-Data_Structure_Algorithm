package com.java.classesObject;

public class Sale implements SaleTxn {

	public static void main(String[] args) {
          SaleTxn.initTxn();
          SaleTxn object=new Sale();
          object.doTxn();
          SaleTxn.updateTxnStatus("Success");
          object.logTxn("Success");
	}

	@Override
	public void doTxn() {
		
	}

}
