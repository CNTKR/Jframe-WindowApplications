package windowap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Application5 extends JFrame {

	private JPanel contentPane;
	private JTextField txtFA;
	private JTextField txtFR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application5 frame = new Application5();
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
	public Application5() {
		setBackground(new Color(255, 128, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 409);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 128, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Head = new JLabel("REVERSESTRING APP");
		Head.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Head.setForeground(new Color(255, 255, 0));
		Head.setBounds(160, 22, 216, 24);
		contentPane.add(Head);
		
		JLabel txtLA = new JLabel("Enter a String");
		txtLA.setForeground(Color.YELLOW);
		txtLA.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtLA.setBounds(35, 87, 216, 24);
		contentPane.add(txtLA);
		
		JLabel txtLR = new JLabel("Reversed String");
		txtLR.setForeground(Color.YELLOW);
		txtLR.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtLR.setBounds(35, 244, 216, 24);
		contentPane.add(txtLR);
		
		txtFA = new JTextField();
		txtFA.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtFA.setBounds(250, 92, 223, 19);
		contentPane.add(txtFA);
		txtFA.setColumns(10);
		
		txtFR = new JTextField();
		txtFR.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtFR.setColumns(10);
		txtFR.setBounds(250, 249, 223, 19);
		contentPane.add(txtFR);
		
		JButton START = new JButton("START");
		START.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data=txtFA.getText();
				StringBuilder sb=new StringBuilder(data);
				String reverse=sb.reverse().toString();
				txtFR.setText(reverse);
				
			}
		});
		START.setBackground(new Color(255, 255, 0));
		START.setBounds(166, 169, 85, 21);
		contentPane.add(START);
	}

}
