package com.ravi;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The Temperature In  C: ");
        float tempC = input.nextFloat();
        float tempf = (tempC * 9/5) + 32;
        System.out.println(tempf);

    }
}
