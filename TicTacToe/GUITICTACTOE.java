package TicTacToe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class GUITICTACTOE {

	private JFrame frmTicTacToe;
	private JTextField xCount;
	private JTextField oCount;
	private int xCount1=0;
	private int oCount1=0;
	private String startGame="X";
	
	// Declare the Variable
	private int bot1=10, bot2=10, bot3=10,
				bot4=10, bot5=10, bot6=10,
				bot7=10, bot8=10, bot9=10, i=0;
	

	// Lunching the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUITICTACTOE window = new GUITICTACTOE();
					window.frmTicTacToe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public GUITICTACTOE() {
		initialize();
	}

	// The battle Scoring 	
	private void winningGame()
	{
		
	// Countings for Player X
			
		// Possible score for Horizontal Line
		if(bot1==1 && bot2==1 && bot3==1)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		}
		else if(bot4==1 && bot5==1 && bot6==1)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		}
		else if(bot7==1 && bot8==1 && bot9==1)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		}
		
		// Possible score for Vertical Line
		else if(bot1==1 && bot4==1 && bot7==1)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		}
		else if(bot2==1 && bot5==1 && bot8==1)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		}
		else if(bot3==1 && bot6==1 && bot9==1)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		}
		
		
		// Possible score for Slanting Line
		else if(bot1==1 && bot5==1 && bot9==1)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		}
		else if(bot3==1 && bot5==1 && bot7==1)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		}
		
						
	// Countings for Player X
		
		// Possible score for Horizontal Line
		else if(bot1==0 && bot2==0 && bot3==0)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		else if(bot4==0 && bot5==0 && bot6==0)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		else 	if(bot7==0 && bot8==0 && bot9==0)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		
		// Possible score for Vertical Line
		else if(bot1==0 && bot4==0 && bot7==0)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		else if(bot2==0 && bot5==0 && bot8==0)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		else if(bot3==0 && bot6==0 && bot9==0)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		
		// Possible score Slanting Line
		else if(bot1==0 && bot5==0 && bot9==0)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		else if(bot3==0 && bot5==0 && bot7==0)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		else if(i==9)
		{
			JOptionPane.showMessageDialog(frmTicTacToe, "No One Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);

		}

		
	}
	
		
		// Declare the function of Buttons 
		private void choosePlayer()
		{
		if(startGame.equalsIgnoreCase("X"))
		{
			startGame="O";
		}
		else
		{
			startGame="X";
		}
	}
		
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("TIC TAC TOE");
		frmTicTacToe.getContentPane().setForeground(new Color(0, 0, 0));
		frmTicTacToe.getContentPane().setBackground(new Color(0, 0, 0));
		frmTicTacToe.setForeground(new Color(204, 0, 0));
		frmTicTacToe.setBounds(100, 100, 642, 433);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(51, 0, 102), 6));
		frmTicTacToe.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 51));
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayerX = new JLabel("PLAYER X");
		lblPlayerX.setForeground(new Color(255, 255, 255));
		lblPlayerX.setBackground(new Color(255, 255, 255));
		lblPlayerX.setFont(new Font("Serif", Font.BOLD, 23));
		lblPlayerX.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblPlayerX, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 51, 51), new Color(102, 0, 0)));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			
			// This will indicate the battle with other players
			public void actionPerformed(ActionEvent arg0) {
				btn1.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn1.setForeground(Color.RED);
					bot1=1;
					i++;
				}
				else 
				{
					btn1.setForeground(Color.YELLOW);
					bot1=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 80));
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setBackground(Color.BLACK);
		panel_3.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 0));
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 51, 51), new Color(102, 0, 0)));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				btn2.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn2.setForeground(Color.RED);
					bot2=1;
					i++;
				}
				else 
				{
					btn2.setForeground(Color.YELLOW);
					bot2=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 80));
		btn2.setBackground(new Color(0, 0, 0));
		panel_4.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 0, 0));
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 51, 51), new Color(102, 0, 0)));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				btn3.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn3.setForeground(Color.RED);
					bot3=1;
					i++;
				}
				else 
				{
					btn3.setForeground(Color.YELLOW);
					bot3=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
			
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 80));
		btn3.setBackground(new Color(0, 0, 0));
		panel_5.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setForeground(new Color(255, 255, 255));
		panel_6.setBackground(new Color(0, 0, 51));
		panel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 51, 51), new Color(102, 0, 0)));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayerO = new JLabel("O PLAYER");
		lblPlayerO.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerO.setFont(new Font("Serif", Font.BOLD, 23));
		lblPlayerO.setForeground(new Color(255, 255, 255));
		panel_6.add(lblPlayerO, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(255, 255, 255));
		panel_2.setBackground(new Color(0, 0, 51));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 51, 51), new Color(102, 0, 0)));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		xCount = new JTextField();
		xCount.setFont(new Font("Times New Roman", Font.BOLD, 80));
		xCount.setHorizontalAlignment(SwingConstants.CENTER);
		xCount.setText("0");
		panel_2.add(xCount, BorderLayout.CENTER);
		xCount.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 0, 0));
		panel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 51, 51), new Color(102, 0, 0)));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				btn4.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn4.setForeground(Color.RED);
					bot4=1;
					i++;
				}
				else 
				{
					btn4.setForeground(Color.YELLOW);
					bot4=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 80));
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setBackground(new Color(0, 0, 0));
		panel_7.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(0, 0, 0));
		panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 51, 51), new Color(102, 0, 0)));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				btn5.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn5.setForeground(Color.RED);
					bot5=1;
					i++;
				}
				else 
				{
					btn5.setForeground(Color.YELLOW);
					bot5=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 80));
		btn5.setBackground(new Color(0, 0, 0));
		panel_8.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(0, 0, 0));
		panel_9.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 51, 51), new Color(102, 0, 0)));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				btn6.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn6.setForeground(Color.RED);
					bot6=1;
					i++;
				}
				else 
				{
					btn6.setForeground(Color.YELLOW);
					bot6=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 80));
		btn6.setBackground(new Color(0, 0, 0));
		panel_9.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setForeground(new Color(255, 255, 255));
		panel_10.setBackground(new Color(0, 0, 51));
		panel_10.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 51, 51), new Color(102, 0, 0)));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		oCount = new JTextField();
		oCount.setFont(new Font("Times New Roman", Font.BOLD, 80));
		oCount.setHorizontalAlignment(SwingConstants.CENTER);
		oCount.setText("0");
		panel_10.add(oCount, BorderLayout.CENTER);
		oCount.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 255));
		panel_11.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 51, 51), new Color(102, 0, 0)));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 0, 0));
		panel_12.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 51, 51), new Color(102, 0, 0)));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton btn7 = new JButton("");
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 80));
		btn7.setBackground(new Color(0, 0, 0));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				btn7.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn7.setForeground(Color.RED);
					bot7=1;
					i++;
				}
				else 
				{
					btn7.setForeground(Color.YELLOW);
					bot7=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_12.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(0, 0, 0));
		panel_13.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 51, 51), new Color(102, 0, 0)));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton btn8 = new JButton("");
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 80));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				btn8.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn8.setForeground(Color.RED);
					bot8=1;
					i++;
				}
				else 
				{
					btn8.setForeground(Color.YELLOW);
					bot8=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn8.setBackground(new Color(0, 0, 0));
		btn8.setForeground(new Color(0, 0, 0));
		panel_13.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(0, 0, 0));
		panel_14.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 51, 51), new Color(102, 0, 0)));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton btn9 = new JButton("");
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 80));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				btn9.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn9.setForeground(Color.RED);
					bot9=1;
					i++;
				}
				else 
				{
					btn9.setForeground(Color.YELLOW);
					bot9=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn9.setBackground(new Color(0, 0, 0));
		btn9.setForeground(new Color(0, 0, 0));
		panel_14.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(255, 255, 255));
		panel_20.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 51, 51), new Color(102, 0, 0)));
		panel.add(panel_20);
		panel_20.setLayout(new BorderLayout(0, 0));
		
		
		JButton btnReset = new JButton("RESET");
		btnReset.setForeground(new Color(0, 0, 51));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//In this part we required our program to reset all cabinet of buttons
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				// Reseting every wins
				bot1=10;
				bot2=10;
				bot3=10;
				bot4=10;
				bot5=10;
				bot6=10;
				bot7=10;
				bot8=10;
				bot9=10;
				i=0;
			}
		});
		btnReset.setBackground(new Color(255, 255, 255));
		panel_11.add(btnReset, BorderLayout.CENTER);
		
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agrs0) {
				frmTicTacToe = new JFrame("Exit");
				// Asking the Player to continue Exit 
				if(JOptionPane.showConfirmDialog(frmTicTacToe,"Confirm You Want to Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}			
			
			}
		});
		btnExit.setBackground(new Color(255, 255, 255));
		btnExit.setForeground(new Color(0, 0, 51));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 23));
		panel_20.add(btnExit, BorderLayout.CENTER);
	}

}

