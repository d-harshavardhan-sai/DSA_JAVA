package com.harshavardhan.Collections;

import java.util.ArrayList;
import java.util.Collections;

//Advantages of arraylist over vector
// saves space initially while creating instance - initial capacity
// synchronization -  If multi-threading, it handles all the threads multiples so that performance increases
// vector is a legacy class and arraylist is the latest class in the collections
// vector 100% capacity - arraylist 50%

public class ArrayListPractise {

	public static void main(String[] args) {
		ArrayList<Integer>  al1 = new ArrayList<>(); 
		// we cannot get capacity of arrayList
		// we can only get size
		System.out.println(al1.size()); // debug and see capacity - 0
	    al1.add(1);
	    System.out.println(al1.size()); // debug and see capacity - 10
	    al1.add(1);
	    al1.add(17);
	    al1.add(16);
	    al1.add(15);
	    al1.add(14);
	    al1.add(13);
	    al1.add(33);
	    al1.add(3);
	    al1.add(2);
	    System.out.println(al1.size()); // debug and see capacity - 10
	    al1.add(43);
	    System.out.println(al1.size()); // debug and see capacity - 15. 50% increased
	    al1.add(14);
	    al1.add(13);
	    al1.add(33);
	    al1.add(3);
	    al1.add(2);
	    System.out.println(al1.size()); // debug and see capacity - 22. 50% increased
        //	    all same as  vector
	    
	    //synchronization
	    Collections.synchronizedList(al1); // changes to synchronized list out of the box
	}

}


// ArrayList
//default capacity - 0          //capacity when elements are not added to the List. when instance is created
     // to save memory of jvm
//initial capacity - 10        //capacity while adding the elements
//allows duplicate elements -yes
//allows null values - yes
//it maintains insertion order             //Insertion and sorted order are always opposite
//it not maintains sorted order
//it offers the random access of elements
//it is not synchronized(takes threads multiple) // using collections class we can make it synchronized
//it is good data storing and retrieving and is not increasing exponentially