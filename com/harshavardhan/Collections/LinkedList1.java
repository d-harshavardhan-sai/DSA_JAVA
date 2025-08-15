package com.harshavardhan.Collections;

import java.util.*;

//LinkedList
//same 6 methods
//object created - node object
//node- 3 compartments
//1-previous node address
//2-item/data
//3-next node address


public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> ll1 = new LinkedList<>();
		//or we can write List<Integer> l1 = new LinkedList<>() and only l1 object only uses List tye of methods since it won't extends deque import java.util.*;
		//we cannot create a LinkedList by specifying the size
		ll1.add("y1");
		System.out.println(ll1); //size - 1 
		ll1.add("y2");
		ll1.add("y3");
		ll1.add("y4");
		ll1.add(0,"y5");
		System.out.println(ll1);
		//we can also add collections like arrayList in the LinkedList using addAll
		ArrayList<String> al = new ArrayList<>();
		al.add("y6");
		al.add("y7");
		al.add("y8");
		ll1.addAll(al);
		System.out.println(ll1);
		ll1.addAll(0,al);
		System.out.println(ll1);
		ll1.remove(1);
		System.out.println(ll1);
		ll1.clear();//setting first node and last node as null
		System.out.println(ll1);
		//as like remaining methods in vector
		
		
		//synchronization
	    Collections.synchronizedList(ll1); // changes to synchronized list out of the box
	    
		//for loop
	    for(String s : ll1) {
	    	System.out.println(s);
	    }

	}

}

// LinkiedList
//default capacity - 0    
//initial capacity - 0   
//allows duplicate elements -yes
//allows null values - yes
//it maintains insertion order             //Insertion and sorted order are always opposite
//it not maintains insertion order
//it offers the random access of elements
//it is synchronized when we use it out of box // using collections class we can make it synchronized
//it is good at data manipulation middle access of elements


//LinkedList - 2 types(singly and doubly)
// in java only doubly is used.
