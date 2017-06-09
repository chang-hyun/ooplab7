package code;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class SetBgrImg extends JPanel {
	private static final long serialVersionUID = 1L;
	private Image img;
	
	public SetBgrImg(String filename) throws IOException
	{
		img = ImageIO.read(new File(filename));
		System.out.println("불러온 이미지: "+img.getWidth(null));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, null);
	}
}
