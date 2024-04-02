import java.util.Scanner;
public class Assignment1_3 
{

	public static void main(String[] args) 
	{
	  
		
		Scanner sc = new Scanner(System.in);
		int choice;
		int Qty;
		 double GB=0;
		
		
		do
		{
				System.out.println("Menu:");
				System.out.println("1. To Dosa(Rs 20):");
				System.out.println("2. To Samosa(Rs 15):");
				System.out.println("3. To Idli(Rs 25):");
				System.out.println("4. To Poha(Rs 20):");
				System.out.println("5. To Tea(Rs 10):");
				System.out.println("6. To Upama(Rs 20):");
				System.out.println("7. To Cofee(Rs 25):");
				System.out.println("8. To Water bottle(Rs 12):");
				System.out.println("9. To Jalebi(Rs 40):");
				System.out.println("10.Generate Bill:");
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
			
				
				switch(choice)
				{
				case 1:
				{
					System.out.println("Enter Quantity:");
					 Qty = sc.nextInt();
					GB = GB+20*Qty;
				}
					break;
					
				case 2:
				{
					System.out.println("Enter Quantity:");
					 Qty = sc.nextInt();
					GB = GB+15*Qty;
				}
					break;
					
					
				case 3:
				{
					System.out.println("Enter Quantity:");
					 Qty = sc.nextInt();
					GB = GB+25*Qty;
				}
					break;
					
					
				case 4:
				{
					System.out.println("Enter Quantity:");
					 Qty = sc.nextInt();
					GB = GB+20*Qty;
				}
					break;
					
					
				case 5:
				{
					System.out.println("Enter Quantity:");
					 Qty = sc.nextInt();
					GB = GB+10*Qty;
				}
					break;
					
					
				case 6:
				{
					System.out.println("Enter Quantity:");
					 Qty = sc.nextInt();
					GB = GB+20*Qty;
				}
					break;
					
					
				case 7:
				{
					System.out.println("Enter Quantity:");
					 Qty = sc.nextInt();
					GB = GB+25*Qty;
				}
					break;
					
					
				case 8:
				{
					System.out.println("Enter Quantity:");
					 Qty = sc.nextInt();
					GB = GB+12*Qty;
				}
					break;
					
					
				case 9:
				{
					System.out.println("Enter Quantity:");
					 Qty = sc.nextInt();
					GB = GB+40*Qty;
				}
					break;
					
					
				case 10:
					System.out.println("Total bill:"+GB);
					 break;
					  
				default :
					System.out.println("Wrong choice");
			    
				}

	}while(choice!=10);
		
		System.out.println("Thank you for visiting restaurant");

}
}