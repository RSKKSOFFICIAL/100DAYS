package com.Ravi;

public class RBS {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,8,9,10,0,1,2,};
        System.out.println(search(arr,7));

    }
    static int search(int[] nums , int target){
        int pivot = FindPivot(nums);
        // if i don't find the pivot , i tmeans the array is not rotated
        if (pivot == -1){
            //just do normal binary search
            return abinarySearch(nums,target,0,nums.length-1);
        }
        //if pivot is found , i have to found 2 ascending sorted arrays
        if(nums[pivot] == target){
            return pivot;
        }
        if (target>= nums[0]){
            return abinarySearch(nums,target,0,pivot-1);
        }
        return abinarySearch(nums,target,pivot+1,nums.length-1);
    }
    static int abinarySearch(int[] arr, int target, int start, int end){
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
        return -1;
    }
    static int FindPivot(int[] arr){
        int start= 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
