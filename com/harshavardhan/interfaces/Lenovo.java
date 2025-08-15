package com.harshavardhan.interfaces;

public class Lenovo implements Laptop {

	@Override
	public void copy() {
		System.out.println("Lenovo copy code");

	}

	@Override
	public void paste() {
		System.out.println("Lenovo paste code");

	}

	@Override
	public void cut() {
		System.out.println("Lenovo cut code");

	}

	@Override
	public void keyboard() {
		System.out.println("Lenovo paste code");

	}

	public void capture() {
		System.out.println("Lenovo camera code");

	}
	@Override
	public void security() {
		System.out.println("Lenovo security code");
	}


}

// every class is interface implementer.
//@override is not mandatory but check by adding methods and without implements
// every Interface method must implement in class - overrides