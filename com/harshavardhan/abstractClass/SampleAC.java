package com.harshavardhan.abstractClass;

public abstract class SampleAC implements ALaptop {
	public void copy() {
		System.out.println("copy code");
	}
	
	public void paste() {
		System.out.println("paste code");
	}
	
	// unimplemented methods must contain keyword abstract explicit
	public abstract void cut();
	
	public abstract void keyboard();
}
