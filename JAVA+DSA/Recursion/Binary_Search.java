package com.Ravi;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {5,6,8,11,22,33,42};
        int target = 33;
        int s = 0;
        int e = arr.length-1;
        System.out.println(search_B(arr,target,s,e));
    }

    static int search_B(int[] arr,int target, int s, int e) {
        if (s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if (target < arr[m]){
            return search_B(arr,target,s,m-1);
        }
            return search_B(arr,target,m+1,e);
    }
}
