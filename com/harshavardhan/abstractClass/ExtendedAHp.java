package com.harshavardhan.abstractClass;

public class ExtendedAHp extends AHp {

	public void copy() {
		System.out.println("extended copy code");
	}

	
	// override is not a mandatory keyword in java but
	/*	@override // it checks below point.
	public void copy(String s) {  // when we point copy() in User.java, it not points this method. since it is overloading
		System.out.println("extended vopy Hp");  
	 */
}

// go to User.java and create instance to call this method which overrides previous SampleAC.java copy() method