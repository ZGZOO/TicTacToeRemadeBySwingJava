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

	private JFrame playgroundFrame;
	private ChoosePlayer playerchoosing;
	private EncourageToPlay encourPlay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Playground window = new Playground();
					window.playgroundFrame.setVisible(true);
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
		playgroundFrame = new JFrame();
		playgroundFrame.setTitle("Tic Tac Toe!");
		playgroundFrame.getContentPane().setBackground(Color.PINK);
		playgroundFrame.setBounds(100, 100, 450, 300);
		playgroundFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		playgroundFrame.getContentPane().setLayout(null);
		
		JLabel welcomeLabel = new JLabel("Welcome to Tic Tac Toe!");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setFont(new Font("Impact", Font.PLAIN, 22));
		welcomeLabel.setBounds(120, 60, 222, 29);
		playgroundFrame.getContentPane().add(welcomeLabel);
		
		JButton btnYes = new JButton("Yes!");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playgroundFrame.dispose();
				playerchoosing = new ChoosePlayer();
				playerchoosing.setVisible(true);
			}
		});
		btnYes.setBounds(87, 162, 117, 29);
		playgroundFrame.getContentPane().add(btnYes);
		
		JButton btnMeh = new JButton("Later..");
		btnMeh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playgroundFrame.dispose();
				encourPlay = new EncourageToPlay();
				encourPlay.setVisible(true);
			}
		});
		btnMeh.setBounds(258, 162, 117, 29);
		playgroundFrame.getContentPane().add(btnMeh);
		
		JLabel readyOrNotLabel = new JLabel("Ready to play?");
		readyOrNotLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		readyOrNotLabel.setHorizontalAlignment(SwingConstants.CENTER);
		readyOrNotLabel.setBounds(181, 134, 102, 16);
		playgroundFrame.getContentPane().add(readyOrNotLabel);
	}
	
	public JFrame getFrame() {
		return this.playgroundFrame;
	}
}
