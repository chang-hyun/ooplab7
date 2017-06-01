package net.ubilife.oop.listener.style2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

/* Here is an example of creating an event listener
 * in a separate class. If this listener requires some
 * objects from the GUI (e.g. a button), you have to pass
 * those objects for example through constructor.
 */
public class MyMouseListener implements MouseListener {

	// We need to get a reference to this button object.
	// One way to do it is through constructor.
	private JButton btn;
	
	public MyMouseListener(JButton btn) {
		this.btn = btn;
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
