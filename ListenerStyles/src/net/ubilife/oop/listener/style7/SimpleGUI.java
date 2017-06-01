package net.ubilife.oop.listener.style7;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

/* This class shows how to create an event handler as
 * an anonymous inner class that extends MouseAdapter.
 * Experienced programmers use this approach sometimes 
 * (e.g. in StackOverflow).
 * 
 * NOTE: this is very similar to style 6.
 * 
 */

public class SimpleGUI  {

	private JFrame frame;
	private JButton btn;
	
	public void go() {
		frame = new JFrame("Simple GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn = new JButton("Click me!");
		
		// This strange code means that we create an "anonymous inner class"
		// which extends MouseAdapter.
		btn.addMouseListener(new MouseAdapter() {
			
			// We override only one listener method because
			// this anonymous inner class extends MouseAdapter.	
			@Override
			public void mouseClicked(MouseEvent e) {
				btn.setText("Clicked!");				
			}
		});
		
		frame.add(btn);		
		
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		SimpleGUI gui = new SimpleGUI();
		gui.go();		
	}
}
