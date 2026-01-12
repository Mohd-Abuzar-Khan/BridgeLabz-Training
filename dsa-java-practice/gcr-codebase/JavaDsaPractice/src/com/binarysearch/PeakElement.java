package com.binarysearch;

public class PeakElement {

    public static int findPeakElement(int[] arr) {

        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            
            boolean leftSmaller = (mid == 0) || arr[mid] > arr[mid - 1];
            boolean rightSmaller = (mid == n - 1) || arr[mid] > arr[mid + 1];

            
            if (leftSmaller && rightSmaller) {
                return mid;
            }
           
            else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            
            else {
                left = mid + 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeakElement(arr);

        System.out.println("Peak Element Index: " + peakIndex);
        System.out.println("Peak Element Value: " + arr[peakIndex]);
    }
}