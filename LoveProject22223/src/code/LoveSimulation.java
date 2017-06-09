package code;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class LoveSimulation extends JFrame{
	
	private Music bgm;
	
	
	//private Image background = new ImageIcon("introBackground.jpg").getImage();
	private Image background = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
	
	
	
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
	
	

	private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png"));
	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png"));
	private JButton exitButton = new JButton(exitButtonBasicImage);
	private JButton exitButton2 = new JButton(exitButtonBasicImage);
	
	
	private ImageIcon quitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));
	private ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));
	private ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
	private ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
	private JButton startButton = new JButton(startButtonBasicImage);
	private JButton quitButton = new JButton(quitButtonBasicImage);
	
    private int pointX , pointY;
    
    
    
    
    
    public LoveSimulation()
	{
    	setUndecorated(true);
    	setTitle("LoveSimulation");
		setSize(1280,720);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		//basical setting
		
		
		JPanel p1 = new JPanel(){
            public void paintComponent(Graphics g) {
                g.drawImage(background, 0, 0, null);
                setOpaque(false);
                super.paintComponent(g);
               } 
        };
		
		p1.setBounds(0, 0, 1280, 720);
        p1.setLayout(null);
        p1.add(exitButton);
        p1.add(quitButton);
        p1.add(startButton);
        p1.add(menuBar);
        
        add(p1);
	
        p1.setVisible(true);
        
        JPanel p2 = new JPanel(){
            public void paintComponent(Graphics g) {
                g.drawImage(background, 0, 0, null);
                setOpaque(false);
                super.paintComponent(g);
               } 
        };

        p2.setBounds(0, 0, 1280, 720);
        p2.setLayout(null);
        p2.add(exitButton2);
        p2.add(menuBar);
        add(p2);
        
        
		
        
        ///////////////////////////////////////
		//setting exit button 
		exitButton.setBounds(1245, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
				buttonEnteredMusic.start();
			}
			
			
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		
		exitButton2.setBounds(1245, 0, 30, 30);
		exitButton2.setBorderPainted(false);
		exitButton2.setContentAreaFilled(false);
		exitButton2.setFocusPainted(false);
		exitButton2.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton2.setIcon(exitButtonEnteredImage);
				exitButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
				buttonEnteredMusic.start();
			}
			
			
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton2.setIcon(exitButtonBasicImage);
				exitButton2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		
		
		
		
		
		///////////////////////////////////////
		//setting start button 
		startButton.setBounds(800, 200, 400, 100);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
				buttonEnteredMusic.start();
			}
			
			
			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setIcon(startButtonBasicImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
				bgm.close();
				background = new ImageIcon(Main.class.getResource("../images/school.jpg")).getImage();
				p1.setVisible(false);
			}
		});
		
		
		
		///////////////////////////////////////
		//setting quit button 
		quitButton.setBounds(800, 330, 400, 100);
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false);
		quitButton.setFocusPainted(false);
		quitButton.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseEntered(MouseEvent e) {
				quitButton.setIcon(quitButtonEnteredImage);//quitButton을 quitButtonEnteredImage로 change
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));//cursor를 손 모양으로 바꿈
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);//cursor가 위로 올라 갔을 때 음악 나옴
				buttonEnteredMusic.start();//cursor가 위로 올라 갔을 때 음악 나옴
			}
			
			
			@Override
			public void mouseExited(MouseEvent e) {
				quitButton.setIcon(quitButtonBasicImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3", false);
				buttonEnteredMusic.start();
				try {
					Thread.sleep(1000); // exitButton을 눌렀을 때 1초 있다가 창이 종료됨.(이거 없으면 창이 바로 꺼져서 exitButton눌렀을 때 소리 안들림)
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		
		
		
		
		///////////////////////////////////////
		//setting menuBar 
		menuBar.setBounds(0, 0, 1280, 30);
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pointX = e.getX();
				pointY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - pointX, y - pointY);
			}
		});
	
		 
		
		///////////////////////////////////////
		//start bgm 
		bgm = new Music("bgm.mp3",true);
		bgm.start();
        
		
        
	}
   
    
}
