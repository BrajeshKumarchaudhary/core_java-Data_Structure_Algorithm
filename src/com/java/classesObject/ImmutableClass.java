package com.java.classesObject;

public final  class ImmutableClass {
        final int id;
        final  String name;

	public ImmutableClass(int id, String name) {
			this.id = id;
			this.name = name;
		}

	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ImmutableClass [id=" + id + ", name=" + name + "]";
	}


	public String getName() {
		return name;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Following are the requirements:

			*The class must be declared as final (So that child classes can’t be created)
			*Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
			A parameterized constructor
			*Getter method for all the variables in it
			*No setters(To not have the option to change the value of the instance variable)
			*/
		
		
		
		
	}

}



