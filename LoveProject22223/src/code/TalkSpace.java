package code;

import javax.swing.JTextArea;

public class TalkSpace {

	private String temp = "I saw a girl named Whore. She is very pretty like a bitch. Fucking JAVA girl it is. Suck my penis, ass.";
	private JTextArea ta;
	
	public String getTemp() {
		return temp;
	}

	public JTextArea getTa() {
		return ta;
	}
	
	public void Talking()
	{
		ta = new JTextArea();
		ta.setText(temp);
	}
	
	
	
	
	
	
	
	
}
