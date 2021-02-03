package com.java.Problem;

public class BlananceParemthsis {
     static int top=-1;
     static char item[]=new char[100];
     /*
      * basic algo
      * 
      * Declare a character stack S.
            Now traverse the expression string exp.
                If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
                       If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and if the popped character is the matching starting bracket then fine else parenthesis are not balanced.
              After complete traversal, if there is some starting bracket left in stack then “not balanced”
      * 
      * 
      * 
      * 
      * 
      * 
      */
     
     public static boolean checkBalance(char expr[])
     {
    	 for (int i = 0; i < expr.length; i++) {
    	  if((expr[i]=='(')|| (expr[i]=='{')||(expr[i]=='['))
    	  {
    		  
    		      			  push(expr[i]);
    	  }
    		  else if((expr[i]==')')|| (expr[i]=='}')||(expr[i]==']'))
    		  {
    			  if(isEmpty())
    			  {
    				  return false;
    			  }
    			  else if(!checkExpr(pop(),expr[i])) {
    			 return false;
    			  }
    		  } 
    					
		}
		if(isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
     }
     
     public static boolean checkExpr(char i1,char i2)
     {
    	 if((i1=='('&&i2==')'))
    	 {
    		 return true;
    	 }
    	 else if((i1=='['&&i2==']'))
    	 {
    		 return true;
    	 }
    	 else if((i1=='{'&&i2=='}'))
    	 {
    		 return true;
    	 }
    	 else
    	 {
    		 return false;
    	 }
     }
     
     
     
     public static  boolean isEmpty()
     {
    	 if(top==-1)
    	 return true;
    	 else
    		 return false;
     }
     public  static void push(char value)
     {
    	 
    	 if(top==99)
    	 {
    		 System.out.print("stack is full");
    	 }
    	 else
    	 {
    		 item[++top]=value;	 
    	 }
    	 
     }
     
     public  static char pop()
     {
    	 char b=item[top];
    	 if(top==-1)
    	 {
    		 System.out.print("Stack underflow");
    	 }
    	 else
    	 {
    	 top--;
    	 }
    	 return b;
     }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String expression="{()}";
   boolean flag =checkBalance(expression.toCharArray());
		if(flag)
		{
			System.out.print("Balanced");
		}
		else
		{
			System.out.print("not balanced");
		}
		
	}

}
