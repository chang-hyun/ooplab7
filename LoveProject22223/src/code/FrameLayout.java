package code;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;


public class FrameLayout extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	SetBgrImg sbi;
	JPanel BgPan;
	JLayeredPane lp = new JLayeredPane();

	public FrameLayout() {
		setTitle("♥ Love Simulator ♥");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, Stat.FRAME_WIDTH, Stat.FRAME_HEIGHT);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel CharicPan = new JPanel();
		BgPan = new JPanel();

		lp.add(BgPan, new Integer(0));
		lp.add(CharicPan, new Integer(1));
		lp.setBounds(0,0,1280,720);
		//lp.setVisible(false);
		contentPane.add(lp);
		
		SetChaImg sci = null;
		try {
			sci = new SetChaImg("karen.png");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int ChaH = sci.getImg().getHeight(null);
		System.out.println(ChaH);
		int ChaW = sci.getImg().getWidth(null);
		System.out.println(ChaW);
		sci.setBounds(0, 0, ChaH, ChaW);
		sci.setOpaque(false);
	
		CharicPan.setBounds((Stat.FRAME_WIDTH - ChaW) / 2, (Stat.FRAME_WIDTH - ChaH) / 2, ChaW, ChaH);
		//CharicPan.setBackground(new Color(255, 0, 0, 0)); // 투명한 패널 만드는 방법: new
															// Color(~)
		CharicPan.setOpaque(false);
		CharicPan.add(sci);
		
		BgPan.setBounds(0, 0, Stat.FRAME_WIDTH, Stat.FRAME_WIDTH);
		//BgPan.setOpaque(false);
		
		

		JPanel TalkPan = new JPanel();
		// TalkPan.setBackground(new Color(100,255,255,255));
		TalkPan.setOpaque(true);
		TalkPan.setBounds(200, 497, 863, 174);
		GroupLayout gl_CharicPan = new GroupLayout(CharicPan);
		gl_CharicPan.setHorizontalGroup(
				gl_CharicPan.createParallelGroup(Alignment.LEADING).addGap(0, 474, Short.MAX_VALUE));
		gl_CharicPan
				.setVerticalGroup(gl_CharicPan.createParallelGroup(Alignment.TRAILING).addGap(0, 552, Short.MAX_VALUE));
		CharicPan.setLayout(gl_CharicPan);
		contentPane.setLayout(null);
		contentPane.add(TalkPan);

		JPanel ButnPan = new JPanel();
		//TalkSpace ts = new TalkSpace();
		//TalkPan.add(ts.getTa());
		GroupLayout gl_TalkPan = new GroupLayout(TalkPan);
		gl_TalkPan.setHorizontalGroup(
			gl_TalkPan.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_TalkPan.createSequentialGroup()
					.addContainerGap(740, Short.MAX_VALUE)
					.addComponent(ButnPan, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
		);
		gl_TalkPan.setVerticalGroup(
			gl_TalkPan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_TalkPan.createSequentialGroup()
					.addGap(85)
					.addComponent(ButnPan, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		JButton NextBtn = new JButton("NEXT");
		NextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				//contentPane.setVisible(false);  //다음 프레임으로 넘어가기 위한 코드
				System.out.println("asdasdasfasd"); //invisible했을때 버튼이 남아있는지 체크하는 코드
				//LoveFrame.page = 4;  //실험중
				
//				ExamPan ep = new ExamPan();
//				
//				contentPane.removeAll();
//				contentPane.add(ep.pan);
//				contentPane.setVisible(true);
				
				SetBg("pgs.jpg");
				//getContentPane().repaint();
			}
		});
		
		
		NextBtn.setForeground(Color.PINK);
		NextBtn.setBackground(Color.PINK);
		NextBtn.setOpaque(true);
		ButnPan.add(NextBtn);
		TalkPan.setLayout(gl_TalkPan);
		//contentPane.add(CharicPan);  //레이어패널 테스트용!!!
		//contentPane.add(BgPan);

//		SetBgrImg sbi = null;
//		try {
//			sbi = new SetBgrImg("namae.png");
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		sbi.setBounds(0, 0, Stat.FrameWidth, Stat.FrameHeight);
//		getContentPane().add(sbi);
		
		SetBg("abcd.jpg");
		//SetBg("namae.png");
		
		

	}
	
	
	private void SetBg(String file)
	{
		SetBgrImg sbi = null;
		try {
			sbi = new SetBgrImg(file);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		//getContentPane().removeAll();
		sbi.setBounds(0, 0, Stat.FRAME_WIDTH, Stat.FRAME_HEIGHT);
		//getContentPane().add(sbi);
		//getContentPane().repaint();
		BgPan.add(sbi);
		BgPan.repaint();
		System.out.println("배경이미지 설정: "+file+sbi.getWidth());
		
	}
}
