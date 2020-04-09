package com.tgt.igniteplus;

public final class immutableString
{
    // An immutable class
    final String name;
    final int regNo;
    public immutableString(String name, int regNo)
    {
        this.name = name;
        this.regNo = regNo;
    }
    public String getName()
    {
        return name;
    }
    public int getRegNo()
    {
        return regNo;
    }
}

// Driver class
class Test
{
    public static void main(String args[])
    {
        immutableString s = new immutableString("ABC", 101);
        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        // Uncommenting below line causes error
        // s.regNo = 102;
    }
}

