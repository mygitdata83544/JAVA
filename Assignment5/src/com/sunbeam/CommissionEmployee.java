package com.sunbeam;

import java.util.Scanner;

public class CommissionEmployee extends Employee
{
   protected double grossSales;
   protected double commissionRate;
   
   
   
   public void acceptData(Scanner sc)
   {
	   super.acceptData(sc);
	   System.out.println("Enter grossSales:");
	   grossSales =sc.nextDouble();
	   
	   System.out.println("Enter Commission Rate:");
	   commissionRate = sc.nextDouble();
	   
   }
   
   
   public void displayEmployee()
   {
	   super.displayEmployee();
	   System.out.println("Gross Sales:"+grossSales);
	   System.out.println("Commission Rate:"+commissionRate);
   }



public String toString()
{
	return "CommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + "]";
}
   
   
   public void earnings()
   {
	   System.out.println("Earnings of Commission Employee:"+(commissionRate * grossSales));
   }
   
   
}
