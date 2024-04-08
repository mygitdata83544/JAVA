package com.app.fruits;

import java.util.Scanner;

public class Apple  extends Fruit{
	
	public Apple()
	{
		super("Apple",true);
	}
	
	public Apple (String name, String color, boolean isFresh) {
		super("Apple","Red",true);
	}
	@Override
	public String taste() {
		return "sweet n sour";
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