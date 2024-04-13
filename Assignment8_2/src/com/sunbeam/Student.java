package com.sunbeam;

public class Student
{
		private int roll;
		protected String name;
		protected String city;
		protected double marks;
		
		
		public Student()
		{
			
		}
		
		
		public Student(int roll, String name, String city, double marks)
		{
			this.roll = roll;
			this.name = name;
			this.city = city;
			this.marks = marks;
		}
		
		
		public String toString()
		{
			return "[Roll:"+roll + " Name:"+name + " City:"+city + " Marks:"+ marks + "]";
		}
}
