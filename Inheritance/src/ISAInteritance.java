
public class ISAInteritance {

	public static void main(String[] args) 
	{
		NoteBookComp nc = new NoteBookComp("이수종",5);
		TabletNotebook tn = new TabletNotebook("정수영",5,"ISE241242");
		
		nc.movingCal();
		tn.write("ISE241242");

	}

}
