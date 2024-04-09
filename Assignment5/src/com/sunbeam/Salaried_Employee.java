package com.sunbeam;

import java.util.Scanner;

public class Salaried_Employee extends Employee
{
   private double WeeklySalary;
   
   
   public void acceptData(Scanner sc)
   {
	   super.acceptData(sc);
	   
	   System.out.println("Enter Weekly Salary:");
	   WeeklySalary = sc.nextDouble();
   }
   
   public void displayEmployee()
   {
	   super.displayEmployee();
	   System.out.println("Weekly Salary:"+WeeklySalary);
   }

   
   
   
   
@Override
public String toString() {
	return "Salaried_Employee [WeeklySalary=" + WeeklySalary + "]";
}

public void earnings() 
{
	System.out.println("Earning of Salaried Employee:"+WeeklySalary);
	
}

}
