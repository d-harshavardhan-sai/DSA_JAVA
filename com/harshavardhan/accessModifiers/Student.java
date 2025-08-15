package com.harshavardhan.accessModifiers;

//Access modifiers defines the scope/visibility or restriction level of the members of the class(variables(atributes), methods(functions), constructors)

//for differentiating scopes(projects, class, packages) for members

//           class  package  subclass  outside
//public       Y       Y        Y        Y
//private      Y       N        N        N
//default      Y       Y        N        N
//protected    Y       Y        Y*       N*

//* Subclass outside package: Can access via inheritance, not through object

public class Student {
	public int rollNo = 101;

	public Student() {
		rollNo = 102;
	}

	public void printRollNumber() {
		System.out.println(rollNo);
	}
}

// public - fields can access anywhere within class/ another class in same package/ another class in another package/ Sub class in same or different packages.
// private - only within the class only
// default(no method/package private) - fields can access only in same package, same class, SubClassSamePack(inheritance), not in subClass of different package
// protected - can access in same class, different class in same package, and SubClassSamePack(only through inheritance) also, but not in another package except inherited class 

// class can never be private, protected
// class, variable, constructor, method can be a default