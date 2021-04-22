import java.util.Scanner;
import java.lang.*;

public class BankingApplication 
{

	public static void main(String args[]) 
	{
		
		BankAccount obj = new BankAccount();
		obj.showMenu();	

	}

}

class BankAccount
{
	int balance=500000;
	int previousTransaction;
	String Name;
	String Id;
	
	void deposit(int amount) 
	{
		if(amount != 0) 
		{
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount) 
	{
		if(amount != 0) 
		{
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction() 
	{
		
		if(previousTransaction > 0) 
		{
			System.out.println("Deposited: " + previousTransaction);
		}
		
		else if(previousTransaction < 0) 
		{
			System.out.println("Withdraw: " +Math.abs(previousTransaction));
		}
		
		else 
		{
			System.out.println("No Transaction Occured");
		}
		
	}
	
	void showMenu() 
	{
		
		int option;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("Enter your name");
		String Name= sc.nextLine();
		System.out.println("Hello Mr./Mrs. "+Name);
		System.out.println("Enter your User ID");
		String Id= sc.nextLine();               
		System.out.println();
		System.out.println("1 : Check Your Balance");
		System.out.println("2 : Deposit");
		System.out.println("3 : Withdraw");
		System.out.println("4 : Previous Transaction");
		System.out.println("5 : Exit The System");
		do
		{
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("Enter Your Option");
			option = sc.nextInt();
			switch (option) 
			{
				
				case 1:
					System.out.println("----------------------------------------------------------------------------------------------------");
					System.out.println("Balance = "+balance);
					break;
				
				case 2:
					System.out.println("----------------------------------------------------------------------------------------------------");
					System.out.println("Enter an amount to deposit ");
					int amount = sc.nextInt();
					deposit(amount);
					break;
				
				case 3:
					System.out.println("----------------------------------------------------------------------------------------------------");
					System.out.println("Enter an amount to withdraw ");
					int amount2 = sc.nextInt();
					withdraw(amount2);
					break;
				
				case 4:
					System.out.println("----------------------------------------------------------------------------------------------------");
					getPreviousTransaction();
					break;
				
				case 5:
					System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
					break;

				default:
					System.out.println("Invalid Option!! Please Enter Correct Opton...");
					break;
					
			}
		}
		while(option!= 5);
		System.out.println("Thank You for Using our Services");
		System.out.println("Continue banking with us");
		System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
	}
}