
public class Shape {

	public static void main(String[] args) {
		
		Shape sha = new Shape();
		
		String star = "*";
		String blank = " ";
		  
		sha.printing(star,blank);

	}             
	public void printing(String star, String blank)
	{
		int i , j;
		
		
		/*Star of first line*/
		
		for(i=0 ; i<5 ; i++)
		{
			System.out.print(blank);
		}
		System.out.println(star);
		
		
		
		/*Stars of second line*/
		
		for(i=0 ; i<4 ; i++)
		{
			System.out.print(blank);
		}
		for(i = 0 ; i<3 ; i++)
		{
			System.out.print(star);
		}
		System.out.println();
		
		
		
		/*Stars of third line*/
		
		
		for( i = 0 ; i < 11 ; i++)
		{
			if( (i == 4) || (i == 5) || (i == 6) )
				System.out.print(blank);
			else
				System.out.print(star);
		}
		System.out.println();
		
		
		/*Stars of fourth line*/
		
		for( i = 0 ; i < 11 ; i++)
		{
			if( (i == 1) || (i == 10) )
				System.out.print(star);
			else
				System.out.print(blank);
		}
		System.out.println();
		
		
		/*Stars of fifth line*/
		
		for( i = 0 ; i < 11 ; i++)
		{
			if( (i == 2) || (i == 9) )
				System.out.print(star);
			else
				System.out.print(blank);
		}
		System.out.println();
		
		
		/*Stars of sixth line*/
		
		for( i = 0 ; i < 11 ; i++)
		{
			if( (i == 1) || (i == 10) )
				System.out.print(star);
			else
				System.out.print(blank);
		}
		System.out.println();

		
		/*Stars of seventh line*/
		
		for( i = 0 ; i < 11 ; i++)
		{
			if( (i == 4) || (i == 5) || (i == 6) )
				System.out.print(blank);
			else
				System.out.print(star);
		}
		System.out.println();
		
		
		
		/*Stars of eighth line*/
		
		for(i=0 ; i<4 ; i++)
		{
			System.out.print(blank);
		}
		for(i = 0 ; i<3 ; i++)
		{
			System.out.print(star);
		}
		System.out.println();
		
		
		
		/*Star of ninth line*/
		
		for(i=0 ; i<5 ; i++)
		{
			System.out.print(blank);
		}
		System.out.println(star);
		
		
		
		
		/* Shape of Right Triangle */
		
		for(i = 1 ; i<=10 ; i++)
		{
			for(j=10 ; j>0  ; j--)
			{
				
				if(j<=i)
					System.out.print(star);
				else
					System.out.print(blank);
			}
			System.out.println();
		}
	}
}
