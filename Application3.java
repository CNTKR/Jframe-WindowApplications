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

public class Application3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtFA;
	private JTextField txtFB;
	private JTextField txtFR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application3 frame = new Application3();
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
	public Application3() {
		setBackground(new Color(128, 255, 128));
		setForeground(new Color(255, 128, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 374);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 0, 128));
		contentPane.setBorder(new LineBorder(new Color(255, 128, 64), 1, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Head = new JLabel("LINEARSEARCH APP");
		Head.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Head.setForeground(new Color(255, 255, 255));
		Head.setBounds(151, 10, 205, 24);
		contentPane.add(Head);
		
		JLabel txtLA = new JLabel("Enter 5 Numbers");
		txtLA.setForeground(Color.WHITE);
		txtLA.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtLA.setBounds(42, 71, 205, 24);
		contentPane.add(txtLA);
		
		JLabel txtLB = new JLabel("Enter Key to Search");
		txtLB.setForeground(Color.WHITE);
		txtLB.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtLB.setBounds(42, 133, 205, 24);
		contentPane.add(txtLB);
		
		JLabel txtLR = new JLabel("RESULT");
		txtLR.setForeground(Color.WHITE);
		txtLR.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtLR.setBounds(42, 205, 205, 24);
		contentPane.add(txtLR);
		
		txtFA = new JTextField();
		txtFA.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtFA.setBounds(282, 76, 226, 19);
		contentPane.add(txtFA);
		txtFA.setColumns(10);
		
		txtFB = new JTextField();
		txtFB.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtFB.setColumns(10);
		txtFB.setBounds(282, 133, 226, 19);
		contentPane.add(txtFB);
		
		txtFR = new JTextField();
		txtFR.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtFR.setColumns(10);
		txtFR.setBounds(282, 205, 226, 19);
		contentPane.add(txtFR);
		
		JButton START = new JButton("START");
		START.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result="";
				boolean found=false;
				int i=0;
				String data=txtFA.getText();
				String arr[]=data.split(" ");
				int key=Integer.valueOf(txtFB.getText());
				for(i=0;i<=arr.length-1;i++){
					if(key==Integer.valueOf(arr[i])){
						found=true;
						break;
					}
					}
				if(found) {
					result=result+"Found Key@"+(i+1);
				}
				else {
					result="Key Not Found";
				}
				txtFR.setText(result);
			}	
		});
		START.setBackground(new Color(128, 255, 128));
		START.setFont(new Font("Times New Roman", Font.BOLD, 20));
		START.setBounds(151, 264, 205, 21);
		contentPane.add(START);
	}

}
