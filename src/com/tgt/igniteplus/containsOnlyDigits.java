package com.tgt.igniteplus;

public class containsOnlyDigits
{
    public static void main(String []args)
    {
        String str = "5demo9";
        System.out.println("String: "+str);
        if(str.matches("[0-9]+") && str.length() > 2)
        {
            System.out.println("String contains only digits!");
        }
        else
        {
            System.out.println("String contains digits as well as other characters!");
        }
    }
}

