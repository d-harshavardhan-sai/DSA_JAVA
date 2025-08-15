package javaPractise;

public class dog {
    public String breed = "German Shepard";
    public int height = 30;
    public int weight = 35;
	public static void main(String[] args) {
		System.out.println("DOG");
		dog obj = new dog();
		System.out.println(obj.breed);     //creating an object can access information of a class in which the object is created 
	}
}
