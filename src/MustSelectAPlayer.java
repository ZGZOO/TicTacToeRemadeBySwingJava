import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MustSelectAPlayer {

	private JFrame frmAttention;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MustSelectAPlayer window = new MustSelectAPlayer();
//					window.frmAttention.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public MustSelectAPlayer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAttention = new JFrame();
		frmAttention.getContentPane().setBackground(new Color(255, 248, 220));
		frmAttention.setTitle("Attention!");
		frmAttention.setType(Type.POPUP);
		frmAttention.setBounds(100, 100, 451, 141);
		frmAttention.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAttention.getContentPane().setLayout(null);
		
		JLabel attentionLabel = new JLabel("You must select a player!");
		attentionLabel.setFont(new Font("Courier", Font.PLAIN, 22));
		attentionLabel.setForeground(new Color(128, 0, 0));
		attentionLabel.setBackground(new Color(250, 250, 210));
		attentionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		attentionLabel.setBounds(63, 17, 328, 51);
		frmAttention.getContentPane().add(attentionLabel);
		
		JButton okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAttention.dispose();
			}
		});
		okButton.setBounds(165, 80, 117, 29);
		frmAttention.getContentPane().add(okButton);
	}
	
	public JFrame getFrame() {
		return this.frmAttention;
	}

}
