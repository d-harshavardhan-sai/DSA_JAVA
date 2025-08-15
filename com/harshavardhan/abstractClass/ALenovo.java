package com.harshavardhan.abstractClass;

public class ALenovo extends SampleAC{

	@Override
	public void cut() {
		System.out.println("lenovo cut code");
		
	}

	@Override
	public void keyboard() {
		System.out.println("lenovo keyboard code");
		
	}
	
	// when abstract class is inherited, we can also add some extra methods in it.
	public void printing() {
		System.out.println("hp printing code");
	}
	
	
}
