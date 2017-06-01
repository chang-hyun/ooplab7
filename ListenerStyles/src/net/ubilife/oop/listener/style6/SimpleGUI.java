package net.ubilife.oop.listener.style6;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

/* This class shows how to create an event handler as
 * an anonymous inner class that implements MouseListener.
 * Experienced programmers use this approach sometimes 
 * (e.g. in StackOverflow).
 * 
 *  NOTE: this is very similar to style 7.
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
		// which implements MouseListener.
		btn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				btn.setText("Clicked!");				
			}
			
			// We don't need other listener methods, so 
			// they are just overridden as empty.
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			
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
