package com.Ravi;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 10;
 //       int b =2; //binary
        int b =10; //decimal
        int ans = (int) (Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
}
