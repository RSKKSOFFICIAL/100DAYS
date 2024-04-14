package com.Ravi;
import java.util.Arrays;
class FlipImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        printImage(flipAndInvertImage(arr));
    }
        static int[][] flipAndInvertImage ( int[][] image){
            for (int[] row : image) {
                // reverse the array
                for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                    //swap
                    int temp = row[i] ^ 1;
                    row[i] = row[image[0].length - i - 1] ^ 1;
                    row[image[0].length - i - 1] = temp;
                }
            }
            return image;
        }
    static void printImage(int[][] image) {
        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }
    }
}
