package com.sunbeam;

import java.util.Scanner;

public class HourlyEmployee extends Employee
{
   private double Wage;
   private double Hours;
   
   
   public void acceptData(Scanner sc)
   {
	   super.acceptData(sc);
	   System.out.println("Enter Wages:");
	   Wage = sc.nextDouble();
	   
	   System.out.println("Enter Hours:");
	   Hours = sc.nextDouble();
   }
   
   public void displayEmployee()
   {
	  super.displayEmployee();
	   System.out.println("Wages:"+Wage);
	   System.out.println("Hours:"+Hours);
   }
   
   
   
   
   @Override
public String toString()
   {
	return "HourlyEmployee [Wage=" + Wage + ", Hours=" + Hours + ", Sal=" + Sal + "]";
   }




double Sal;
   
   public void earnings()
   {
	   if(Hours <=40)
	   {
		 Sal=   Wage * Hours;
		 System.out.println("Earning of Employee:"+Sal);
	   }
	   else if (Hours>40)
	   {
		   Sal = 40 * Wage + (Hours - 40) * Wage * 1.5;
		   System.out.println("Earning of Hourly Employee:"+Sal);
	   }
   }
}
