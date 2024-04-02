import java.util.Scanner;
public class Assignment1_2 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		double num1,num2;
		
		System.out.print("Enter first number:");
		if(!sc.hasNextDouble())
		{
			System.out.println("Number is not a double");
			return;
			
		}
		
		num1 = sc.nextDouble();
		
		
		
		System.out.print("Enter Second number:");
		if(!sc.hasNextDouble())
		{
			System.out.println("Number is not double");
			return;
			
		}
		num2 = sc.nextDouble();
		
		
		double avg=(num1+num2)/2.0;
		System.out.println("Average:"+avg);
	}

}