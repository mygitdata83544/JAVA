package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Program 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		Student arr[] = new Student[5];
		arr[0] = new Student(104, "Harshal", "Ghatanji", 90);
		arr[1] = new Student(102, "Abhi", "Karad", 95);
		arr[2] = new Student(105, "Ashish", "Damoh", 99);
		arr[3] = new Student(101, "Pratik", "Badlapur", 77);
		arr[4] = new Student(103, "Onkar", "Pune",  65);
		
		System.out.println("Before Sorting:");
		for(Student e:arr)
			System.out.println(e);
		
		do
		{
			System.out.println("0. To Exit");
			System.out.println("1. To sorted on their city (asc)");
			System.out.println("2. sorted on their on marks (desc)");
			System.out.println("3. sorted on their on name (asc)");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 0:
				System.out.println("Thank You For using our Application");
				break;
				
			case 1:
				class StudentCityComparator implements Comparator<Student> {
					@Override
					public int compare(Student o1, Student o2) 
					{
						int value = o1.city.compareTo(o2.city);
						return value;
					}
				}
				
				Comparator<Student> StudCityComparator = new StudentCityComparator();

				Arrays.sort(arr, StudCityComparator);
				
				System.out.println("After Sorting:");
				for(Student e:arr)
					System.out.println(e);
				break;
				
			case 2:
				class StudentMarksComparator implements Comparator<Student> 
				{
					public int compare(Student s2, Student s1) 
					{
						int value = Double.compare(s1.marks, s2.marks);
						return value;
					}

				}
				
				Comparator<Student> StudmarksComparator = new StudentMarksComparator();

				Arrays.sort(arr, StudmarksComparator);
				
				System.out.println("After Sorting:");
				for(Student e:arr)
					System.out.println(e);
				break;
				
			case 3:
				class StudentCityComparator implements Comparator<Student> {
					@Override
					public int compare(Student o1, Student o2) 
					{
						int value = o1.name.compareTo(o2.name);
						return value;
					}
				}
				
				Comparator<Student> StudnameComparator = new StudentCityComparator();

				Arrays.sort(arr, StudnameComparator);
				
				System.out.println("After Sorting:");
				for(Student e:arr)
					System.out.println(e);
				break;
				
			default:
				System.out.println("Enter valid choice");
			}
		}while(choice!=0);
		

	}

}
