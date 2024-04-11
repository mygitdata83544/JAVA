package com.sunbeam;

import java.util.Scanner;

public class Palindrome 
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter String:-");
	
	String s1 =sc.next();
	 
	 StringBuilder s2 = new StringBuilder(s1);
	 s2.reverse();
	 
	 System.out.println(s1);
	 System.out.println(s2);
	 
	 if(s1.equals(s2.toString()))
	 {
		 System.out.println("String is Palindrome");
	 }
	 else
		 System.out.println("String is not Palindrome");
}
}
