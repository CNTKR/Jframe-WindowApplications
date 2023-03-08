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

public class Application2 extends JFrame {

	private JPanel contentPane;
	private JTextField TxtF1;
	private JTextField TextF2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application2 frame = new Application2();
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
	public Application2() {
		setBackground(new Color(0, 0, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 351);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(128, 255, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Head = new JLabel("Bubblesort App");
		Head.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Head.setBounds(185, 10, 144, 24);
		contentPane.add(Head);
		
		JLabel TxtL = new JLabel("Enter Values ");
		TxtL.setFont(new Font("Times New Roman", Font.BOLD, 20));
		TxtL.setBounds(52, 84, 127, 33);
		contentPane.add(TxtL);
		
		JLabel Result = new JLabel("Values After Sorting");
		Result.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Result.setBounds(52, 144, 189, 33);
		contentPane.add(Result);
		
		TxtF1 = new JTextField();
		TxtF1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		TxtF1.setBounds(233, 93, 257, 19);
		contentPane.add(TxtF1);
		TxtF1.setColumns(10);
		
		TextF2 = new JTextField();
		TextF2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		TextF2.setColumns(10);
		TextF2.setBounds(233, 153, 257, 19);
		contentPane.add(TextF2);
		
		JButton Start = new JButton("START");
		Start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data=TxtF1.getText();
				String[] arr=data.split(" ");
				String res="";
				String temp;
				for(int i=0;i<=arr.length-2;i++) {
					for(int j=0;j<=arr.length-2-i;j++) {
						if(Integer.valueOf(arr[j])>Integer.valueOf(arr[j+1])) {
							temp=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp;
						}
					}
				}
				for(int i=0;i<=arr.length-1;i++) {
				res=res+arr[i]+" ";
				}
				TextF2.setText(res);;
			}
		});
		Start.setBackground(new Color(0, 0, 128));
		Start.setFont(new Font("Tahoma", Font.BOLD, 20));
		Start.setBounds(196, 231, 127, 21);
		contentPane.add(Start);
	}
}
