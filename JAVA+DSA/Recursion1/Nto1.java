package com.Ravi;

public class Nto1 {
    public static void main(String[] args){
//        fun(5);
//        System.out.println();
//        funRev(5);
//        System.out.println();
//        funBoth(5);
        Nse1(6);
    }
    static void fun(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        fun(n- 1);

    }
    static void funRev(int n){
        if (n == 0){
            return;
        }

        funRev(n- 1);
        System.out.println(n);
    }
    static void funBoth(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        funBoth(n- 1);
        System.out.println(n);


    }
    static void Nse1(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        Nse1(--n);
    }

}
