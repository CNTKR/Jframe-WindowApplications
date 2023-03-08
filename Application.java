package windowap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;

public class Application extends JFrame {

	private JPanel contentpanel;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application frame = new Application();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Application() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 432);
		contentpanel = new JPanel();
		contentpanel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), new Color(128, 128, 64), new Color(0, 0, 0), new Color(192, 192, 192)));
		contentpanel.setBackground(new Color(255, 255, 0));

		setContentPane(contentpanel);
		contentpanel.setLayout(null);
		
		JLabel Head = new JLabel("Calculator App");
		Head.setForeground(new Color(0, 0, 255));
		Head.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Head.setBounds(268, 10, 173, 21);
		contentpanel.add(Head);
		
		JLabel labelA = new JLabel("A");
		labelA.setFont(new Font("Times New Roman", Font.BOLD, 20));
		labelA.setBounds(167, 71, 45, 13);
		contentpanel.add(labelA);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtA.setBounds(261, 67, 180, 19);
		contentpanel.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtB.setBounds(261, 107, 180, 19);
		contentpanel.add(txtB);
		txtB.setColumns(10);
		
		JLabel labelB = new JLabel("B");
		labelB.setFont(new Font("Times New Roman", Font.BOLD, 20));
		labelB.setBounds(167, 104, 45, 27);
		contentpanel.add(labelB);
		
		JLabel Result = new JLabel("Result");
		Result.setAutoscrolls(true);
		Result.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Result.setBounds(167, 153, 55, 24);
		contentpanel.add(Result);
		
		txtR = new JTextField();
		txtR.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtR.setColumns(10);
		txtR.setBounds(261, 155, 180, 19);
		contentpanel.add(txtR);
		
		JButton ADD = new JButton("ADD");
		ADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int	data1=Integer.valueOf(txtA.getText());
			int data2=Integer.valueOf(txtB.getText());
			int res=data1+data2;
			String var=String.valueOf(res);
			txtR.setText(var);
			}
		});
		ADD.setFont(new Font("Times New Roman", Font.BOLD, 20));
		ADD.setBounds(42, 276, 85, 21);
		contentpanel.add(ADD);
		
		JButton SUB = new JButton("SUB");
		SUB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int data1=Integer.valueOf(txtA.getText());
				int data2=Integer.valueOf(txtB.getText());
				int res=data1-data2;
				String var=String.valueOf(res);
				txtR.setText(var);
			}
		});
		SUB.setFont(new Font("Times New Roman", Font.BOLD, 20));
		SUB.setBounds(154, 276, 85, 21);
		contentpanel.add(SUB);
		
		JButton MUL = new JButton("MUL");
		MUL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int data1=Integer.valueOf(txtA.getText());
				int data2=Integer.valueOf(txtB.getText());
				int res=data1*data2;
				String var=String.valueOf(res);
				txtR.setText(var);
		
			}
		});
		MUL.setFont(new Font("Times New Roman", Font.BOLD, 20));
		MUL.setBounds(249, 276, 85, 21);
		contentpanel.add(MUL);
		
		JButton DIV = new JButton("DIV");
		DIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float data1=Float.valueOf(txtA.getText());
				float data2=Float.valueOf(txtB.getText());
				float res=data1/data2;
				String var=String.valueOf(res);
				txtR.setText(var);
				
			}
		});
		DIV.setFont(new Font("Times New Roman", Font.BOLD, 20));
		DIV.setBounds(356, 276, 85, 21);
		contentpanel.add(DIV);
		
		JButton REM = new JButton("REM");
		REM.setAlignmentY(Component.TOP_ALIGNMENT);
		REM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int data1=Integer.valueOf(txtA.getText());
				int data2=Integer.valueOf(txtB.getText());
				int res=data1%data2;
				String var=String.valueOf(res);
				txtR.setText(var);
			}
		});
		REM.setFont(new Font("Times New Roman", Font.BOLD, 20));
		REM.setBounds(468, 278, 85, 21);
		contentpanel.add(REM);
	}
}
