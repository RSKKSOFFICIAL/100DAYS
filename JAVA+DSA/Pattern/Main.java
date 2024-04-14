package com.Ravi;

public class Main {
    public static void main(String[] args) {
        pattern2(5);
        System.out.println();
        pattern1(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern28(5);
        System.out.println();
        pattern30(5);
        System.out.println();
        pattern17(4);
        pattern31(3);

    }
    static void pattern2(int n){
        for (int row = 0; row < n; row++) {
            //for every row, run the col
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int row = 0; row < n; row++) {
            //for every row, run the col
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//    static void pattern3(int n){
//        for (int row = 0; row < n; row++) {
//            //for every row, run the col
//            for (int col = n; col > row; col--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    static void pattern3(int n){
        for (int row = 0; row < n; row++) {
            //for every row, run the col
            for (int col = 0; col < n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
//    static void pattern5(int n){
//        for (int row = 1; row <= n; row++) {
//            //for every row, run the col
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int row = 1; row < n; row++) {
//            //for every row, run the col
//            for (int col = n; col > row; col--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row > n ? 2 *n -row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row > n ? 2 *n -row : row;
            int noOfSpaces = n -totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");

            }
            for (int column = row; column >= 1 ; column--) {
                System.out.print(column+ " ");

            }
            for (int column = 2; column <= row; column++) {
                System.out.print(column+" ");

            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for (int row = 1; row <= 2* n; row++) {
            int c = row > n ? 2 *n -row : row;

            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");

            }
            for (int column = c; column >= 1 ; column--) {
                System.out.print(column+ " ");

            }
            for (int column = 2; column <= c; column++) {
                System.out.print(column+ " ");

            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        int originalN= n;
        n= 2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex= originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+ " ");
            }
            System.out.println();
        }

    }
}
