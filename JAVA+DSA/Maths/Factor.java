package com.Ravi;
import java.util.ArrayList;

public class Factor {
    public static void main(String[] args) {
       // factors(20);
        //factors2(36);
        factors3(20);

    }
    static void factors(int n){
        for (int i = 1; i <= n; i++) {
            if (n%i ==0){
                System.out.println(i+ " ");
            }
        }
    }
    static void factors2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i ==0){
                if (n/i ==i){
                    System.out.println(i+ " ");
                }else{
                System.out.println(i+ " "+n/i);
                }
            }
        }
    }
    static void factors3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i ==0){
                if (n/i ==i){
                    System.out.println(i+ " ");
                }else{
                    System.out.println(i+ " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() -1; i >=0 ; i--) {
            System.out.println(list.get(i)+ " ");
        }
    }

}
