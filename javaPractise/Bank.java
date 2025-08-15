package javaPractise;

/**
 * This class is used for performing operations on Bank accounts
 * 
 * @author harsh
 * 
 * @version 1.0.0.6
 */
public class Bank {
/**
 *  This variable contains value of the current balance in the bank account
*/
	static int currentBalance = 10000;
	
	public static void greetings() {                         //static method no need to create object to call. Directly can be called in main method
		System.out.println("Hello, welcome to Indian Bank");
	}
	public void deposit(int amount) {                        //non-static method - a reference/instance/object is created in main method to access the data
		currentBalance = currentBalance + amount;
		System.out.println("the amount deposited is sucessfull");
	}
/**
* @param amount to be withdraw
*/
	public static void withdrawl(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("the amount is withdrawn is successfull");
	}
/**
 * This method is used for getting current balance of the bank account
 * 
 * @return gets the current balance of the bank account
 */
	
	public int getCurrentBalance() {          //it is a return type so void is changed to int data type. Here void is not a data type. it is a reserved keyword in java
		return currentBalance;
	}
	
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		greetings();
		System.out.println("Current balance is: " + bank.getCurrentBalance());
		bank.deposit(2000);
		System.out.println("Current balance is: " + bank.getCurrentBalance());
		withdrawl(3000);
		System.out.println("Current balance is: " + bank.getCurrentBalance());
	}
}
