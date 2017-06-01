package net.ubilife.oop.listener.style4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

/* Here is an example of creating an event listener
 * in a separate class. In this case we extend MouseAdapter. 
 * This approach is useful if you want to use MouseAdapter but
 * the GUI class already extends another class. 
 * 
 * If this listener requires some objects from the GUI 
 * (e.g. a button), you have to pass those objects for example 
 * through constructor.
 */
public class MyMouseAdapter extends MouseAdapter {

	// We need to get a reference to this button object.
	// One way to do it is through constructor.
	private JButton btn;
	
	public MyMouseAdapter(JButton btn) {
		this.btn = btn;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		btn.setText("Clicked!");		
	}

}
