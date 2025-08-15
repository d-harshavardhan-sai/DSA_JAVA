package com.harshavardhan.BinarySearch;
import java.util.*;
public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int find = sc.nextInt();
        System.out.println(orderAgnosticBS(arr1, find));
        sc.close();
    }
    
    static int orderAgnosticBS(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        
        // Check if the array is ascending or descending
        boolean isAsc = arr[s] < arr[e];
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            // Check if mid is the target
            if (arr[mid] == target) return mid;
            
            // Logic for ascending order
            if (isAsc) {
                if (arr[mid] < target) s = mid + 1;
                else e = mid - 1;
            } 
            // Logic for descending order
            else {
                if (arr[mid] > target) s = mid + 1;
                else e = mid - 1;
            }
        }
        return -1;
    }
}
