package com.app.fruits;

import java.util.Scanner;

public class Mango  extends Fruit{
	
	public Mango()
	{
		super("Mango",true);
	}
	
	
	public Mango (String name, String color, boolean isFresh) 
	{
		super("Mango","Mango",true);
	}
	
	@Override
	public String taste() {
		return "sweet";
	}
	
	public void accept(Scanner sc)
	{
		super.accept(sc);
	}
	
	public void display() 
	{
		super.display();
	}
}