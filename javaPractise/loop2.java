package javaPractise;

/**
 * @apiNote print even numbers between 200 and 500
 */
public class loop2 {

	public static void main(String[] args) {
		int i = 201;
		while (i < 500 ) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
