import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinnerPage {

	private JFrame frmCongratulations;
	private String winner;
	private ChoosePlayer newGame;
	private Board bd;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					WinnerPage window = new WinnerPage();
//					window.frmCongratulations.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public WinnerPage(String winner) {
		this.winner = winner;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCongratulations = new JFrame();
		frmCongratulations.setTitle("Congratulations!");
		frmCongratulations.getContentPane().setBackground(new Color(255, 102, 102));
		frmCongratulations.setBounds(100, 100, 629, 231);
		frmCongratulations.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCongratulations.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(175, 149, 298, 42);
		frmCongratulations.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton restartButton = new JButton("Restart!");
		restartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().dispose();
				bd.dispose();
				newGame = new ChoosePlayer();
				newGame.setVisible(true);
			}
		});
		restartButton.setBackground(new Color(255, 250, 205));
		restartButton.setForeground(new Color(220, 20, 60));
		restartButton.setFont(new Font("Herculanum", Font.BOLD, 22));
		panel.add(restartButton);
		
		JButton endGame = new JButton("Leave -->");
		endGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		endGame.setBackground(new Color(255, 250, 205));
		endGame.setForeground(new Color(0, 100, 0));
		endGame.setFont(new Font("Kokonor", Font.PLAIN, 20));
		panel.add(endGame);
		
		JLabel winnerLabel = new JLabel(getWinner() + " wins!");
		winnerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		winnerLabel.setForeground(new Color(0, 0, 0));
		winnerLabel.setFont(new Font("American Typewriter", Font.ITALIC, 70));
		winnerLabel.setBounds(152, 25, 336, 98);
		frmCongratulations.getContentPane().add(winnerLabel);
	}
	
	public JFrame getFrame() {
		return this.frmCongratulations;
	}
	
	private String getWinner() {
		return this.winner;
	}
	
	public void passBoardHere(Board board) {
		bd = board;
	}

}
