package com.problemsonsearching;

import java.util.Arrays;

public class CompareSearch {

    //linear Search
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n + 1];

        for (int num : nums) {
            if (num >= 1 && num <= n) {
                visited[num] = true;
            }
        }
        
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return n + 1;
    }

    //Binary Search 
    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    //main method
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int target = 4;

        int missing = firstMissingPositive(arr);

        Arrays.sort(arr);
        int index = binarySearch(arr, target);

        System.out.println("First missing positive integer: " + missing);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Index of target: " + index);
    }
}