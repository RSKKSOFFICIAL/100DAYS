package com.ravi;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
//        bubble(arr);
//        System.out.println(Arrays.toString(arr));
//        selection(arr);
//        System.out.println(Arrays.toString(arr));
          insertion(arr);
          System.out.println(Arrays.toString(arr));

    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr ,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    
    static void selection(int[] arr){
        for (int i = 0; i < arr.length;i++) {
            int last = arr.length-i-1;
            int maxIndex = getmaxIndex(arr , 0 , last);
            swap(arr, maxIndex,last);
        }
    }

    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }

    static int getmaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void bubble(int[] arr){
        boolean swapped;
     //run the steps n-1
        for (int i = 0; i < arr.length; i++) {
           swapped = false;
            //for each step,max item will come at the lst respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
            // if array is already swapped
        }
    }
}


