package com.java.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutersService {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		  ExecutorService service=Executors.newFixedThreadPool(10);
//		  service.execute(new PrintSTMT("Yes Performing task--"));
//		  service.execute(new PrintSTMT("Yes Performing task--"));
//		  Runnable job=()->{
//			  System.out.println("ooojjjjj");
//		  };
//		  service.execute(job);
//		  Thread t1=new Thread(job);
//		  service.execute(t1);
//		  service.shutdown();
		  
		  
		  //Future keyword is used to hold the returning value.
		  
		  Future<String> value=service.submit(new PrintWithReturn("Yes I am going"));
		  System.out.println(value.get());
		  service.shutdown();
		
	}

}

class PrintSTMT implements Runnable{
	String message;
	 public PrintSTMT(String message) {
	this.message=message;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(300);
			System.out.println(message);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

//When working with that condition need return value from thread then implements callable interface and override call method.
class PrintWithReturn implements Callable<String>{

	String message;
	public PrintWithReturn(String mesage) {
		this.message=mesage;
	}
	@Override
	public String call() throws Exception {
	     return message+" I m returning value";
	}
}

