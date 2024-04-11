package com.sunbeam;

import java.util.Scanner;

public class ReverseString 
{

  public static void main(String args[])
{
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter String:-");
	 StringBuilder s1 = new StringBuilder(sc.next());
	 
	  s1.reverse();
	 
	  System.out.println("Reverse String:-"+s1);
}
	
}
