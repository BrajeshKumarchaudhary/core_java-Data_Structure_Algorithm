## Classes and Objects

```text
     //Class
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
      *It is a basic unit of Object Oriented Programming and represents the real life entities.
      *An object consists of 
      * a.State : It is represented by attributes of an object. It also reflects the properties of an object.
      *b.Behavior : It is represented by methods of an object. It also reflects the response of an object with other objects.
      *c.Identity : It gives a unique name to an object and enables one object to interact with other objects.		
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
		//Man m3=(Man)m.clone();
		
       //d.Deserialization : De-serialization is technique of reading an object from the saved state in a file
		//FileInputStream file = new FileInputStream(filename);
		//ObjectInputStream in = new ObjectInputStream(file);
		//Object obj = in.readObject();
		
	// Anonymous objects
	  *Anonymous objects are the objects that are instantiated but are not stored in a reference variable.
	  *They are used for immediate method calling.
	  *They will be destroyed after method calling.
```

---

## Encapsulation

```text
      *Encapsulation is defined as the wrapping up of data under a single unit. 
      *It is the mechanism that binds together code and the data it manipulates
      *Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class in which they are declared.
      *Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
      *

       //Advantages of Encapsulation:
	  /*
	   *a.Data Hiding: The user will have no idea about the inner implementation of the class.
	   *b.Increased Flexibility: We can make the variables of the class as read-only or write-only depending on our requirement.
	   *c.Reusability: Encapsulation also improves the re-usability and easy to change with new requirements
	   *d.Testing code is easy: Encapsulated code is easy to test for unit testing.
	   */

```
---

## Inheritance

```text
      *It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.
      *Super Class: The class whose features are inherited is known as super class(or a base class or a parent class).
      *Sub Class: The class that inherits the other class is known as sub class(or a derived class, extended class, or child class).
      *Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want,
      *The keyword used for inheritance is extends.
//Types of Inheritance in Java
       *a.Single Inheritance : In single inheritance, subclasses inherit the features of one superclass
       *b.Multilevel Inheritance : In Multilevel Inheritance, a derived class will be inheriting a base class and as well as the derived class also act as the base class to other
       *c.Hierarchical Inheritance : In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one sub class
       *d.Multiple Inheritance (Through Interfaces) : In Multiple inheritance ,one class can have more than one superclass and inherit features from all parent classes.
       *e.Hybrid Inheritance(Through Interfaces) : It is a mix of two or more of the above types of inheritance. Since java doesn’t support multiple inheritance with classes
       */
//Important facts about inheritance in Java
      /*
       *a.Default superclass: Except Object class, which has no superclass, every class has one and only one direct superclass (single inheritance). In the absence of any other explicit superclass, every class is implicitly a subclass of Object class.
       *b.Superclass can only be one: A superclass can have any number of subclasses. But a subclass can have only one superclass.
       *c.Private member inheritance: A subclass does not inherit the private members of its parent class. However, if the superclass has public or protected methods(like getters and setters) for accessing its private fields, these can also be used by the subclass.
       */
//What all can be done in a Subclass?
      /*
       *The inherited fields can be used directly, just like any other fields
       *We can declare new fields in the subclass that are not in the superclass.
       *The inherited methods can be used directly as they are.

```

##  Abstraction
```text
      /*
       *Show the functionalities and hide the complexity
       *In java, abstraction is achieved by interfaces and abstract classes.
       */
		
       //Abstract classes and Abstract methods :
      /*
       *An abstract class is a class that is declared with abstract keyword.
       *An abstract method is a method that is declared without an implementation.
       *An abstract class may or may not have all abstract methods. Some of them can be concrete methods
       *A method defined abstract must always be redefined in the subclass,thus making overriding compulsory OR either make subclass itself abstract.
       *Any class that contains one or more abstract methods must also be declared with abstract keyword.
       *There can be no object of an abstract class.That is, an abstract class can not be directly instantiated with the new operator.
       *An abstract class can have parametrized constructors and default constructor is always present in an abstract class.
       */
      //Advantages of Abstraction
      /*
       *It reduces the complexity of viewing the things.
       *Avoids code duplication and increases reusability.
       *Helps to increase security of an application or program as only important details are provided to the user.
       */
   > Interface
```text

 *Interfaces specify what a class must do and not how. It is the blueprint of the class.
 *So it specifies a set of methods that the class has to implement.
 *If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract
  */
//Why do we use interface 
/*
 *It is used to achieve total abstraction.
 *Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance .
 */
//New features added in interfaces in JDK 9
 *Static methods
 *Private methods
 *Private Static methods
 */

```
---

## Polymorphism

```text
      *one name and many form
      *In Java polymorphism is mainly divided into two types:
      *a.Compile time Polymorphism
      *b.Runtime Polymorphism
      */
      //Compile time Polymorphism
     /*
      *It is also known as static polymorphism.
      *This type of polymorphism is achieved by function overloading 
      *When there are multiple functions with same name but different parameters then these functions are said to be overloaded.
      */
    //Runtime polymorphism:
      /*
       *It is also known as Dynamic Method Dispatch.
       *It is a process in which a function call to the overridden method is resolved at Runtime
       *This type of polymorphism is achieved by Method Overriding.
       */

```

---


