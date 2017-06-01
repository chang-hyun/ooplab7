package net.ubilife.oop.listener.style2;


import javax.swing.*;

/* This class shows how to use an event listener
 * by another class that implements a listener
 */
public class SimpleGUI{

	private JFrame frame;
	private JButton btn;
	
	public void go() {
		frame = new JFrame("Simple GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn = new JButton("Click me!");
		
		// Here MouseListener is a MyMouseListener object, which 
		// implements MouseListener. 
		btn.addMouseListener(new MyMouseListener(btn));
		
		frame.add(btn);
		
		
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		SimpleGUI gui = new SimpleGUI();
		gui.go();		
	}


}
