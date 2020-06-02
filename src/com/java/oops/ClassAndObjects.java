package com.java.oops;
/*
 * Classes and Objects
 */
public class ClassAndObjects  {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {
      //Class
	 /*
      * A class is a user defined blueprint or prototype from which objects are created.
      *  It represents the set of properties or methods that are common to all objects of one type
      *  In general, class declarations can include these components, in order
      *  a.Modifiers : A class can be public or has default access.
      *  b.Class name: The name should begin with a initial letter (capitalized by convention).
      *  c.Superclass(if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends.
      *  d.Interfaces(if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements
      *  e.Body: The class body surrounded by braces, { }.
      */
	 //Object
    /*It is a basic unit of Object Oriented Programming and represents the real life entities.
     * An object consists of 
     * a.State : It is represented by attributes of an object. It also reflects the properties of an object.
     * b.Behavior : It is represented by methods of an object. It also reflects the response of an object with other objects.
     * c.Identity : It gives a unique name to an object and enables one object to interact with other objects.		
     */
		//Initializing an object
		//The new operator instantiates a class by allocating memory for a new object and returning a reference to that memory.
		Man m=new Man("Brajesh", 1, "Hindi", "Kanour");
		System.out.print(m);
		
	//Ways to create object of class
		//There are four ways to create objects in java
		//a.Using new keyword : It is the most common and general way to create object in java. Example:
		Man m1=new Man("Maneesh", 2,"Hindi", "JALOUN");
		
		//b.Using Class.forName(String className) method :
		Man m2=(Man)Class.forName("Man").newInstance();
		//c.Using clone() method: clone() method is present in Object class. It creates and returns a copy of the object
		Man m3=(Man) m.clone();
		
		//d.Deserialization : De-serialization is technique of reading an object from the saved state in a file
		//FileInputStream file = new FileInputStream(filename);
		//ObjectInputStream in = new ObjectInputStream(file);
		//Object obj = in.readObject();
		
		// Anonymous objects
		/*
		 *  Anonymous objects are the objects that are instantiated but are not stored in a reference variable.
		 *  They are used for immediate method calling.
		 *  They will be destroyed after method calling.
		 */
		
	}

}

//class Decalation

class Man implements Cloneable
{
	String name;
	int id;
	String language;
	String address;
	public Man(String name, int id, String language, String address) {
		super();
		this.name = name;
		this.id = id;
		this.language = language;
		this.address = address;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Man [name=" + name + ", id=" + id + ", language=" + language + ", address=" + address + "]";
	}
	
}
