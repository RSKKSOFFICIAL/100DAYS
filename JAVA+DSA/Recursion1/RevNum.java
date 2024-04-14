package com.Ravi;

public class RevNum {
    public static void main(String[] args) {
        revNum(12345);
        System.out.println (sum);
        System.out.println(revNum1(51556));

    }
    static int sum = 0;
    static void revNum(int n){
        if(n ==0){
            return ;
        }
        int rem = n %10;
        sum = sum * 10 + rem;
        revNum(n/10);
    }
    static int revNum1(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    private static int helper(int n, int digits){
        if (n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem* (int)Math.pow(10, digits-1)+helper(n/10,digits-1);
    }
}
