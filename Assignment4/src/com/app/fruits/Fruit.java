package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	private String name;
	private String color;
	private double weight;
	private boolean isFresh;
	
	public Fruit()
	{
		
	}
	
	public Fruit(String name, boolean isFresh) 
	{
		super();
		this.name = name;
		this.isFresh = isFresh;
	}

	public Fruit (String name, String color, boolean isFresh )
	{
	 this.color=color;
	 this.name=name;
	 //this.weight=weight;
	 this.isFresh=isFresh;
	}
	
	public String taste() {
		return "no specific taste";
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Fruit [taste()=" + taste() + ", isFresh()=" + isFresh() + ", getName()=" + getName() + ", getColor()="
				+ getColor() + ", getWeight()=" + getWeight() + "]";
	}

	public void accept(Scanner sc)
	{
		System.out.println("Enter weight of fruit: ");
		weight = sc.nextDouble();
		System.out.println("Enter color of fruit: ");
		color = sc.next();
		
	}
	
	public void display()
	{
		System.out.println("Enter Name: "+name);
		System.out.println("Enter Name: "+name);
		System.out.println("Enter Color: "+color);
		System.out.println("Enter Weight: "+weight);
		System.out.println("Enter is Fresh: "+isFresh);
		
	}
	
	

}
