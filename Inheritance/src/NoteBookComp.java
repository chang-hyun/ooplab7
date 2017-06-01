
public class NoteBookComp extends Computer{

	
	int battery;
	
	public NoteBookComp(String name, int initChag)
	{
		super(name);
		battery = initChag;
	}
	
	public void charging()
	{
		battery += 5;
	}
	
	public void movingCal()
	{
		if(battery < 1)
		{
			System.out.println("충전이 필요합니다.");
			return;
		}
		
		System.out.print("이동하면서 ");
		calculate();
		battery -= 1;
	}

}
