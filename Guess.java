package views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

public class Guess extends JFrame {

	private JPanel contentPane;
	JTextField tf1;
	JButton lb1;
	int count;
	JLabel lb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guess frame = new Guess();
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
	public Guess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(213, 213, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
				
		tf1 = new JTextField();
		tf1.setBorder(new LineBorder(new Color(128, 128, 128)));
		tf1.setBounds(59, 111, 146, 50);
		tf1.setColumns(15);
		contentPane.add(tf1);
		
		lb1 = new JButton("Make your guess");
		lb1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(171, 173, 179), null, null, null));
		lb1.setBounds(226, 110, 146, 51);
		contentPane.add(lb1);
		lb1.addActionListener(new ActionListener() {


			@Override
			public void actionPerformed(ActionEvent e) {
				String s = tf1.getText();
				int q =Integer.parseInt(s);
				count = (int) ((Math.random()*6)+1);
				if(q == count) {
					lb2.setText("You win!");
					JOptionPane.showMessageDialog(null, "you win");
				}else
					lb2.setText("Try Again " + "Number was: " + count);
					
			}
			
		});
		
		lb2 = new JLabel("Try it!");
		lb2.setHorizontalAlignment(SwingConstants.CENTER);
		lb2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb2.setBounds(59, 171, 313, 34);
		contentPane.add(lb2);//make sure you add
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Choose a number from 1 - 6, then press the button.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(59, 60, 313, 28);
		contentPane.add(lblNewLabel);
	}
}
