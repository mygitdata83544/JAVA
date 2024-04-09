package com.sunbeam;

import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		
		System.out.println("Which type of employee Type: \n 1. Salaried Employee \n 2. Hourly Employee  \n 3.Commision Employee \n 4. BasePlusCommission: ");
		choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				Employee e = new Salaried_Employee();
				e.acceptData(sc);
				e.displayEmployee();
				e.earnings();
				e.toString();
			}
			break;
			
			case 2:
			{
				Employee e = new HourlyEmployee();
				e.acceptData(sc);
				e.displayEmployee();
				e.earnings();
				e.toString();
			}
				break;
				
			case 3:
				Employee e = new CommissionEmployee();
				e.acceptData(sc);
				e.displayEmployee();
				e.earnings();
				e.toString();
				break;
				
			case 4:
				Employee P = new BasePlusCommissionEmployee();
				P.acceptData(sc);
				P.displayEmployee();
				P.earnings();
				P.toString();
				
				if(P instanceof BasePlusCommissionEmployee)
				{
					BasePlusCommissionEmployee E = (BasePlusCommissionEmployee) P;
					E.Rewards();
				}
			    
				break;
		}
	}

}
