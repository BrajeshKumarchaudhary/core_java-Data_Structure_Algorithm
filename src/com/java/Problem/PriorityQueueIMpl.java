package com.java.Problem;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueIMpl {
public static void main(String[] args) {
	JobMan obj=new JobMan(20,"brajesh","Kanpur");
	JobMan obj1=new JobMan(22,"brajesh","Kanpur");
	JobMan obj2=new JobMan(19,"brajesh","Kanpur");
	JobMan obj3=new JobMan(87,"brajesh","Kanpur");
	PriorityQueue<JobMan> list=new PriorityQueue<>(new AgeComparator());
	list.add(obj);
	list.add(obj1);
	list.add(obj2);
	list.add(obj3);
	while(!list.isEmpty()) {
		System.out.println(list.poll().getAge());	
	}
}
}

class AgeComparator implements Comparator<JobMan>{

	@Override
	public int compare(JobMan o1, JobMan o2) {
		if(o1.getAge()>=o2.getAge()) {
			return -1;
		}else {
			return 1;
		}
	}
	
}

class JobMan {
	private int age;
	private String name;
	private String addr;
	
	public void JobMan() {
		
	}
	
	public  JobMan(int age,String name,String addr) {
		this.age=age;
		this.name=name;
		this.addr=addr;
	}
	public void setAge(int a) {
		this.age=a;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAddr(String addr) {
		this.addr=addr;
	}
	public String getAddr() {
		return this.addr;
	}

//	@Override
//	public int compare(JobMan o1, JobMan o2) {
//		
//	}
	
	
}
