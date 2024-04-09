package com.sunbeam;

import java.util.Scanner;

public class BasePlusCommissionEmployee extends CommissionEmployee
{
   private double BaseSalary;
   
   
   public void acceptData(Scanner sc)
   {
	   super.acceptData(sc);
	   
	   System.out.println("Enter Base Salary:");
	   BaseSalary = sc.nextDouble();
   }
   
   
   public void displayEmployee()
   {
	   super.displayEmployee();
	   System.out.println("Base Salary:"+BaseSalary);
   }



public String toString() 
{
	return "BasePlusCommissionEmployee [BaseSalary=" + BaseSalary + "]";
}

double sal;
public void earnings()
{
	sal = ((commissionRate * grossSales)+BaseSalary);
	System.out.println("Earnings of Base plus Commission Employee:"+sal);
}


public void Rewards()
{
	System.out.println("New Salary With 10% Reward:"+(sal+ sal*0.1));
}
   
   
   
}
