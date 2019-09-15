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
	private static ChoosePlayer chsplayer = new ChoosePlayer();
	private String currentPlayer;
	private JLabel whosTurn;
	private JButton button1_1,button1_2,button1_3,
					button2_1,button2_2,button2_3,
					button3_1,button3_2,button3_3;
	private JLabel resultLabel;
	private JButton restartGameButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board frame = new Board(chsplayer.getPlayer1());
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
	public Board(String curPlayer) {		
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
		buttonsPanel.setBounds(68, 63, 324, 138);
		contentPane.add(buttonsPanel);
		buttonsPanel.setLayout(new GridLayout(3, 3, 0, 0));

		button1_1 = new JButton("");
		button1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1_1.setText(currentPlayer);
				changePlayer();
				checkWin();
			}
		});
		buttonsPanel.add(button1_1);

		button1_2 = new JButton("");
		button1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1_2.setText(currentPlayer);
				changePlayer();
				checkWin();
			}
		});
		buttonsPanel.add(button1_2);

		button1_3 = new JButton("");
		button1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1_3.setText(currentPlayer);
				changePlayer();
				checkWin();
			}
		});
		buttonsPanel.add(button1_3);

		button2_1 = new JButton("");
		button2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2_1.setText(currentPlayer);
				changePlayer();
				checkWin();
			}
		});
		buttonsPanel.add(button2_1);

		button2_2 = new JButton("");
		button2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2_2.setText(currentPlayer);
				changePlayer();
				checkWin();
			}
		});
		buttonsPanel.add(button2_2);

		button2_3 = new JButton("");
		button2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2_3.setText(currentPlayer);
				changePlayer();
				checkWin();
			}
		});
		buttonsPanel.add(button2_3);

		button3_1 = new JButton("");
		button3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button3_1.setText(currentPlayer);
				changePlayer();
				checkWin();
			}
		});
		buttonsPanel.add(button3_1);

		button3_2 = new JButton("");
		button3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button3_2.setText(currentPlayer);
				changePlayer();
				checkWin();
			}
		});
		buttonsPanel.add(button3_2);

		button3_3 = new JButton("");
		button3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button3_3.setText(currentPlayer);
				changePlayer();
				checkWin();
			}
		});
		buttonsPanel.add(button3_3);

		whosTurn = new JLabel("");
		whosTurn.setHorizontalAlignment(SwingConstants.CENTER);
		whosTurn.setBounds(70, 23, 322, 36);
		whosTurn.setText("It is " + getCurrentPlayer() + "'s turn now.");
		contentPane.add(whosTurn);
		
		resultLabel = new JLabel("");
		resultLabel.setFont(new Font("Zapfino", Font.BOLD, 15));
		resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultLabel.setBounds(91, 213, 273, 52);
		resultLabel.setText("Who's gonna win?");
		contentPane.add(resultLabel);
		
		JButton endGameButton = new JButton("End Game");
		endGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(DISPOSE_ON_CLOSE);
			}
		});
		endGameButton.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		endGameButton.setBounds(376, 243, 68, 29);
		contentPane.add(endGameButton);	
		
		restartGameButton = new JButton("Restart Game");
		restartGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				chsplayer = new ChoosePlayer();
				chsplayer.setVisible(true);
			}
		});
		restartGameButton.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		restartGameButton.setBounds(6, 243, 85, 27);
		contentPane.add(restartGameButton);
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
	
	private void checkWin() {
		if(!button1_1.getText().equals("") && !button1_2.getText().equals("") && !button1_3.getText().equals("") && 
				button1_1.getText().equals(button1_2.getText()) && button1_2.getText().equals(button1_3.getText())) {
			resultLabel.setText(button1_1.getText() + " wins!");
			whosTurn.setText("There is a winner!");
		}else if(!button2_1.getText().equals("") && !button2_2.getText().equals("") && !button2_3.getText().equals("") && 
				button2_1.getText().equals(button2_2.getText()) && button2_2.getText().equals(button2_3.getText())) {
			resultLabel.setText(button2_1.getText() + " wins!");
			whosTurn.setText("There is a winner!");
		}else if(!button3_1.getText().equals("") && !button3_2.getText().equals("") && !button3_3.getText().equals("") && 
				button3_1.getText().equals(button3_2.getText()) && button3_2.getText().equals(button3_3.getText())) {
			resultLabel.setText(button3_1.getText() + " wins!");
			whosTurn.setText("There is a winner!");
		}else if(!button1_1.getText().equals("") && !button2_1.getText().equals("") && !button3_1.getText().equals("") && 
				button1_1.getText().equals(button2_1.getText()) && button2_1.getText().equals(button3_1.getText())) {
			resultLabel.setText(button1_1.getText() + " wins!");
			whosTurn.setText("There is a winner!");
		}else if(!button1_2.getText().equals("") && !button2_2.getText().equals("") && !button3_2.getText().equals("") && 
				button1_2.getText().equals(button2_2.getText()) && button2_2.getText().equals(button3_2.getText())) {
			resultLabel.setText(button1_2.getText() + " wins!");
			whosTurn.setText("There is a winner!");
		}else if(!button1_3.getText().equals("") && !button2_3.getText().equals("") && !button3_3.getText().equals("") && 
				button1_3.getText().equals(button2_3.getText()) && button2_3.getText().equals(button3_3.getText())) {
			resultLabel.setText(button1_3.getText() + " wins!");
			whosTurn.setText("There is a winner!");
		}else if(!button1_1.getText().equals("") && !button2_2.getText().equals("") && !button3_3.getText().equals("") && 
				button1_1.getText().equals(button2_2.getText()) && button2_2.getText().equals(button3_3.getText())) {
			resultLabel.setText(button1_1.getText() + " wins!");
			whosTurn.setText("There is a winner!");
		}else if(!button1_3.getText().equals("") && !button2_2.getText().equals("") && !button3_1.getText().equals("") && 
				button1_3.getText().equals(button2_2.getText()) && button2_2.getText().equals(button3_1.getText())) {
			resultLabel.setText(button1_3.getText() + " wins!");
			whosTurn.setText("There is a winner!");
		}else {
			resultLabel.setText("Who's gonna win?");
		}
	}
}
