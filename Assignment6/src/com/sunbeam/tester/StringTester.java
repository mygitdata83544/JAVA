package com.sunbeam.tester;

import com.sunbeam.entity.Length;
import com.sunbeam.exceptions.ExceptionLineTooLong;

public class StringTester {

	public static void main(String[] args) {
		
		Length s = new Length();
		try
		{
		s.AcceptString();
		s.DisplayString();
		//s.Stringlen();
		}catch (ExceptionLineTooLong e) {
			e.printStackTrace();
		}
	}

}