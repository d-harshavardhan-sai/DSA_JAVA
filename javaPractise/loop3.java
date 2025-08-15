package javaPractise;

/**
 * @apiNote print the numbers which are divisible by 7 and for the range between 150 to 200
 */
public class loop3 {

	public static void main(String[] args) {
		int i = 150;
		while (i <= 200) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
