package com.harshavardhan.Collections;

import java.util.Stack;

// stack same as vector - capacity 100% increasing
// vector - horizontal
// stack - vertical imagination(index down 0 to up increasing)
// stack - LIFO(Last In First Out)  queue - FIFO(First In First Out)
// Stack is a class in java which implements the List interface and extends the vector class and also which represents the LIFO principle

public class Stack1 {

	public static void main(String[] args) {
		// stack is created always empty stack, no initial or default capacity
		Stack<String> books = new Stack<>();
		books.add("red");
		books.add("white");
		books.add("black");
		books.add("red");
		System.out.println(books);
		// like all methods in vector
		
		//Special methods available in stack 
		//push - to add element LIFO
		books.push("yellow");
		books.push("orange");
		books.push("white");
		books.push("violet");
		books.push("indigo");
		books.push("purple");
		System.out.println(books);
		//search - index search from top to bottom(right to left) starting from 1
		System.out.println(books.search("white"));
		System.out.println(books.indexOf("white"));  // both are not same
		System.out.println(books.search("orange"));
		//peek - to see last element that we added
		System.out.println(books.peek());
		System.out.println(books); // it only sees the last element not remove the element
		//pop - to remove last element that we added
		books.pop();
		System.out.println(books);
		// verification empty() and isEmpty() are equal
		System.out.println(books.empty());  // comes from stack and sees - size 0 or not
		System.out.println(books.isEmpty());// comes from vector and sees - elementCount 0 or not

	}

}


// Stack 
//default capacity - 10    
//initial capacity - 10   
//allows duplicate elements -yes
//allows null values - yes
//it maintains insertion order             //Insertion and sorted order are always opposite
//it not maintains insertion order
//it offers the random access of elements // allowed but it is not recommended to use those methods. since stack has its four methods
//it is synchronized(takes threads one by one)
//it is good at scenarios of LIFO(ex: undo-redo, recursion, backend-forward, opening-closing brackets {})