package net.ubilife.oop.listener.style1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

/* This class shows how to use an event listener
 * by implementing an interface directly in the main GUI class.
 * 
 * NOTE: This is the most common way of handling GUI events!
 */
public class SimpleGUI implements MouseListener{

	private JFrame frame;
	private JButton btn;
	
	public void go() {
		frame = new JFrame("Simple GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn = new JButton("Click me!");
		
		// "this" is a MouseListener because we implement the interface
		// in the same class.
		btn.addMouseListener(this);
		
		frame.add(btn);
		
		
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		SimpleGUI gui = new SimpleGUI();
		gui.go();		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		btn.setText("Clicked!");		
	}

	// MouseListener has 5 methods, so we override those empty
	// that we don't need.
	
	@Override
	public void mousePressed(MouseEvent e) { }

	@Override
	public void mouseReleased(MouseEvent e) { }

	@Override
	public void mouseEntered(MouseEvent e) { }

	@Override
	public void mouseExited(MouseEvent e) {	}

}
