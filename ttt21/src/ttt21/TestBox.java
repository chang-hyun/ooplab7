package ttt21;

public class TestBox {
	

	public static void main(String[] args)
	{
		TestBox t = new TestBox();
		t.go();
	}
	
	public void go()
	{
		int foo = 4;
		String bar = "Hello";
		
		takeStringAndInt(""+foo,foo);
	}
	
	void takeStringAndInt(String s,int x)
	{
		System.out.println("we got "+s+" 55and "+x);
	}
}

abstract class Person
{
	public abstract void storage();
	
}

