package com.harshavardhan.Collections;

import java.util.HashSet;
import java.util.TreeSet;


public class Set1 {

	public static void main(String[] args) {
		//set - has 3 implementations
		//uses Map internally to store data - Map uses array of nodes(key, value) internally to store data
		//Creation
		HashSet<Integer> hs = new HashSet<>(); 
		//uses Hashmap internally to store data - Hashmap uses array of nodes(key, value) internally to store data
		//open and see on Hashset
		System.out.println(hs);

		//Addition  -  add()
		hs.add(10);
		hs.add(89);
		hs.add(222);
		hs.add(54);
		hs.add(9587);
		System.out.println(hs); //stored in random order for the viewers neither sorted nor inserted order
		hs.add(10);
		System.out.println(hs); //no duplicates allowed
		//things that we are add are keys not values
		//by default values are dummy objects
		new Object();//dummy object
		//Hashmap is used by Hashset internally
		//debug and watch the scenario

		//deletion  - remove()
		hs.remove(54);  //it is value not index
		System.out.println(hs);

		//verification  - contains()
		System.out.println(hs.contains(222));

		//retrieval  
		//for-each loop
		for(Integer elements : hs) {
			System.out.println(elements);
		}

		hs.clear();
		System.out.println(hs);
		System.out.println(hs.isEmpty());

		//LinkedHashset
		//uses LinkedHashmap internally to store data - LinkedHashmap uses link of nodes(key, value) internally to store data
		//Implement using LinkedHashset - all methods same but,
		//linkedHashset internal implementation is LinkedHashmap
		//It follows insertion order - difference

		//Treeset
		//uses TreeMap internally to store data - TreeMap uses link of nodes(key, value) internally to store data
		//Implement using Treeset - all methods same but,
		//Treeset internal implementation is TreeMap
		//It follows Sorted(ascending) order - difference
		//additional methods of Treesets
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(56);
		ts.add(6);
		ts.add(156);
		ts.add(526);
		ts.add(563);
		System.out.println(ts);
		
		System.out.println(ts.first()); //prints lowest element value
		System.out.println(ts.last());//prints highest element values
		System.out.println(ts.pollFirst()); //removes lowest element value
		System.out.println(ts);
		System.out.println(ts.pollLast()); //removes highest element value
		System.out.println(ts);
		
		//retrieve as subset
		System.out.println(ts.subSet(56, 526)); //retrieve subset in the range of those elements left is included and right is excluded
		System.out.println(ts);
		System.out.println(ts.subSet(56, 526).remove(156)); //removes that values
		System.out.println(ts);
		System.out.println(ts.descendingSet());//order changes to descending order
		
	}

}

//Set
//Non-duplicative and unique data only allowed
//