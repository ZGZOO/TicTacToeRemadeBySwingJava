import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Board extends JFrame {

	private JPanel contentPane;
	private String currentPlayer;
	private String winner;
	private JLabel whosTurn;
	private JButton button1_1,button1_2,button1_3,
					button2_1,button2_2,button2_3,
					button3_1,button3_2,button3_3;
	private JLabel resultLabel;
	private WinnerPage winnerPage;
	private DrawPage drawPage;
	private int clicks = 0;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Board frame = new Board(chsplayer.getPlayer1());
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Board(String curPlayer) {
		setTitle("Game is on!");		
		currentPlayer = curPlayer;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBackground(new Color(147, 112, 219));
		buttonsPanel.setBounds(47, 63, 363, 168);
		contentPane.add(buttonsPanel);
		buttonsPanel.setLayout(new GridLayout(3, 3, 0, 0));

		button1_1 = new JButton("");
		button1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1_1.setText(currentPlayer);
				changePlayer();
				button1_1.setEnabled(false);
				checkResult();
			}
		});
		buttonsPanel.add(button1_1);

		button1_2 = new JButton("");
		button1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1_2.setText(currentPlayer);
				changePlayer();
				button1_2.setEnabled(false);
				checkResult();
			}
		});
		buttonsPanel.add(button1_2);

		button1_3 = new JButton("");
		button1_3.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1_3.setText(currentPlayer);
				changePlayer();
				button1_3.setEnabled(false);
				checkResult();
			}
		});
		buttonsPanel.add(button1_3);

		button2_1 = new JButton("");
		button2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2_1.setText(currentPlayer);
				changePlayer();
				button2_1.setEnabled(false);
				checkResult();
			}
		});
		buttonsPanel.add(button2_1);

		button2_2 = new JButton("");
		button2_2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2_2.setText(currentPlayer);
				changePlayer();
				button2_2.setEnabled(false);
				checkResult();			
			}
		});
		buttonsPanel.add(button2_2);

		button2_3 = new JButton("");
		button2_3.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2_3.setText(currentPlayer);
				changePlayer();
				button2_3.setEnabled(false);
				checkResult();
			}
		});
		buttonsPanel.add(button2_3);

		button3_1 = new JButton("");
		button3_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button3_1.setText(currentPlayer);
				changePlayer();
				button3_1.setEnabled(false);
				checkResult();
			}
		});
		buttonsPanel.add(button3_1);

		button3_2 = new JButton("");
		button3_2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button3_2.setText(currentPlayer);
				changePlayer();
				button3_2.setEnabled(false);
				checkResult();
			}
		});
		buttonsPanel.add(button3_2);

		button3_3 = new JButton("");
		button3_3.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		button3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button3_3.setText(currentPlayer);
				changePlayer();
				button3_3.setEnabled(false);
				checkResult();		
			}
		});
		buttonsPanel.add(button3_3);

		whosTurn = new JLabel("");
		whosTurn.setFont(new Font("Zapfino", Font.PLAIN, 18));
		whosTurn.setHorizontalAlignment(SwingConstants.CENTER);
		whosTurn.setBounds(68, 6, 324, 53);
		whosTurn.setText("It is " + getCurrentPlayer() + "'s turn now.");
		contentPane.add(whosTurn);
		
		resultLabel = new JLabel("");
		resultLabel.setFont(new Font("Luminari", Font.PLAIN, 12));
		resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultLabel.setBounds(113, 241, 234, 29);
		resultLabel.setText("Who's gonna win?");
		contentPane.add(resultLabel);
	}

	public String getCurrentPlayer() {
		System.out.println("board get " + currentPlayer);
		return currentPlayer;
	}
	
	private void changePlayer() {
		if (currentPlayer.equals("X")) {
			currentPlayer = "O";
		}else {
			currentPlayer = "X";
		}
		whosTurn.setText("It is " + getCurrentPlayer() + "'s turn now.");
	}
	
	private boolean someoneWin() {
		if(!button1_1.getText().equals("") && !button1_2.getText().equals("") && !button1_3.getText().equals("") && 
				button1_1.getText().equals(button1_2.getText()) && button1_2.getText().equals(button1_3.getText())) {
			return true;
		}else if(!button2_1.getText().equals("") && !button2_2.getText().equals("") && !button2_3.getText().equals("") && 
				button2_1.getText().equals(button2_2.getText()) && button2_2.getText().equals(button2_3.getText())) {
			return true;
		}else if(!button3_1.getText().equals("") && !button3_2.getText().equals("") && !button3_3.getText().equals("") && 
				button3_1.getText().equals(button3_2.getText()) && button3_2.getText().equals(button3_3.getText())) {
			return true;
		}else if(!button1_1.getText().equals("") && !button2_1.getText().equals("") && !button3_1.getText().equals("") && 
				button1_1.getText().equals(button2_1.getText()) && button2_1.getText().equals(button3_1.getText())) {
			return true;
		}else if(!button1_2.getText().equals("") && !button2_2.getText().equals("") && !button3_2.getText().equals("") && 
				button1_2.getText().equals(button2_2.getText()) && button2_2.getText().equals(button3_2.getText())) {
			return true;
		}else if(!button1_3.getText().equals("") && !button2_3.getText().equals("") && !button3_3.getText().equals("") && 
				button1_3.getText().equals(button2_3.getText()) && button2_3.getText().equals(button3_3.getText())) {
			return true;
		}else if(!button1_1.getText().equals("") && !button2_2.getText().equals("") && !button3_3.getText().equals("") && 
				button1_1.getText().equals(button2_2.getText()) && button2_2.getText().equals(button3_3.getText())) {
			return true;
		}else if(!button1_3.getText().equals("") && !button2_2.getText().equals("") && !button3_1.getText().equals("") && 
				button1_3.getText().equals(button2_2.getText()) && button2_2.getText().equals(button3_1.getText())) {
			return true;
		}else {
			return false;
		}
	}
	
	private String winResult() {
		if (currentPlayer.equals("X")) {
			winner = "O";
		}else {
			winner = "X";
		}
		return winner;
	}
	
	private void openWinnerPage() {
		winnerPage = new WinnerPage(winResult());
		winnerPage.getFrame().setVisible(true);
		winnerPage.passBoardHere(this);
	}
	
	private void openDrawPage() {
		drawPage = new DrawPage();
		drawPage.getFrame().setVisible(true);
		drawPage.passBoardHere(this);
	}
	
	private void checkResult() {
		clicks++;
		System.out.print(clicks);
		if(someoneWin())
			openWinnerPage();
		else if(clicks == 9)
			openDrawPage();
		else
			resultLabel.setText("Who's gonna win?");		
	}
}
