import java.util.Scanner;

public class Find {
	public static void main(String[] args)
	{
		Find number = new Find();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many times do you input?(Please input positive number) ");
		int n = scan.nextInt();
		
		number.findMinMax(n);
	}
	
	public void findMinMax(int n)
	{
		Scanner scann = new Scanner(System.in);
		int[] num = new int[n];
		int i , max = 0, min = 0;
		
		for(i = 0; i < n ; i++)
		{
			System.out.print("Give integer "+(i+1)+": ");
			num[i] = scann.nextInt();
		}
		
		max = num[0];
		min = num[0];
	
		for(i = 0; i<num.length;i++)
		{
			if(min > num[i])
			{
				min = num[i];
			}
			if(max < num[i])
			{
				max = num[i];
			}
		}
		
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		
	}
}
