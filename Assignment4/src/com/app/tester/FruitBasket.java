package com.app.tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		int length = 0;
		System.out.println("Enter the FruitBasket Range");
		length = sc.nextInt();
		Fruit [] arr= new Fruit[length];
		Fruit f;
		int choice;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits in the basket");
			System.out.println("5. Display name,color,weight,taste of all fresh fruits,in the basket");
			System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits stale (optional) ");
			System.out.print("Enter choice - ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you for using our app!!!");
				break;
			case 1:
				if (index < arr.length) {
					f = new Mango();
					f.accept(sc);
					//f.display();
					arr[index] = f;
					index++;
				} else
					System.out.println("FruitBasket is Full");
				break;
			case 2:
				if (index < arr.length) {
					f = new Orange();
					f.accept(sc);
					//f.display();
					arr[index] = f;
					index++;
				} else
					System.out.println("FruitBasket is Full");
				
				break;
			case 3:
				if (index < arr.length) {
					f = new Apple();
					f.accept(sc);
					//f.display();
					arr[index] = f;
					index++;
				} else
					System.out.println("FruitBasket is Full");
				break;

			case 4:
				//if(arr[index]!=null) {
		
				for (Fruit a:arr) 
					{
					System.out.println("Fruit Name is: "+a.getName());
					}
				//}else
				//{
					//System.out.println("Basket is Full");
				//}
				break;

			
			case 5:
				for (Fruit b : arr)
				{
					if (b != null && b.isFresh()==true);
					System.out.println(b);
				}
				System.out.println("Basket is Empty!");
				break;
				
			case 6:
				for (Fruit b : arr)
				{
					if (b != null && b.isFresh()==false);
					System.out.println(b);
				}
				System.out.println("Basket is Empty!");
				
				break;
				
			case 7:
			System.out.println("Enter index of fruit basket to set to stale");
			int rtemp = sc.nextInt();
			if(rtemp<length && arr[rtemp]!=null)
				arr[rtemp].setFresh(false);
			else
				System.out.println("out of range");
				
			case 8:
				for(Fruit c:arr)
				{
					if(c.taste()=="sour")
					{
						c.setFresh(false);
					}
				}
				System.out.println("No fruit is sour in basket");
				break;
				
			default:
				System.out.println("Wrong Choice..");
				break;
			}
		} while (choice != 0); 
	}

}