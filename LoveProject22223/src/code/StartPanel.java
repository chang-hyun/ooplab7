package code;

import javax.swing.JPanel;

public class StartPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	
	public StartPanel(int w, int h) {

		Start(w, h);
	
	}

	private JPanel Start(int w, int h)
	{
		JPanel pan = new JPanel();
		
		pan.setSize(w, h);
		
		
		
		//pan.setVisible(true);
		
		return pan;
	}
	
}
