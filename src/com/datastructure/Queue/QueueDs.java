package com.datastructure.Queue;

public class QueueDs {

	int capcity;
	int rear;
	int front;
	int size;
	int queue[];
	public void createQueue(int capacity) {
		queue=new int [capacity];
		this.capcity=capacity;
		this.size=0;
		this.front=this.rear=0;
	}
	
	public boolean  isFull()
	{
		return this.size==this.capcity;
	}
	
	public boolean  isEmpty()
	{
		return this.size==0;
	}
	
	public void addElement(int data) {
		if(isFull()) {
			return;
		}
		this.rear=(this.rear+1)%(this.capcity);
		queue[rear]=data;
		this.size++;
	}
	public int removeElement() {
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}
		this.front=(this.front+1)%(this.capcity);
		int  data=queue[front];
		this.size--;
		return data;
	}
	
	public int getFront() {
		return this.front;
	}
	
	public int getRear() {
		return this.rear;
	}
	
	public static void main(String[] args) {
		QueueDs queue=new QueueDs();
		queue.createQueue(25);
		queue.addElement(200);
		queue.addElement(300);
		queue.addElement(400);
		System.out.println("Rear is---"+queue.getRear());
		System.out.println("Value is---"+queue.removeElement());
		System.out.println("Rear is---"+queue.getRear());
		System.out.println("Value is---"+queue.removeElement());
		System.out.println("Front is---"+queue.getFront());
		System.out.println("Value is---"+queue.removeElement());
	}
	
}
