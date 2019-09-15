import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Playground {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Playground window = new Playground();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Playground() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Tic Tac Toe!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 22));
		lblNewLabel.setBounds(120, 60, 222, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnYes = new JButton("Yes!");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				ChoosePlayer playerchoosing = new ChoosePlayer();
				playerchoosing.setVisible(true);
			}
		});
		btnYes.setBounds(87, 162, 117, 29);
		frame.getContentPane().add(btnYes);
		
		JButton btnMeh = new JButton("Later..");
		btnMeh.setBounds(258, 162, 117, 29);
		frame.getContentPane().add(btnMeh);
		
		JLabel lblNewLabel_1 = new JLabel("Ready to play?");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(181, 134, 102, 16);
		frame.getContentPane().add(lblNewLabel_1);
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
}
