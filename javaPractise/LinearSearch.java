package javaPractise;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the target element to search for: ");
        int target = scanner.nextInt();

        int index = linearSearch(array, target);

        if (index == -1) {
            System.out.println("Target element not found.");
        } else {
            System.out.println("Target element found at index: " + index);
        }

        scanner.close();
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;  // Return the index of the target element
            }
        }
        return -1;  // Return -1 if the target element is not found
    }
}

