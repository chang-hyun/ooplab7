package code;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class ExamPan extends MouseAdapter
{
	private JPanel mainp;
	private JPanel prop; //문제패널
	private JPanel chop1; //선택지패널
	private JPanel chop2; //선택지패널
	private JPanel chop3; //선택지패널
	private JPanel chop4; //선택지패널
	private JButton cho1;
	private JButton cho2;
	private JButton cho3;
	private JButton cho4;
	private JLayeredPane lp;
	private SetBgrImg sbi;
	private SetChaImg sci;
	private Exams ex;
	private JLabel result;
	
	public ExamPan(int number)
	{
		ex = new Exams(number);
		mainp = new JPanel();
		mainp.setSize(Stat.FRAME_WIDTH, Stat.FRAME_HEIGHT);
		mainp.setLayout(null);
		
		makePane();
		SetBgr("namae.png");
		SetCha("karen.png");
		//drawBln();

		mainp.setVisible(true);
	}
	
	public JPanel getMain()
	{
		return mainp;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		int btnnum = 0;
		if (e.getSource().equals(cho1))
			btnnum = 1;
		if (e.getSource().equals(cho2))
			btnnum = 2;
		if (e.getSource().equals(cho3))
			btnnum = 3;
		if (e.getSource().equals(cho4))
			btnnum = 4;
		
		if(btnnum == ex.getAnswer())
		{
			System.out.println("맞았어");
			result.setForeground(Color.GREEN);
			result.setText("TRUE!!");
		}
		else
		{
			System.out.println("틀렸어");
			result.setForeground(Color.RED);
			result.setText("FALSE!!");
		}

	}
	
	private void makePane()
	{
		lp = new JLayeredPane();
		prop = new JPanel();
		chop1 = new JPanel();
		chop2 = new JPanel();
		chop3 = new JPanel();
		chop4 = new JPanel();
		
		prop.setBounds(400, 100, 800, 80);
		//prop.setOpaque(false);
		JLabel lb = new JLabel();
		lb.setFont(new Font("Malgun Gothic", Font.BOLD, 40));
		lb.setText(ex.getProblem());
		prop.add(lb);
		
		chop1.setBounds(600, 230, 600, 80);
		cho1 = new JButton();
		cho1.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
		cho1.addMouseListener(this);
		chop1.setLayout(new BorderLayout());
		cho1.setText(ex.getChoice().get(0));
		chop1.add(cho1, BorderLayout.CENTER);
		
		chop2.setBounds(600, 340, 600, 80);
		cho2 = new JButton();
		cho2.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
		cho2.addMouseListener(this);
		chop2.setLayout(new BorderLayout());
		cho2.setText(ex.getChoice().get(1));
		chop2.add(cho2, BorderLayout.CENTER);
		
		chop3.setBounds(600, 450, 600, 80);
		cho3 = new JButton();
		cho3.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
		cho3.addMouseListener(this);
		chop3.setLayout(new BorderLayout());
		cho3.setText(ex.getChoice().get(2));
		chop3.add(cho3, BorderLayout.CENTER);
		
		chop4.setBounds(600, 560, 600, 80);
		cho4 = new JButton();
		cho4.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
		cho4.addMouseListener(this);
		chop4.setLayout(new BorderLayout());
		cho4.setText(ex.getChoice().get(3));
		chop4.add(cho4, BorderLayout.CENTER);
		
		result = new JLabel("");
		result.setText("Solve it!");
		result.setFont(new Font("Comic Sans MS", Font.BOLD, 80));
		result.setForeground(Color.BLACK);
		result.setBounds(73, 115, 324, 200);
		lp.add(result, JLayeredPane.PALETTE_LAYER);
		
		lp.setBounds(0, 0, Stat.FRAME_WIDTH, Stat.FRAME_HEIGHT);
		lp.add(chop1, JLayeredPane.PALETTE_LAYER);
		lp.add(chop2, JLayeredPane.PALETTE_LAYER);
		lp.add(chop3, JLayeredPane.PALETTE_LAYER);
		lp.add(chop4, JLayeredPane.PALETTE_LAYER);
		lp.add(prop, JLayeredPane.PALETTE_LAYER);
		lp.setVisible(true);
		mainp.add(lp);
	}
	
	private void SetCha(String file) {
		sci = null;
		try {
			sci = new SetChaImg(file);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		int ChaH = sci.getImg().getHeight(null);
		System.out.println(ChaH);
		int ChaW = sci.getImg().getWidth(null);
		System.out.println(ChaW);

		sci.setBounds((Stat.FRAME_WIDTH - ChaW) / 8, (Stat.FRAME_HEIGHT - ChaH), ChaW, ChaH);
		sci.setOpaque(false);
		//sci.repaint();
		lp.add(sci, JLayeredPane.PALETTE_LAYER);
	}
	
	private void SetBgr(String file) {
		sbi = null;
		try {
			sbi = new SetBgrImg(file);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		sbi.setBounds(0, 0, Stat.FRAME_WIDTH, Stat.FRAME_HEIGHT);
		//sbi.repaint();
		lp.add(sbi, JLayeredPane.DEFAULT_LAYER);

		System.out.println("배경이미지 설정: " + file + sbi.getWidth());
	}
	
//	private void drawBln() {
//		SetChaImg sci2 = null;
//		try {
//			sci2 = new SetChaImg("prob.png");
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		int ChaH = sci2.getImg().getHeight(null);
//		System.out.println(ChaH);
//		int ChaW = sci2.getImg().getWidth(null);
//		System.out.println(ChaW);
//
//		sci2.setBounds(0,0, ChaW, ChaH);
//		sci2.setOpaque(false);
//		//sci.repaint();
//		lp.add(sci2, JLayeredPane.PALETTE_LAYER);
//	}
}