package com.ravi;

import java.util.Arrays;

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr ={4,0,2,1};
        System.out.println(missing_Number(arr));

    }
    static int missing_Number(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct= arr[i];
            if(arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] !=index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int correct) {
    int temp = arr[first];
    arr[first]=arr[correct];
    arr[correct]=temp;
    }
}
