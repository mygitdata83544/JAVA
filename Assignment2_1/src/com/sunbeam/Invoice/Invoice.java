package com.sunbeam.Invoice;
import java.util.Scanner;

public class Invoice 
{
    private String part_num;
    private String part_discription;
    private int Qty;
    private double Price;
    
    Scanner sc = new Scanner(System.in);
   
	public Invoice() {
		super();
	}



	public Invoice(String part_num, String part_discription, int qty, double price) {
		super();
		this.part_num = part_num;
		this.part_discription = part_discription;
		Qty = qty;
		Price = price;
	}



	public String getPart_num() {
		return part_num;
	}



	public void setPart_num(String part_num) {
		this.part_num = part_num;
	}



	public String getPart_discription() {
		return part_discription;
	}



	public void setPart_discription(String part_discription) {
		this.part_discription = part_discription;
	}



	public int getQty() {
		return Qty;
	}



	public void setQty(int qty) 
	{
		if(Qty<0)
			Qty=0;
		
		this.Qty = qty;
	}

	



	public double getPrice() {
		return Price;
	}



	public void setPrice(double price)
	{
		if(Price<0)
			Price=0.0;
		else
			this.Price = price;
	}
	
	double caluclateInvoice()
	{
		return Price*Qty;
	}
	
	
	public void acceptInvoice()
	{
		System.out.println("Enter part number:");
		part_num = sc.next();
		
		System.out.println("Enter part description:");
		part_discription = sc.next();
		
		System.out.println("Enter Quantity:");
	    Qty = sc.nextInt();
		
		System.out.println("Enter part price:");
		Price = sc.nextDouble();
	}
	
	public void displayInvoice()
	{
		System.out.println("Invoice:"+caluclateInvoice());
	}
		
	}
	


