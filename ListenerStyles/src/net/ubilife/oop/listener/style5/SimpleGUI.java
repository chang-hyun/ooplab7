package net.ubilife.oop.listener.style5;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

/* This class shows how to create an event handler as
 * an inner class. Here the inner class extends MouseAdapter;
 * instead, it could implement some listener interface.
 */
public class SimpleGUI  {

	private JFrame frame;
	private JButton btn;
	
	public void go() {
		frame = new JFrame("Simple GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn = new JButton("Click me!");
		
		// MyMouseAdapter is a mouse listener because it extends MouseAdapter.
		btn.addMouseListener(new MyMouseAdapter());
		
		frame.add(btn);
		
		
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		SimpleGUI gui = new SimpleGUI();
		gui.go();		
	}
	
	/* This class is a mouse listener by extending MouseAdapter. 
	 * 
	 * NOTE: compared to style 2 and style 4, we don't need to 
	 * pass btn as constructor parameter because MyMouseAdapter
	 * can access any instance variable of SimpleGUI because
	 * MyMouseAdapter is inside SimpleGUI. 
	 */
	class MyMouseAdapter extends MouseAdapter {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			btn.setText("Clicked!");		
		}
	}

	

}
