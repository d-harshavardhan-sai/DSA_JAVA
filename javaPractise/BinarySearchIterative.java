package javaPractise;

public class BinarySearchIterative {
	public static int binarySearchIterative(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
	public static void main(String[] args) {
		int[] arr = {-8, -7, -3, 0, 3, 5, 6, 8, 10, 12};
		System.out.println(binarySearchIterative(arr, 8));
	}
}
