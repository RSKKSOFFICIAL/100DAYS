package com.Ravi;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        print(1);

    }

    static void print(int n) {
        System.out.println(n);
        //base condition
        if (n ==5 ){
            return;
        }
        //recursive call
        print(n+1);
    }

}
