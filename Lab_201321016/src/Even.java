import java.util.Scanner;

public class Even {
	public static void main(String[] args)
	{
		Even number = new Even();
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Input Max number: ");
		int max = scan.nextInt();
		System.out.print("Input Min number: ");
		int min = scan.nextInt();
		
		number.evenNumber(max,min);
	}
	
	public void evenNumber(int max,int min)
	{
        int i = max;
		while(i>=min)
        {
        	if(i%2==0)
        	{
        		System.out.println(i);
        	}
        	i--;
        }
	}
}