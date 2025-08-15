package com.harshavardhan.accessModifiers;

public class SubClassSamePack extends Student {
	
	public void test() {
		System.out.println(rollNo);
		printRollNumber();
	}
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.rollNo);
		s.printRollNumber();
		
		new SubClassSamePack().test();
	}
}
