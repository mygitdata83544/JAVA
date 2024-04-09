package com.sunbeam;


import java.util.Scanner;
public abstract class Employee 
{
 private String Fname;
 private String Lname;
 private int SSN;
 
 
public Employee()
{

}


public Employee(String fname, String lname, int sSN) 
{
	Fname = fname;
	Lname = lname;
	SSN = sSN;
}




public String getFname() {
	return Fname;
}


public void setFname(String fname) {
	Fname = fname;
}


public String getLname() {
	return Lname;
}


public void setLname(String lname) {
	Lname = lname;
}


public int getSSN() {
	return SSN;
}


public void setSSN(int sSN) {
	SSN = sSN;
}


public void acceptData(Scanner sc)
{
	System.out.println("Enter first Name:");
	Fname = sc.next();
	
	System.out.println("Enter Last Name:");
	Lname = sc.next();
	
	System.out.println("Enter Social Security Number:");
	SSN = sc.nextInt();
	
	
}


public void displayEmployee()
{
	System.out.println("First Name:"+Fname);
	System.out.println("Last Name:"+Lname);
	System.out.println("SSN:"+SSN); 
 
}





public String toString() {
	return "Employee [Fname=" + Fname + ", Lname=" + Lname + ", SSN=" + SSN + "]";
}


public abstract void earnings();
   
}
