package com.app.fruits;

import java.util.Scanner;

public class Orange  extends Fruit{
	
	public Orange()
	{
		super("Orange",true);
	}
	
	public Orange (String name, String color, boolean isFresh) {
		super("Orange","Orange",true);
	}
		
	@Override
	public String taste() {
		return "sour";
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