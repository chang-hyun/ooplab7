import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		Positive pos = new Positive();
		
		int result;
		
		result = pos.readPositive();
		System.out.println("Result: "+result);
		

	}
	
	public int readPositive()
	{
		Scanner scan = new Scanner(System.in);
		int ger;
		
		while(true)
		{
			System.out.print("Please give a positive integer (>0): ");
		
			ger = scan.nextInt();
		
			if(ger>0)
				break;
		}
		return ger;
	}

}
