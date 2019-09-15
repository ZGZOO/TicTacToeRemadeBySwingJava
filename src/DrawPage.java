import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DrawPage {

	private JFrame frmPeace;
	private Board bd;
	private ChoosePlayer newGame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DrawPage window = new DrawPage();
//					window.frmPeace.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public DrawPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPeace = new JFrame();
		frmPeace.getContentPane().setBackground(Color.ORANGE);
		frmPeace.setTitle("Peace :)");
		frmPeace.setBounds(100, 100, 450, 300);
		frmPeace.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPeace.getContentPane().setLayout(null);
		
		JLabel drawLabel = new JLabel("Draw!");
		drawLabel.setFont(new Font("Phosphate", Font.PLAIN, 99));
		drawLabel.setHorizontalAlignment(SwingConstants.CENTER);
		drawLabel.setBounds(54, 36, 346, 130);
		frmPeace.getContentPane().add(drawLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(111, 178, 243, 56);
		frmPeace.getContentPane().add(panel);
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
		restartButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		panel.add(restartButton);
		
		JButton leaveButton = new JButton("Bye :P");
		leaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		leaveButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		panel.add(leaveButton);
	}
	
	public JFrame getFrame() {
		return this.frmPeace;
	}
	
	public void passBoardHere(Board board) {
		bd = board;
	}
}
