package com.harshavardhan.inheritance;

public class User {

	public static void main(String[] args) {
		Guest guest = new Guest();
		guest.read();  // Guest has only read() method
		
		Developer dev = new Developer();
		// has both read() and write() method
		dev.read(); // from Guest
		dev.write();// from Developer
		
		Admin admin = new Admin();
		admin.read();  // from Guest
		admin.write(); // from Developer
		admin.manage();// from Admin
		

	}

}
