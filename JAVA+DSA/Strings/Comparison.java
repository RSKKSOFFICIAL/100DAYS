package com.Ravi;

public class Comparison {
    public static void main(String[] args){
        String a = "Ravi";
        String b = "Ravi";
        String c = new String("Kunal");
        String d = new String("Kunal ");
        System.out.println(c==d);
        System.out.println(d.equals(c));
        System.out.println(a.charAt(0));
}
}
