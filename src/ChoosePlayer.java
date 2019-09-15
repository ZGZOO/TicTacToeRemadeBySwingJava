import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChoosePlayer extends JFrame {

	private JPanel contentPane;
	private String firstPlayer;
	private Board afterBoard;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoosePlayer frame = new ChoosePlayer();
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
	public ChoosePlayer() {
		setTitle("Choose your mark");	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel playerChoicesPanel = new JPanel();
		playerChoicesPanel.setBorder(null);
		playerChoicesPanel.setBackground(new Color(255, 228, 225));
		playerChoicesPanel.setBounds(161, 83, 117, 66);
		contentPane.add(playerChoicesPanel);
		
		JCheckBox chckbxPlayerX = new JCheckBox("Player X");
		playerChoicesPanel.add(chckbxPlayerX);
		
		JCheckBox chckbxPlayerO = new JCheckBox("Player O");	
		playerChoicesPanel.add(chckbxPlayerO);
		
		chckbxPlayerX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxPlayerO.setSelected(false);
				firstPlayer = "X";
				afterBoard = new Board(getPlayer1());
			}
		});
		
		chckbxPlayerO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxPlayerX.setSelected(false);
				firstPlayer = "O";
				afterBoard = new Board(getPlayer1());
			}
		});
		
		
		JLabel howToChooseLabel = new JLabel("First player chooses first. Second player automatically the other.");
		howToChooseLabel.setBounds(22, 24, 405, 40);
		contentPane.add(howToChooseLabel);
		
		JPanel playOrBackPanel = new JPanel();
		playOrBackPanel.setBackground(new Color(255, 228, 225));
		playOrBackPanel.setBounds(73, 189, 334, 66);
		contentPane.add(playOrBackPanel);
		playOrBackPanel.setLayout(null);
		
		JButton goBackButton = new JButton("Go back");
		goBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Playground first_page = new Playground();
				first_page.getFrame().setVisible(true);
			}
		});
		goBackButton.setBounds(26, 16, 117, 29);
		playOrBackPanel.add(goBackButton);
		
		JButton playButton = new JButton("Let's play!");
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPlayerX.isSelected() || chckbxPlayerO.isSelected()) {
					dispose();
					afterBoard.setVisible(true);
				}else {
					MustSelectAPlayer mustHavePlayer = new MustSelectAPlayer();
					mustHavePlayer.getFrame().setVisible(true);
				}
			}
		});
		playButton.setBounds(173, 16, 117, 29);
		playOrBackPanel.add(playButton);
	}
	
	public String getPlayer1() {
		return firstPlayer;
	}
}
