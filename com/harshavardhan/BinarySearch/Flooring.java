package com.harshavardhan.BinarySearch;

public class Flooring {

	public static void main(String[] args) {
		int[] arr1 = {2, 3, 5, 9, 14, 16, 18};
		System.out.println(floor(arr1, 1));
	}

	static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) { 
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
