package com.interview;

public class InterFaceDemo implements I1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I1 obj=new InterFaceDemo();
		obj.disPlay();
		obj.d();
	}

	@Override
	public void disPlay() {
          System.out.println("I m called");		
	}

	//If Both InterFace have same Default function then need to override one of them
	
	@Override
	public void d() {
		// TODO Auto-generated method stub
//		I2.super.d();
		System.out.println("I m default Method");
	}
}
