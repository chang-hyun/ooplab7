package code;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class FrameLayout2 extends JPanel {

	private static final long serialVersionUID = 1L;
	private SetBgrImg sbi;
	private SetChaImg sci;
	private JPanel mainPane;
	private JPanel textPan;
	private JLayeredPane lp;
	private JTextArea ta;
	private int chaCnt;
	private int bgrCnt;

	public JPanel getMain() {
		return mainPane;
	}

	public FrameLayout2() {
		mainPane = new JPanel();
		lp = new JLayeredPane();
		LayoutSet();
	}

	private void LayoutSet() {
		mainPane.setLayout(null);

		SetBgr("abcd.jpg"); //이건 나중에 지하 클래스에서 올리게 하자
		SetCha("fairy.png");
		
		SetText();
		MakeBtn();
		lp.setBounds(0, 0, Stat.FRAME_WIDTH, Stat.FRAME_HEIGHT);
		lp.add(textPan, JLayeredPane.MODAL_LAYER);

		lp.setVisible(true);
		mainPane.setVisible(true);
		mainPane.add(lp);
	}

	private void SetBgr(String file) {
		if (bgrCnt != 0)
			lp.remove(sbi);

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
		bgrCnt++;
	}

	private void SetCha(String file) {
		if (chaCnt != 0)
			lp.remove(sci);

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

		sci.setBounds((Stat.FRAME_WIDTH - ChaW) / 2, (Stat.FRAME_HEIGHT - ChaH) / 2, ChaW, ChaH);
		sci.setOpaque(false);
		//sci.repaint();
		lp.add(sci, JLayeredPane.PALETTE_LAYER);
		chaCnt++;
	}

	private void SetText() {
		textPan = new JPanel();
		textPan.setLayout(new BorderLayout());
		ta = new JTextArea();
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		ta.setFont(new Font("Comic Sans MS", Font.BOLD, 42));
		ta.setText("Hello my name is Fairy. Shall we learning about JAVA?");
		JScrollPane sp = new JScrollPane(ta);
		textPan.add(sp);
		textPan.setOpaque(true);
		textPan.setBounds((Stat.FRAME_WIDTH - 720) / 2, 500, 720, 180);
		textPan.setBackground(Color.BLACK);
	}

	// 지금은 버튼으로 배경이랑 캐릭터 바꾸는것만 구현함.
	private void MakeBtn() {
		JButton nextBtn = new JButton("NEXT");

		nextBtn.setOpaque(true);
		textPan.add(nextBtn, BorderLayout.EAST);
		nextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// contentPane.setVisible(false); //다음 프레임으로 넘어가기 위한 코드
				System.out.println("Change Will be soon");

				SetBgr("namae.png");
				SetCha("karen.png");
				ta.setText("Welcome to the HELL OOP class by Teemu.");
				
				mainPane.removeAll();
				mainPane.setVisible(false);
			}
		});
	}
}
