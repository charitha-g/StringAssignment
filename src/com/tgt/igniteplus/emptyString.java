package com.tgt.igniteplus;

public class emptyString
{
    public static void main(String[] args) {
        String myStr1 = "hello world";
        String myStr2 = "";
        boolean res;
        res = ( myStr1.length() == 0);
        System.out.println("String 1 is empty? "+res);
        res = ( myStr2.length() == 0);
        System.out.println("String 2 is empty? "+res);
    }
}

