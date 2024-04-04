import java.util.Scanner;
public class DrivinCalculataor
{
	public static void main(String args[])
	{
		double totalmiles;
		double costpergasoline;
		double avgmilespergallon;
		double parkingfees;
		double tolls;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total miles driven per day:");
		totalmiles = sc.nextDouble();
		
		System.out.print("Enter Cost per gallon of gasoline:");
		costpergasoline = sc.nextDouble();
		
		System.out.print("Enter Average miles per gallon:");
		avgmilespergallon = sc.nextDouble();
		
		System.out.print("Enter Parking fees per day:");
		parkingfees = sc.nextDouble();
		
		System.out.print("Enter Tolls per day");
		tolls = sc.nextDouble();
		
		
		double Totalcost = (totalmiles / avgmilespergallon) * costpergasoline + parkingfees + tolls;
		
		System.out.print("Your daily Driving cost is:"+Totalcost);

	}

}
