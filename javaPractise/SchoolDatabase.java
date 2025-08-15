package javaPractise;

import java.util.Scanner;

public class SchoolDatabase {
    // Binary Search Function
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid; // Return the index if the key is found
            } else if (arr[mid] < key) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input: Sorted roll numbers of students
        System.out.println("Enter the sorted roll numbers of the students:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input: Roll number to search for
        System.out.print("Enter the roll number to search for: ");
        int key = scanner.nextInt();

        // Binary Search
        int result = binarySearch(arr, key);

        // Output the result
        if (result != -1) {
            System.out.println("Roll number found at index " + result);
        } else {
            System.out.println("Roll number not found");
        }

        scanner.close();
    }
}
