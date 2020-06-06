## String
```text
     //What happened with these String
     /*
      *Here ,JVM create a String object and stores "Brajesh" in it.
      *observe that we are not using new operator to create String.We are using Assignment operator.
      *So after creating the String Object,JVM Uses a seperate block of memory which is called String constant pool.
      *and Strore Object there.
      */
	       String str14="Brajesh";
    //What Happened with Below Statement
      /*
       *When the below Statement is Executed by the JVM ,it searches in the String constant pool.
       *to know whether  the object with same content is avaialable there or not.
       *Since same object available there which is s14.
       *then JVM does not create another object.it simply create another reference of  s15 and copies the reference number of str14 to str15.
       *So Both String having same hashCode value.
       */
    //after concatenation
      concate(str14);//not change String due to property Immutable
		  System.out.println(str14);
		String str15="Brajesh";
		System.out.println(str14.hashCode()+"-----"+str15.hashCode());
		String str="Hello";
     /*
      *What Happened with this below statement
      *new operator is used to create the string object.In this case JVM always create new object with diffrenet hashCode.
      */
		String s11=new String("Hello");

```

## StringBuffer
```text
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
		     *a.length( ) and capacity( ): The length of a StringBuffer can be found by the length( ) method, while the total allocated capacity can be found by the capacity( ) method.
		     *b.append( ): It is used to add text at the end of the existence text. Here are a few of its forms:
		     *c.insert( ): It is used to insert text at the specified index position. These are a few of its forms:
		     *d.reverse( ): It can reverse the characters within a StringBuffer object using reverse( )
		     *e.StringBuffer replace(int startIndex, int endIndex, String str)
		     */

```

## StringBuilder

```text
     /*
      *The StringBuilder in Java represents a mutable sequence of characters
      *String Class in Java creates an immutable sequence of characters, the StringBuilder class provides an alternative to String Class, 
      */
     //StringBuilder Constructor
		//a.StringBuilder(): Constructs a string builder with no characters in it and an initial capacity of 16 characters.
		     StringBuilder str1=new StringBuilder();
		//b.StringBuilder(int capacity): Constructs a string builder with no characters in it and an initial capacity specified by the capacity argument.
		     StringBuilder str2=new StringBuilder(20);
		//c.StringBuilder(CharSequence seq): Constructs a string builder that contains the same characters as the specified CharSequence.
		     StringBuilder str=new StringBuilder("brajesh");
		//d.StringBuilder(String str): Constructs a string builder initialized to the contents of the specified string.
		     StringBuilder str3=new StringBuilder(str1);  


```

## StringTokenizer

```text
      /*
       *StringTokenizer class in Java is used to break a string into tokens.
       */
      //Constructor
		//a.StringTokenizer(String str):Considers default delimiters like new line, space, tab, 
		StringTokenizer str=new StringTokenizer(s);
		//b.StringTokenizer(String str, String delim) :delim is set of delimiters that are used to tokenize
		//the given string
		StringTokenizer str1=new StringTokenizer(s, " ");
		//c.StringTokenizer(String str, String delim, boolean flag):If the flag is false, delimiter characters serve to separate tokens
                //If the flag is true, delimiter characters are considered to be tokens
        StringTokenizer str3=new StringTokenizer(s, " ", true);
```

## String vs StringBuilder vs StringBuffer

```text
//When to use which one :
  /*a.If a string is going to remain constant throughout the program, then use String class object because a String object is immutable.
   *b.If a string can change (example: lots of logic and operations in the construction of the string) and will only be accessed from a single thread, using a StringBuilder is good enough.
   *c.If a string can change, and will be accessed from multiple threads, use a StringBuffer because StringBuffer is synchronous so you have thread-safety. 
   */

```



