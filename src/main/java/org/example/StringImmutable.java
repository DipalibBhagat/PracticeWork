package org.example;

public class StringImmutable {
    public static void main(String[] args) {
        String str = "knowledge";
        String s= str;
        str= str.concat("base");
        System.out.println(s);
    }
}
