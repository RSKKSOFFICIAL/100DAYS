package com.Ravi;

public class Fibonaaci {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(fiboFormula(i));
        }
    }
    static long fiboFormula(int n){
        return (long) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }

    static long fibSer(int n) {
        if(n<2){
            return n;
        }
        return fibSer(n-1)+fibSer(n-2);
    }
}
