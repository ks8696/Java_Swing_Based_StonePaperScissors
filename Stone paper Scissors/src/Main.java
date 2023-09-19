import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.Border;

public class Main implements ActionListener {
	JRadioButton stones;
	JRadioButton papers;
	JRadioButton scissors;
	ImageIcon stone;
	ImageIcon paper;
	ImageIcon scissor;
	ImageIcon k;
	ImageIcon p;
	ImageIcon l;
	ImageIcon s;
	JLabel label;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JButton button;
	int you=0,com=0,f;
	Main(){
	JFrame frame=new JFrame();
	
	label1=new JLabel();
	label1.setText("Choose your OPTION");
	//label1.setOpaque(true);
	label1.setFont(new Font("MV Boli",Font.BOLD,30));
	label1.setForeground(Color.white);
	label1.setBounds(60, 260, 400, 50);
	label1.setHorizontalAlignment(JLabel.CENTER);
	label1.setVerticalAlignment(JLabel.CENTER);
		
	Border border=BorderFactory.createLineBorder(Color.DARK_GRAY, 15);
	Border border1=BorderFactory.createTitledBorder(border,"YOU  ");
	Border border2=BorderFactory.createTitledBorder(border,"COMPUTER  ");
	k=new ImageIcon("C:\\Users\\Kunal Sharma\\Downloads\\Stone.jpeg");
	Image Icon1 = k.getImage().getScaledInstance(80,80, java.awt.Image.SCALE_SMOOTH);
	stone = new ImageIcon(Icon1);
	
	p=new ImageIcon("C:\\Users\\Kunal Sharma\\Downloads\\Paper.jpg");
	Image Icon2 = p.getImage().getScaledInstance(80,80, java.awt.Image.SCALE_SMOOTH);
	paper = new ImageIcon(Icon2);
	
	l=new ImageIcon("C:\\Users\\Kunal Sharma\\Downloads\\Scissors.jpeg");
	Image Icon3 = l.getImage().getScaledInstance(80,80, java.awt.Image.SCALE_SMOOTH);
	scissor = new ImageIcon(Icon3);
	
	s=new ImageIcon("C:\\Users\\Kunal Sharma\\Downloads\\QuestionMark.jpeg");
	Image Icon4 = s.getImage().getScaledInstance(85,85, java.awt.Image.SCALE_SMOOTH);
	ImageIcon mark = new ImageIcon(Icon4);
	
	label=new JLabel();
	label.setIcon(mark);
	
	ImageIcon Icon=new ImageIcon("C:\\Users\\Kunal Sharma\\Downloads\\Icon.jpeg");
	
	stones=new JRadioButton();
	stones.setIcon(stone);
	papers=new JRadioButton();
	papers.setIcon(paper);
	scissors=new JRadioButton();
	scissors.setIcon(scissor);
	ButtonGroup group=new ButtonGroup();
	
	group.add(stones);
	group.add(papers);
	group.add(scissors);
	
	stones.addActionListener(this);
	papers.addActionListener(this);
	scissors.addActionListener(this);
	
	
	JPanel panel=new JPanel();
	panel.setLayout(null);
	panel.setBackground(Color.gray);
	panel.setBorder(border1);
	panel.setLayout(new GridLayout(2,1,4,4));
	panel.add(stones);
	panel.add(papers);
	panel.add(scissors);
	panel.add(label);
	panel.setBounds(50, 50, 200, 200);
	
	Image icon4 = s.getImage().getScaledInstance(160,160, java.awt.Image.SCALE_SMOOTH);
	ImageIcon Mark = new ImageIcon(icon4);
	label2=new JLabel();
	label2.setIcon(Mark);
	
	JPanel panelblue=new JPanel();
//	panelblue.setBackground(Color.blue);
	panelblue.setLayout(new FlowLayout());
	panelblue.setBorder(border2);
	panelblue.add(label2);
	panelblue.setBounds(250, 50, 200, 200);
	
	button=new JButton("EXIT");
	button.setBounds(170, 320, 150, 40);
	button.setFocusable(false);
	button.setFont(new Font("MV Boli",Font.ITALIC,30));
	button.setForeground(Color.red);
	button.setBackground(new Color(0x123450));
	button.setBorder(BorderFactory.createLineBorder(Color.black,5,true));
	button.addActionListener(e->System.exit(0));
	
	label3=new JLabel("Your Score = 0");
	label3.setBounds(10, 320, 100, 40);
	label3.setForeground(new Color(0xc9f3f1));
	
	label4=new JLabel("Computer's Score = 0");
	label4.setBounds(350, 320, 150, 40);
	label4.setForeground(new Color(0xc9f3f1));
	
	label5=new JLabel("STONE | PAPER | SCISSORS ");
	label5.setFont(new Font("MV Boli",Font.BOLD,25));
	label5.setForeground(new Color(0x99999));
	label5.setBounds(55, 2, 390, 45);
	JScrollPane scroller = new JScrollPane (label5, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	
	String k=JOptionPane.showInputDialog("Enter the number of plays to decide the winning", 0);
	f=Integer.parseInt(k);
	if(f>0)
		frame.setVisible(true);	
	else
		System.exit(0);
	
	frame.setTitle("Letzz Play");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.getContentPane().setBackground(new Color(0x123456));
	frame.add(label3);
	frame.add(label4);
	frame.add(label5);
	frame.add(panel);
	frame.add(label1);
	frame.add(panelblue);
	frame.add(button);
	frame.setIconImage(Icon.getImage());
	frame.setBounds(400, 200,500,400);
	frame.setLayout(null);

	
}
	public static void main(String[] args) {
				
		Main m=new Main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random ran=new Random();
		int i=ran.nextInt(3);
		if(e.getSource()==stones) {
			label.setIcon(stone);
			
			if(i==0) {
				Image icon1 = k.getImage().getScaledInstance(160,160, java.awt.Image.SCALE_SMOOTH);
				ImageIcon stone= new ImageIcon(icon1);
				label2.setIcon(stone);
				label1.setText("It's a TIE");
				you++;
				com++;
			}
			else if(i==1) {
				Image icon2 = p.getImage().getScaledInstance(160,160, java.awt.Image.SCALE_SMOOTH);
				ImageIcon paper= new ImageIcon(icon2);
				label2.setIcon(paper);
				label1.setText("Computer WON");
				com++;
			}
			else if(i==2) {
				Image icon3 = l.getImage().getScaledInstance(160,160, java.awt.Image.SCALE_SMOOTH);
				ImageIcon scissor= new ImageIcon(icon3);
				label2.setIcon(scissor);
				label1.setText("You WON");
				you++;
				
			}
		}
		
		else if(e.getSource()==papers) {
			label.setIcon(paper);
			
			if(i==0) {
				Image icon1 = k.getImage().getScaledInstance(160,160, java.awt.Image.SCALE_SMOOTH);
				ImageIcon stone= new ImageIcon(icon1);
				label2.setIcon(stone);
				label1.setText("You WON");
				you++;
			}
			else if(i==1) {
				Image icon2 = p.getImage().getScaledInstance(160,160, java.awt.Image.SCALE_SMOOTH);
				ImageIcon paper= new ImageIcon(icon2);
				label2.setIcon(paper);
				label1.setText("It's a TIE");
				you++;
				com++;
			}
			else if(i==2) {
				Image icon3 = l.getImage().getScaledInstance(160,160, java.awt.Image.SCALE_SMOOTH);
				ImageIcon scissor= new ImageIcon(icon3);
				label2.setIcon(scissor);
				label1.setText("Computer WON");
				com++;
				
			}
		}
		
		
		else if(e.getSource()==scissors) {
			label.setIcon(scissor);
			
			if(i==0) {
				Image icon1 = k.getImage().getScaledInstance(160,160, java.awt.Image.SCALE_SMOOTH);
				ImageIcon stone= new ImageIcon(icon1);
				label2.setIcon(stone);
				label1.setText("Computer WON");
				com++;
			}
			else if(i==1) {
				Image icon2 = p.getImage().getScaledInstance(160,160, java.awt.Image.SCALE_SMOOTH);
				ImageIcon paper= new ImageIcon(icon2);
				label2.setIcon(paper);
				label1.setText("You WON");
				you++;
			}
			else if(i==2) {
				Image icon3 = l.getImage().getScaledInstance(160,160, java.awt.Image.SCALE_SMOOTH);
				ImageIcon scissor= new ImageIcon(icon3);
				label2.setIcon(scissor);
				label1.setText("It's a TIE");
				you++;
				com++;
				
			}
		}
		
		label3.setText("Your score = "+you);	
		label4.setText("Computer's score = "+com);
		if(you==f || com==f) {
			if(you>com) {
			JOptionPane.showMessageDialog(null, "Player is WINNER", "Result", 0);
			System.exit(0);}
			else if(com>you) {
				JOptionPane.showMessageDialog(null, "Computer is WINNER", "Result", 0);
			System.exit(0);
			}
				else {
				JOptionPane.showMessageDialog(null, "Match TIED", "Result", 0);
		System.exit(0);
		}
		}
		
		}
	}