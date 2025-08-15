package javaPractise;

public class objectCreate {
	int x = 5;
	String fName = "harshavardhan sai";
	String lName = "divvala";
	int age = 19;
	public static void myMethod1() {
		System.out.println("harshavardhan is unlucky");
	}
	public void myMethod2(String bike) {
		System.out.println("My bike name is: " + bike);
	}
	public static void main(String[] args) {
		objectCreate obj1 = new objectCreate();  //object 1 is created
		objectCreate obj2 = new objectCreate();  //object 2 is created
		// If you create multiple objects of one class, you can change the attribute value in one object, without affecting the attribute value in another objects.
        obj2.x = 25;  //changing the value of x in object 2 and leave x in object 2 unchanged
        System.out.println(obj1.x);  // 5
        System.out.println(obj2.x);  //25
        System.out.println("Name: " + obj1.fName + " " + obj2.lName);
        System.out.println("Age: " + obj1.age);
        myMethod1();
        obj1.myMethod2("royal enfield");
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode()); // every object is different. since different hashcodes are there.
        objectCreate t1 = new objectCreate();
        objectCreate t2 = new objectCreate(15, 25);
        System.out.println(t1.add());
        System.out.println(t2.add());
	}
	int i;
	int j;
	public objectCreate() {
		i = 20;
		j = 30;
		System.out.println("harshavardhan is constructor");
	}
	public objectCreate(int i, int j) {
		this.i = i;
		this.j = j;
		System.out.println("harsha is a parametrized constructor");
	}
	public int add() {
		return i + j;
	}
}
