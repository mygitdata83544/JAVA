package com.sunbeam.entity;

import java.util.Scanner;

import com.sunbeam.exceptions.ExceptionLineTooLong;

public class  Length {
	
	private String EnterString;

	public Length() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Length(String enterString) {
		super();
		EnterString = enterString;
	}
	
	
	public String getEnterString() {
		return EnterString;
	}

	public void setEnterString(String enterString) {
		EnterString = enterString;
	}

	public void AcceptString() throws ExceptionLineTooLong {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		
		EnterString = sc.nextLine();
		
		if(EnterString.length() > 8)
		{
		throw new ExceptionLineTooLong("The String is too long"); 
	}
		
	}
	
//	public void Stringlen() throws ExceptionLineTooLong {
//		if(EnterString.length() > 80)
//		{
//		throw new ExceptionLineTooLong(); 
//
//		}
//	}

	public void DisplayString() {
		System.out.println("String is : "+EnterString);
		
	}
	
}