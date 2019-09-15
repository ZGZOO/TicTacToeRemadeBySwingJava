import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class EncourageToPlay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EncourageToPlay frame = new EncourageToPlay();
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
	public EncourageToPlay() {
		setType(Type.NORMAL);
		setForeground(new Color(255, 127, 80));
		setBackground(new Color(255, 127, 80));
		setTitle("Come on try it!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(143, 188, 143));
		contentPane.setForeground(new Color(255, 127, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel introductionLabel = new JLabel("<html><p>Tic-tac-toe (American English), noughts and crosses (British English), "
				+ "or Xs and Os is a paper-and-pencil game for two players, X and O, who take turns marking the spaces in a 3×3 grid. "
				+ "The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game."
				+ "<br/>Interested in playing this game now?</p></html>");
		introductionLabel.setBackground(new Color(255, 218, 185));
		introductionLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		introductionLabel.setVerticalAlignment(SwingConstants.TOP);
		introductionLabel.setToolTipText("");
		introductionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		introductionLabel.setBounds(6, 25, 438, 140);
		contentPane.add(introductionLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(50, 192, 354, 54);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 10));
		
		JButton playButton = new JButton("Play!");
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ChoosePlayer playerchoosing = new ChoosePlayer();
				playerchoosing.setVisible(true);
			}
		});
		playButton.setForeground(new Color(220, 20, 60));
		playButton.setFont(new Font("Marker Felt", Font.PLAIN, 24));
		panel.add(playButton);
		
		JButton quitButton = new JButton("Quit..");
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				System.exit(DISPOSE_ON_CLOSE);
			}
		});
		quitButton.setForeground(new Color(30, 144, 255));
		quitButton.setFont(new Font("Papyrus", Font.PLAIN, 22));
		panel.add(quitButton);
	}

}
