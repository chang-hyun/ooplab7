import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int ID;
		String name;
		double balance, amount;
		int out , in , num;
		
		System.out.print("Plaese input your ID: ");
		ID = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Plaese input your name: ");
		name = scan.nextLine();
		
		System.out.print("Plaese input your balance: ");
		balance = scan.nextInt();
		
		Account count = new Account(ID,name,balance);
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("What do you want?");
		System.out.println("1. DEPOSIT");
		System.out.println("2. WITHDRAW");
		System.out.println("3. CHECK ACCOUNT");
		System.out.println();
		System.out.println("If you done, please input 0");
		
		
		
		
		while(true)
		{
			System.out.println();
			System.out.print("Please select number: ");
			num = scan.nextInt();
		
		
		
			switch(num)
			{
			case 1:
				System.out.print("How much will you deposit? ");
				amount = scan.nextInt();
				balance = count.deposit(amount);
				System.out.println(balance);
				break;
				
			case 2:
				System.out.print("How much will you withdraw? ");
				amount = scan.nextInt();
				balance = count.withdraw(amount);
				System.out.println(balance);
				break;
			case 3:
				System.out.println();
				System.out.println("Let's check your account");
				count.print();
				break;
			default:
				if( num == 0 )
				{
					System.out.println();
					System.out.println("--Thank you for using our bank--");
					System.out.println("|                              |");
					System.out.println("|            ^     ^           |");
					System.out.println("|             -----            |");
					System.out.println("--------------------------------");
					break;
				}
				System.out.println();
				System.out.println("///////////////////////");
				System.out.println("Please check the number");
				System.out.println("///////////////////////");
				System.out.println();
			}//end of switch
			
			if(num == 0)
				break;
		
		}//end of while

	}//end of main

}//end of Bank class

class Account
{
	int accountId;
	String ownerName;
	double balance;
	
	public Account(int Id,String name,double bal)
	{
		accountId = Id;
		ownerName = name;
		balance = bal;
	}
	
	public double withdraw(double amount)
	{
		balance -= amount; 
		if(balance <0)
		{
			System.out.println();
			System.out.println("You don't have enough balance!!");
			System.out.print("Please start again from the beginning");
			System.exit(0);
		}
		
		return balance;
	}
	
	public double deposit(double amount)
	{
		if(amount<0)
		{
			System.out.println();
			System.out.println("You can't deposit below 0!!");
			System.out.print("Please start again from the beginning");
			System.exit(0);
		}
		
		balance += amount;
		return balance;
		
	}
	
	public void print()
	{
		System.out.println();
		System.out.println("accountId: "+accountId);
		System.out.println("owner: "+ownerName);
		System.out.println("balance: "+balance);
	}
}
