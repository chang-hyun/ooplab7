package net.ubilife.oop.listener.style3;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

/* This class shows how to use an event listener
 * by extending an adapter class. Adapter classes
 * override listener methods as empty, so you can
 * then simply choose which methods you want to override.
 * This way you don't need to override empty methods
 * yourself.
 */
public class SimpleGUI extends MouseAdapter {

	private JFrame frame;
	private JButton btn;
	
	public void go() {
		frame = new JFrame("Simple GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn = new JButton("Click me!");
		
		// "this" is a MouseListener because this class extends MouseAdapter
		btn.addMouseListener(this);
		
		frame.add(btn);
		
		
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		SimpleGUI gui = new SimpleGUI();
		gui.go();		
	}

	// Because we extends MouseAdapter, we only
	// override those methods that we really need.
	
	@Override
	public void mouseClicked(MouseEvent e) {
		btn.setText("Clicked!");		
	}

}
