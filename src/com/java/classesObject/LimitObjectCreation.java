package com.java.classesObject;

public class LimitObjectCreation {
public static void main(String[] args) {
	
	LimitObject object1=LimitObject.getInsatnce();
	LimitObject object2=LimitObject.getInsatnce();
	LimitObject object3=LimitObject.getInsatnce();
	LimitObject object4=LimitObject.getInsatnce();
	LimitObject object5=LimitObject.getInsatnce();
	System.out.println(object1);
	System.out.println(object2);
	System.out.println(object3);
	System.out.println(object4);
	System.out.println(object5);
}
}
class LimitObject
{
	private static int countObject=0;
	private static LimitObject instance=null;
	private LimitObject() {
		countObject++;
	}
	
	public static synchronized LimitObject  getInsatnce() {
		if(countObject<3) {
			instance=new LimitObject();
		}
		return instance;
	}
}
