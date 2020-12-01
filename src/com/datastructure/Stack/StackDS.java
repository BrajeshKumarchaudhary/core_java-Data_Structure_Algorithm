package com.datastructure.Stack;

import java.util.Arrays;

public class StackDS {
	private static final int  max_size=100;
	private static int top=0;
	private static int stack[];
	
	
	public void createStack() {
		stack=new int[max_size];
		top=-1;
	}
	public boolean isEmpty() {
		return top<0;
	}
	public boolean isFull() {
		return top==max_size-1;
	}
	public int pushData(int data) {
		if(isEmpty()&&!isFull()) {
			stack[++top]=data;
		}
		return top;
	}
	
	public int popElement() {
		int x=0;
		if(isEmpty()) {
			System.out.println("Stack is underflow");
		}else {
			 x=stack[top--];
		}
		return x;
	}
	
	public int peek() {
		int peek=0;
		if(isEmpty()) {
			System.out.println("Stack is underflow");
		}else {
			peek=stack[top];
		}
		return peek;
	}
	
	public int deleteStack() {
		stack=new int[max_size];
		top=-1;
		return top;
	}
	
	public boolean searchData(int data) {
		boolean flag=false;
		for (int i = 0; i < stack.length; i++) {
			if(stack[i]==data) {
				flag=true;
				break;
			}
		}
		return flag;
	}
}
