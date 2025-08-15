package javaPractise;

public class BinarySearchRecursive {
	public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return binarySearchRecursive(arr, target, low, mid - 1);
        return binarySearchRecursive(arr, target, mid + 1, high);
    }
	public static void main(String[] args) {
		int[] arr = {-8, -7, -3, 0, 3, 5, 6, 8, 10, 12};
		System.out.println(binarySearchRecursive(arr, 8, 0, arr.length - 1));
	}
}
