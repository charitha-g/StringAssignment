package com.tgt.igniteplus;

public class compare2strings
{
    public static void main(String args[]){
        String a = "CHARACTER";
        String b = "character";
        if(a.equals(b))
        {
            System.out.println("Both strings are equal.");
        }
        else
        {
            System.out.println("Both strings are not equal.");
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("Both strings are equal.");
        }
        else
        {
            System.out.println("Both strings are not equal.");
        }
    }
}

