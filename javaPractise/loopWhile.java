package javaPractise;

public class loopWhile {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;     // - Do not forget to increase/decrease the variable used in the condition, otherwise the loop will never end! - infinite loop
		}

	}

}
// for debugging make a toggle break point on vertical left blue line and right click and toggle break point
// and then right click on panel and debug as java application
// use fn+f5 for inside line and fn+f6 for next line 