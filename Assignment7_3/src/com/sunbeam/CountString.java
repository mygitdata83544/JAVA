package com.sunbeam;

import java.util.Scanner;

public class CountString
{
    public static void main(String args[])
    {
    	int count = 0;
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter String:-");
    	String s1 =sc.nextLine();
    	
    	
    	s1.trim();
    	System.out.println(s1.trim());
    	
    	String arr[] = s1.split(" ");
    	for(String e:arr)
    	{
    		System.out.println(e);
    	}
    	
    	
    	for(int i=0; i<arr.length; i++)
    	{
    		count++;
    	}
    	
    	System.out.println("count of string is:"+count);
    }
}
