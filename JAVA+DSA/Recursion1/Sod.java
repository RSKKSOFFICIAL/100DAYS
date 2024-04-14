package com.Ravi;

public class Sod {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
        System.out.println(mulOfDigits(12345));

    }
    static int sumOfDigits(int n){
        if (n == 0){
            return 0;
        }
        int rem = n %10;
        return rem + sumOfDigits(n/10);
    }
    static int mulOfDigits(int n){
        if (n%10 == n){
            return n;
        }
        int rem = n %10;
        return rem * mulOfDigits(n/10);
    }
}
