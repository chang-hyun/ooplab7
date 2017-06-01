package net.ubilife.oop.listener.style4;


import javax.swing.*;

/* This class shows how to use an event listener
 * by extending an adapter class in another class. 
 * This approach is a combination of style2 + style3.
 */
public class SimpleGUI  {

	private JFrame frame;
	private JButton btn;
	
	public void go() {
		frame = new JFrame("Simple GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn = new JButton("Click me!");
		
		// MyMouseAdapter is a mouse listener because it extends MouseAdapter.
		btn.addMouseListener(new MyMouseAdapter(btn));
		
		frame.add(btn);
		
		
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		SimpleGUI gui = new SimpleGUI();
		gui.go();		
	}

	

}
