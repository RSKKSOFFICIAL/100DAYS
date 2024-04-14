package com.Ravi;

public class Sum {
    public static void main(String[] args) {
        System.out.println(addition(5));
    }
    static int addition(int n){
        if (n <=1 ){
            return 1;
        }
        return n+addition(n-1);
    }
}
