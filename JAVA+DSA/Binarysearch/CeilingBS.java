package com.Ravi;

public class CeilingBS {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,10,16,25,29,32,36,38};
        System.out.println(ceilingBS(arr,1));
        System.out.println(floorBS(arr,1));

    }
    static int ceilingBS(int[] arr, int target){
        // what if the target s greater than the greatest number in the array
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <=end){
            //middle element
//            int mid = (start+end) / 2 ; //might be possible that (start + end) for very larger no. it will give error
            int mid = start + ((end-start) / 2); // same thing in better way
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else {
                // answer
                return mid;
            }
        }
        return arr[start]; // for next greater element //ceiling
    }
    static int floorBS(int[] arr, int target){
        // what if the target is smaller than the smallest number in the array
        if(target<arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <=end){
            //middle element
//            int mid = (start+end) / 2 ; //might be possible that (start + end) for very larger no. it will give error
            int mid = start + ((end-start) / 2); // same thing in better way
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else {
                // answer
                return mid;
            }
        }
        return arr[end]; //for next smaller element //floor
    }
}
