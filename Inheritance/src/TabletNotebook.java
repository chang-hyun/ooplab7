
public class TabletNotebook extends NoteBookComp{

	String regstPenModel;
	
	
	public TabletNotebook(String name, int initChag , String pen)
	{
		super(name,initChag);
		regstPenModel = pen;
	}
	
	public void write(String penInfo)
	{
		if(battery < 1)
		{
			System.out.println("������ �ʿ��մϴ�.");
			return ;
		}
		
		if(regstPenModel.compareTo(penInfo)!=0)
		{
			System.out.println("��ϵ� ���� �ƴմϴ�.");
			return;
		}
		
		System.out.println("�ʱ� ������ ó���մϴ�.");
		battery -= 1;
	}

}
