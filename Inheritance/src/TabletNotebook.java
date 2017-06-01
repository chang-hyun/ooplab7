
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
			System.out.println("충전이 필요합니다.");
			return ;
		}
		
		if(regstPenModel.compareTo(penInfo)!=0)
		{
			System.out.println("등록된 펜이 아닙니다.");
			return;
		}
		
		System.out.println("필기 내용을 처리합니다.");
		battery -= 1;
	}

}
