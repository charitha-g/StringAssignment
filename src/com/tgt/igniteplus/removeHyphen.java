package com.tgt.igniteplus;

public class removeHyphen
{
// Java program to remove punctuation from a given string
    public static void main(String[] args)
    {
        // input string
        String str = "134-10/5566 A-block, Manyata Tech-Park";
        // similar to Matcher.replaceAll
        str = str.replaceAll("-"," ");
        System.out.println(str);
    }
}

