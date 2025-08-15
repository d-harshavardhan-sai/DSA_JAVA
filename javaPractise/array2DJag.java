package javaPractise;

public class array2DJag {

	public static void main(String[] args) {
		int[][] arr = new int[3][2]; // first bracket- rows, second bracket- columns
		System.out.println(arr); // hash code is printed, it is an object
		//inserting values
		arr[0][0] = 1;
		arr[0][1] = 2;
		
		arr[1][0] = 3;
		arr[1][1] = 4;
		
		arr[2][0] = 5;
		arr[2][1] = 6;
		
		System.out.println(arr[0][0]);
		//another way of declaring and assigning values
		int[][] array = {{1,2},{3,4},{5,6}}; // row number and column number is automatically taken
		int[][] array1 = {
				{1,2},
				{3,4},
				{5,6}
		};
		int[][] array2 = new int[3][2];
		array2[0] = new int[] {1,2};
		//array2[0] = {3,4}; shows syntax error
		array2[1] = new int[] {3,4};
		array2[2] = new int[] {5,6};
		System.out.println();
		//using for loop
		System.out.println("arr is :");
		for (int i = 0; i < arr.length; i++) {             //with variable singleRow
			int[] singleRow = arr[i];
			for (int j = 0; j < singleRow.length; j++) {
				System.out.print(singleRow[j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("arr is :");
		for (int i = 0; i < arr.length; i++) {             //without any variable
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  // Move to the next line after printing each row
        }
		System.out.println();
		//size of each row
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].length);
		}
		System.out.println("size of each row: ");
		//overall size
		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			size += arr[i].length;
		}
		System.out.println("overallsize of arr is :"+size);
		System.out.println("array is: ");
		for (int i = 0; i < array.length; i++) {             //without any variable
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
		}
		System.out.println("array1 is: ");
		for (int i = 0; i < array1.length; i++) {             //without any variable
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
		}
		System.out.println("array2 is: ");
		for (int i = 0; i < array2.length; i++) {             //without any variable
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
		}
		System.out.println();
		// Jagged arrays
		int[][] arrJag = new int[3][];
		arrJag[0] = new int[3];
		arrJag[1] = new int[4];
		arrJag[2] = new int[5];
		// Initialize values
		arrJag[0][0] = 1;
		arrJag[0][1] = 2;
		arrJag[0][2] = 3;
		
		arrJag[1][0] = 4;
		arrJag[1][1] = 5;
		arrJag[1][2] = 6;
		arrJag[1][3] = 7;
		
		arrJag[2][0] = 8;
		arrJag[2][1] = 9;
		arrJag[2][2] = 1;
		arrJag[2][3] = 2;
		arrJag[2][4] = 3;
		
		//for loop
		System.out.println("jagged array arrJag is: ");
		for (int i = 0; i < arrJag.length; i++) {
			for (int j = 0; j < arrJag[i].length; j++) {
				System.out.print(arrJag[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("size of each row: ");
		//size of each row
		for (int i = 0; i < arrJag.length; i++) {
			System.out.println(arrJag[i].length);
		}
		//overall size
		int sizeJ = 0;
		for (int i = 0; i < arrJag.length; i++) {
			sizeJ += arrJag[i].length;
		}
		System.out.println("over all sizeJ is: " + sizeJ); 
	}

}
