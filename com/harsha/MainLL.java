package com.harsha;

public class MainLL {

	public static void main(String[] args) {
		LL obj = new LL();
		obj.insertFirst(12);
		obj.insertLast(15);
		obj.insertFirst(23);
		obj.insertLast(32);
		obj.insert(46, 2);
		obj.display();
	}

}
