package com.java.advance;

public class GenricFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<String ,String> t1=new Test<>();
		 t1.setObj("brajesh");
		 t1.setObj2("Name");
		 System.out.println("--"+t1);
		 Test<Integer,String> t2=new Test<>();
		 t2.setObj(1);
		 t2.setObj2("Brajesh");
		 System.out.println("--"+t2);
		 t1.demo("bmbsajkjba");
	}

}

class Test<S,T>
{
	S obj;
	T obj2;
	public <U> void demo(U value)
	{
		System.out.println("Value is--"+value);
	}
	public S getObj() {
		return obj;
	}
	public void setObj(S obj) {
		this.obj = obj;
	}
	public T getObj2() {
		return obj2;
	}
	public void setObj2(T obj2) {
		this.obj2 = obj2;
	}
	@Override
	public String toString() {
		return "Test [obj=" + obj + ", obj2=" + obj2 + "]";
	}
	
	
}
