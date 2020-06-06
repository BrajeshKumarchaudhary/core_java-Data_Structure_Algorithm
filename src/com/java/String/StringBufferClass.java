package com.java.String;
/*
 * StringBuffer Class 
 */
public class StringBufferClass {

	public static void main(String[] args) {
		/*
		 *StringBuffer is a peer class of String that provides much of the functionality of strings.
		 *String represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences.
		 *String buffers are safe for use by multiple threads. The methods can be synchronized wherever necessary so that all the operations on any particular instance behave as if they occur in some serial order.
		 */
		//StringBuffer Constructors
		//a.StringBuffer( ): It default room for 16 characters without reallocation.
		    StringBuffer str1=new StringBuffer();
		//b.StringBuffer( int size)It accepts an integer argument that explicitly sets the size of the buffer.    
		    StringBuffer str2=new StringBuffer(30);
		//c.StringBuffer(String str): It accepts a String argument that sets the initial contents of the StringBuffer object and reserves room for 16 more characters without reallocation.
		    StringBuffer str=new StringBuffer("Brajesh Kumar");
		 
		//Methods
		    /*
		     * a.length( ) and capacity( ): The length of a StringBuffer can be found by the length( ) method, while the total allocated capacity can be found by the capacity( ) method.
		     *b.append( ): It is used to add text at the end of the existence text. Here are a few of its forms:
		     *c.insert( ): It is used to insert text at the specified index position. These are a few of its forms:
		     *d.reverse( ): It can reverse the characters within a StringBuffer object using reverse( )
		     *e.StringBuffer replace(int startIndex, int endIndex, String str)
		     */
		       str.append("Chaudhary");
		       System.out.println(str.reverse());
		    System.out.println(str.capacity());

	}

}
