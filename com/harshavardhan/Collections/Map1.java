package com.harshavardhan.Collections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		
		
		
		//Major Operations

		//Creation of a map
		Map<Integer, String> m = new Hashtable<>();
		
		//Addition of elements into the map
		m.put(500050, "Hyderabad");
		m.put(530001, "Vizag");
		m.put(520001, "Vijayawada");
		m.put(110000, "Delhi");
		m.put(700001, "Kolkota");
		System.out.println(m);
		System.out.println();

		//Retrieval of keys from the map
		Set<Integer> keys = m.keySet(); //we created set object since to retrieve values map used keyset() method
		for (Integer key : keys) {
			System.out.println(key);
		}
		System.out.println();
		
		//Retrieval of values from the map
		Collection<String> values = m.values();
		for (String value : values) {
			System.out.println(value);
		}
		System.out.println();
		
		//Retrieval of value from the map based on key
		System.out.println(m.get(530001));
		System.out.println();
		
		//Retrieval of all value from the map based on all keys
		for (Integer key : keys) {
			System.out.println(key + ">>>" + m.get(key));
		}
		System.out.println();
		
		//Deletion of elements from the map
		m.remove(520001);
		m.remove(530001, "Vizag");
		System.out.println(m);
		System.out.println();

		//Verification of keys in the map
		System.out.println(m.containsKey(700001));
		System.out.println();
		
		//Verification of values in the map
		System.out.println(m.containsValue("Hyderabad"));
		System.out.println();

		//Updation of elements in the map
		m.put(123456, "harsha");
		System.out.println(m);
		System.out.println();
		m.put(123456, "naveen"); //overrides
		System.out.println(m);
		//replace() method also
		m.replace(123456, "naveen", "sai");
		System.out.println(m);
		//a problem arises while inserting values, if already the key exists
		m.putIfAbsent(123456, "sai");
		System.out.println(m); // checks and adds
		System.out.println();
		
		//another operations
		//Entry<key,value> iteration - Entry is a class used to retrieve values using entries
		//difference
		//In keySet only keys present not values, and we have to retrieve values using that key
		//But in Entry, entries present where it have both key and value
		Set<Entry<Integer, String>> entries = m.entrySet();
		for(Entry<Integer, String> entry : entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ">>>>" + value);
		}
		//size
		System.out.println(m.size());
		m.clear();
		System.out.println(m);
	}

}

//Map is an interface, provided by collection framework
//List is not used for every scenario
//In list, vector, linked list, stack retrieving values by using index and any loop takes more task
//entire list has to iterated, performance degraded.
//For above problem we use Map(key and reference based retrieving) - retrieving by using reference of that particular value instead of index
//Map is an interface, objects cannot be created of the type map. We always need a class that extends this map in order to create an object.
//Map is implemented by 4 classes - in diagram
