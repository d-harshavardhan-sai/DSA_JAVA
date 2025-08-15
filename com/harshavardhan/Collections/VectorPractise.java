package com.harshavardhan.Collections;

//import java.util.Vector; // Instead we can use java.util.*;

import java.util.*;

public class VectorPractise {

	public static void main(String[] args) {
		
		//creation of vector
		Vector v1 = new Vector();  // Vector is class. so we are creating a class
		//debug and mouse over on v1 to see that array is created and its default value is null. because object default value is null
		System.out.println(v1); //[] is output 
		
		//addition of values in vector
		v1.add("harsha");  // 1st element - capacity = 10 and size = 1
		v1.add("vardhan");
		v1.add("sai");
//		v1.add(0, "naveen");//at index 0. he want first position. so all values which are added before him with shifts a position right
//		v1.add("h1");
//		v1.add("h2");
//		v1.add("h3");
//		v1.add("h4");
//		v1.add("h5");
//		v1.add("h6"); // 10th element - capacity = 10 and size = 10
//		
//		// 100% incrementation
//		v1.add("h7"); // 11th element - capacity = 20 and size = 11
		
		Vector v2 = new Vector();
		v2.add("naveen");
		v2.add("amma");
		v2.add("daddy");
		
		System.out.println("intial v1: " +v1);
		System.out.println("intial v2: " +v2);
		
		// adding elements from vector v2 into vector v1
		//using for loop
//		for(int i = 0; i<v2.size(); i++) { // performance waste, extra code and iteration
//			v1.add(v2.get(i));
//		}
		
		//instead
//		v1.addAll(v2); // by default at last
//		v1.addAll(0, v2);  // from index 0
		v1.addAll(1, v2);  // from index 0
	
		System.out.println("after increment v1: " +v1);
		System.out.println("after v2: " +v2);
		
		//retrieving elements -get()
		System.out.println("index 4 element: " + v1.get(4));
		
		//deleting elements - remove() removeAll() clear()
		v1.remove(0); // if sysout gives element
		v1.remove("vardhan"); // if sysout give boolean as true if exist
		v1.removeAll(v2); // if sysout give booleam as true if exist
		System.out.println("after removing :" + v1);
		v1.add("harsha");
		v1.addAll(v2);
//		v1.addAll("vardhan", "sai"); // syntax error
		System.out.println("again adding v1: " + v1);
//		v1.removeAll("harsha", "sai"); //syntax error
		v1.clear(); // remove all elements from the vector
		System.out.println("v1 after clear(): " + v1);
		v1.addAll(v2);
		v1.add("harsha");
		v1.add("sai");
		System.out.println("again adding v1: " + v1);
		
		//verification of elements - contains() containsAll()
		System.out.println(v1.contains("harsha"));
		System.out.println(v1.contains(v2));  // false it is not correct method
		System.out.println(v1.containsAll(v2)); // true
//		System.out.println(v1.containsAll("harsha", "naveen"));//syntax error
		
		//Updating(replace an element) elements - set()
		v1.set(3, "harish");
		System.out.println(v1);
		
		System.out.println(v1.indexOf("harish")); // index of element
		v1.add("harish");
		System.out.println(v1);
		System.out.println(v1.indexOf("harish"));  // by default from first
		System.out.println(v1.lastIndexOf("harish")); // index of element from the last
		System.out.println(v1.firstElement()); // first value of the list
		System.out.println(v1.lastElement()); // last value of the list
		System.out.println(v1.isEmpty());   // return boolean 
		// to convert entire list to array and store it in variable arr
		Object[] arr = v1.toArray();
		System.out.println(Arrays.toString(arr));
		
		// we can also create vector with custom capacity
		Vector v3 = new Vector(20);
		v3.add("harsha");
		v3.add("naveen");
		System.out.println(v3);
		System.out.println(v3.size());  // size - 2
		System.out.println(v3.capacity()); // capacity - 20
		
		//we can directly add values into vector by creating array. and here the default capacity is size itself
		Object[] arr1 = new Object[] {3,4,2,6,8,9,10};
		Vector v4 = new Vector(Arrays.asList(arr1));
		System.out.println(v4);
		System.out.println(v4.size());  // size - 7
		System.out.println(v4.capacity()); // capacity - 7
		
		// About that yellow line
		// If we add a string value to the vector v4
		v4.add("harsha");
		System.out.println(v4);
		// for loop is used for retrieving the values in the collections
		//But If we don't know about adding a string value to the existing vector with integer, It shows error
		//Since String cannot converted to integer it got exception
//		int sum = 0;
//		for(int i = 0; i < v4.size(); i++) {
//			sum += (Integer)v4.get(i); // It changed to integer by type casted but it gets exception 
//		}
		//In order to overcome this issue java introduced generics concept
		// vector java 1.0
		// collections java 1.2
		// generics java 1.5 type specified in angular brackets after collection
		
		// In generics, only non-primitive data types are specified
		// Because, for primitive data types cannot create object and collection is a combination of objects 
//		Vector<Integer> v5 = new Vector<Integer>(); // left side specification is mandatory 
		Vector<Integer> v5 = new Vector<>();  // tells that v5 can stores only integer values
		// we can also add null values and duplicate values
		v5.add(null);
		v5.add(null);
		v5.add(5);
		System.out.println(v5);
		
//		// printing size and capacity
//		System.out.println("Size: " + v1.size());
//		System.out.println("Capacity: " + v1.capacity());
	}

}
// to overcome fixed length property in array
// Capacity = Array capacity
// Size = no of elements present in the list 
//we can add duplicate elements, null also
// default capacity of vector is 10.


//Vector
// default capacity - 10    //capacity when elements are not added to the Vector. when instance is created
// initial capacity - 10   //capacity while adding the elements
// allows duplicate elements -yes
// allows null values - yes
// it maintains insertion order             //Insertion and sorted order are always opposite
// it not maintains sorted order
// it offers the random access of elements
// it is synchronized(takes threads one by one)
// it is good at multi-threading or huge data is increasing exponentially
