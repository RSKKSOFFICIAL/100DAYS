package com.Ravi;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
//        int[] arr ={-2,-3,-3,-2,-4,-5,-4};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique= 0;
        for (int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
