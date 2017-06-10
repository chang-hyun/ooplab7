import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Student extends JFrame implements Serializable{

	private ArrayList<Student> student = new ArrayList<Student>();
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	private String firstName;
	private String lastName;
	private boolean gender;
	private int age;
	private int semester;

	


	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JFileChooser fc = new JFileChooser();
	
	private ButtonGroup group = new ButtonGroup();
	
	
	
	private File file = fc.getSelectedFile();
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	private JFileChooser JFileChooser() {
		// TODO Auto-generated method stub
		return null;
	}



	
	public Student() {
		
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblFirstName = new JLabel("First Name");
		
		JLabel lblLastName = new JLabel("Last Name");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		
		JRadioButton rdbtnM = new JRadioButton("M");
		buttonGroup_1.add(rdbtnM);
		
		JRadioButton rdbtnF = new JRadioButton("F");
		buttonGroup_1.add(rdbtnF);
		group.add(rdbtnF);
		group.add(rdbtnM);
		JLabel lblAge = new JLabel("Age");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		
		JLabel lblSemester = new JLabel("Semester");
		
		JSpinner spinner = new JSpinner();
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(" ");
				textField_1.setText(" ");
				textField_2.setText(" ");
				spinner.setValue(1);
				group.clearSelection();
				rdbtnM.setSelected(false);
				rdbtnF.setSelected(false);
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int val = fc.showOpenDialog(null);

				if (val == JFileChooser.APPROVE_OPTION) {
					
					
					try {
						
						FileInputStream fs = new FileInputStream(fc.getSelectedFile());
						ObjectInputStream is = new ObjectInputStream(fs);
						Object o = is.readObject();
						
						
						if (o instanceof ArrayList) {
							student = ((ArrayList<Student>) o);
						} 
						else {
							JOptionPane.showMessageDialog(Student.this, "Wrong class type!", "Open failed",
									JOptionPane.ERROR_MESSAGE);
						}
						
						textField.setText(firstName);
						textField_1.setText(lastName);
						textField_2.setText(age+"");
						if(gender == true)
							rdbtnM.setSelected(true);
						else
							rdbtnF.setSelected(true);
						spinner.setValue(semester);
						
					} catch (IOException ioe) {
						JOptionPane.showMessageDialog(Student.this, "Cannot open file " + fc.getSelectedFile().getName(),
								"Open failed", JOptionPane.ERROR_MESSAGE);
					} catch (ClassNotFoundException cnfe) {
						JOptionPane.showMessageDialog(Student.this, "File does not contain a class!", "Open failed",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		
		mnFile.add(mntmOpen);

		
		
		
		
		
		
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int val = fc.showSaveDialog(null);
				
				if (val == JFileChooser.APPROVE_OPTION) {
					
					try {

						FileOutputStream fs = new FileOutputStream(fc.getSelectedFile());
						ObjectOutputStream os = new ObjectOutputStream(fs);
						
						os.writeObject(student);
						age = Integer.parseInt(textField_2.getText());
						firstName = textField.getText();
						lastName = textField_1.getText();
						if(rdbtnM.isSelected())
							gender = true;
						else
							gender = false;
						semester = (int) spinner.getValue();
						
						
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(Student.this,
								"Cannot write to file " + fc.getSelectedFile().getName(), "Save failed",
								JOptionPane.ERROR_MESSAGE);
						
					}catch(NumberFormatException e2)
					{
						JOptionPane.showMessageDialog(null, "Error : Please input only integers in Age");
					}
				}

			}
		});
		mnFile.add(mntmSave);

		
		

		
		
		
		
		
		
		
		
		
		
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				int result = JOptionPane.showConfirmDialog(null, "Are you sure?", "Exiting",
						JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.YES_OPTION) {
					System.exit(0);
				}

			}
		});
		mnFile.add(mntmExit);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "HWANG JAE JIN",
						"About Student", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		mnHelp.add(mntmAbout);
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(52)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSemester)
						.addComponent(lblAge)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblFirstName)
								.addGap(18)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblLastName)
									.addComponent(lblGender))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(rdbtnM)
										.addGap(18)
										.addComponent(rdbtnF))
									.addComponent(textField_1)
									.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
									.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(39, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(216, Short.MAX_VALUE)
					.addComponent(btnReset)
					.addGap(180))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFirstName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLastName)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGender)
						.addComponent(rdbtnM)
						.addComponent(rdbtnF))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAge)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSemester)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnReset)
					.addContainerGap(43, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
