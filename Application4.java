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
public class Application4 extends JFrame {
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
					Application4 frame = new Application4();
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
	public Application4() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 395);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Head = new JLabel("BINARYSEARCH APP");
		Head.setForeground(new Color(0, 0, 0));
		Head.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Head.setBackground(new Color(255, 255, 255));
		Head.setBounds(179, 26, 206, 24);
		contentPane.add(Head);
		
		JLabel txtLA = new JLabel("Enter 5 Numbers");
		txtLA.setForeground(Color.BLACK);
		txtLA.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtLA.setBackground(Color.WHITE);
		txtLA.setBounds(26, 75, 206, 24);
		contentPane.add(txtLA);
		
		JLabel txtLB = new JLabel("Enter Key to Search");
		txtLB.setForeground(Color.BLACK);
		txtLB.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtLB.setBackground(Color.WHITE);
		txtLB.setBounds(26, 128, 206, 24);
		contentPane.add(txtLB);
		
		JLabel txtLR = new JLabel("RESULT");
		txtLR.setForeground(Color.BLACK);
		txtLR.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtLR.setBackground(Color.WHITE);
		txtLR.setBounds(26, 197, 206, 24);
		contentPane.add(txtLR);
		
		txtFA = new JTextField();
		txtFA.setBounds(242, 80, 235, 19);
		contentPane.add(txtFA);
		txtFA.setColumns(10);
		
		txtFB = new JTextField();
		txtFB.setColumns(10);
		txtFB.setBounds(242, 133, 235, 19);
		contentPane.add(txtFB);
		
		txtFR = new JTextField();
		txtFR.setColumns(10);
		txtFR.setBounds(242, 202, 235, 19);
		contentPane.add(txtFR);
		
		JButton START = new JButton("START");
		START.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data=txtFA.getText();
				String arr[]=data.split(" ");
				int key=Integer.valueOf(txtFB.getText());
				String result="";
				int low=0;
				int high=arr.length-1;
				int mid = 0;
				boolean found=false;
				while(low<=high) {
					 mid=(low+high)/2;
					if(key==Integer.valueOf(arr[mid])) {
						found=true;
						break;
					}
					else if(key>Integer.valueOf(arr[mid])){
						low=mid+1;
						high=high;
					}
					else if (key<Integer.valueOf(arr[mid])){
						high=mid-1;
						low=low;
					}
					}
				if(found) {
					result=result+"Key Found@ "+mid;
				}
				else {
					result="Key Not Found";
				}
				txtFR.setText(result);
				}
		});
		START.setBackground(new Color(128, 128, 128));
		START.setBounds(179, 281, 206, 21);
		contentPane.add(START);
	}
}
