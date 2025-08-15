package com.harshavardhan.inheritance;


public interface IAdmin extends IGuest, IDeveloper{ // //Multiple Inheritance
	public void manage();
}
