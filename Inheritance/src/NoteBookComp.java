
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
			System.out.println("������ �ʿ��մϴ�.");
			return;
		}
		
		System.out.print("�̵��ϸ鼭 ");
		calculate();
		battery -= 1;
	}

}
