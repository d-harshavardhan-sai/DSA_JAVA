package com.harshavardhan.Collections;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Queue1 {

	public static void main(String[] args) {
		//Creation of Priority Queue
		//In integers lowest number is highest priority
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		//Addition -  offer(), add(), addAll()
		pq.offer(8);
		pq.offer(5);
		pq.add(7);
		pq.offer(1);
		System.out.println(pq);
		
		//Retrieval - peek()  only head element is seen
		System.out.println(pq.peek());
		System.out.println(pq);
		//if no element is added then null is retrieved
		//because, in queue object type of array is implemented so default value of object null is retrieved 
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		System.out.println(pq1.peek());
		System.out.println();
		
		//Deleting  -  poll()  remove()
		//watch which is coming to head - highest priority
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		
		// for an empty queue
		System.out.println(pq1.poll());// prints null but
        //pq1.remove(); //throws exception for empty queue
		
		
		
		//verification - contains()
		System.out.println(pq.contains(1));
		
		//removing all elements from the queue  -  clear()
		pq.clear();
		System.out.println(pq);
		System.out.println();
		
		pq.offer(8);
		pq.offer(5);
		pq.add(7);
		pq.offer(1);
		
		//Now I want to retrieve all elements in the queue
		//We can do this by using for loop. 
		for(Integer integer : pq) {
			System.out.println(integer);
		}
		System.out.println();
		//But in case of priority queue, there is problem.
		//Elements will be retrieved according to which they are added and not based on priority
		//And we want only priority elements
		//So to overcome this we use only - peek() poll() remove() methods only
		//use while loop
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		//reversing priority using comparator
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
		pq2.offer(8);
		pq2.offer(5);
		pq2.add(7);
		pq2.offer(1);
		
		System.out.println(pq2);
		
		while(!pq2.isEmpty()) {
			System.out.println(pq2.poll());
		}
		
		//ArrayDeque
		
		//Creation of ArrayDeque
		ArrayDeque<String> ad = new ArrayDeque<>();
		//double ended queues - ArrayQueue and LinkedList
		//default size is 17
		//head is index 0, and tail is 16
		//Two way both addition and deletion and also retrieval can be done at both ends
		///no priority - follows insertion order 
		
		//Addition - offer, offerFirst, offerLast, add, addFirst, addLast, addAll
		ad.add("hars");
		ad.add("nav"); //adding last
		ad.offer("sai");//adding last
		ad.addFirst("sha");//adding first
		ad.offerFirst("var");//adding first
		ad.addLast("tar");//adding last
		ad.offerLast("raj");//adding last
		System.out.println(ad);
		
		//retrieval - peek, peekFirst, peekLast
		System.out.println(ad.peek()); //sees first element but not remove
		System.out.println(ad);
		System.out.println(ad.peekFirst()); //sees first element but not remove
		System.out.println(ad);
		System.out.println(ad.peekLast()); //sees last element but not remove
		System.out.println(ad);
		
		//deletion - poll, pollFirst, pollLast, remove, removeFist, removeLast
		//same as above and remove with empty throws exception
		
		//same as for LinkedList
	}

}


//To full fill FIFO Principle - java introduced queue
//Queue  
//an interface, provided by collection framework
//default size is 11
//head is index 0, and tail is 10
//One way - addition at tail and deletion at head
//highest priority is stored in head and adding is not sorted
//highest priority is removed first so first in first out(FIFO)
//

//Priority queue
//default capacity - 11    
//initial capacity - 11   
//allows duplicate elements -yes
//allows null values - no
//it not maintains sorted order             
//it not maintains insertion order
//it not offers the random access of elements
//it is not synchronized
//it is good at priority based retrieving

//table screen shot