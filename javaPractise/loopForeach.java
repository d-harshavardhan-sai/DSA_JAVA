package javaPractise;

public class loopForeach {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		//using for loop
		System.out.println("for iteration: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//using for each loop
		System.out.println("foreach iteration: ");
		for (int value:arr) {           //by default updation is incrementation 
			System.out.println(value);  // we can't find index also
		}
		//sum using for each
		int sum = 0;
		for (int value:arr) {
			sum += value;
		}
		System.out.println("for each sum is: " + sum);
		// 2d array and jagged array
		int[][] array = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		// print array
		System.out.println("foreach 2d array: ");
		for (int[] singleRow : array) {
			for (int value: singleRow) {
				System.out.print(value+" ");
			} 
			System.out.println();
		}
		//for each no of elements, sum, average
		int noOfElements = 0;
		int sum1 = 0;
		for (int[] singleRow : array) {
			for (int value : singleRow) {
				sum1 += value;
				noOfElements++;
			}
		}
		System.out.println("no of elements: " + noOfElements);
		System.out.println("sum: " + sum1);
		System.out.println("average: "+ sum1/noOfElements);
	}

}
