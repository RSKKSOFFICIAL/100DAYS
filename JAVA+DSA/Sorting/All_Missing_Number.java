package com.ravi;

import java.util.ArrayList;
import java.util.List;

public class All_Missing_Number {
    public static void main(String[] args) {
        int[] arr ={4,2,2,2};
        System.out.println(all_missing_Number(arr));
    }



static List<Integer> all_missing_Number(int[] arr){
    int i=0;
    while (i<arr.length){
        int correct= arr[i]-1;
        if(arr[i] != arr[correct]){
            swap(arr,i,correct);
        }else {
            i++;
        }
    }
    //find all missing number from 1 to n
    List<Integer> ans= new ArrayList<>();
    for (int index = 0; index < arr.length; index++) {
        if(arr[index] !=index+1){
            ans.add(index+1);
        }
    }
    return ans;
}

    static void swap(int[] arr, int first, int correct) {
        int temp = arr[first];
        arr[first]=arr[correct];
        arr[correct]=temp;
    }
}
