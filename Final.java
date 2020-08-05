

import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Final extends JFrame implements ActionListener {
		JFrame F;
		JButton l1,l2,l3,l4;
		JLabel l7,l5,l6;
		JButton B1,B2,w;
		
		private JLabel BgLabel;
		
		
	public Final() {
		
		
		setSize(450,470);
		setResizable(false);
		setLayout(null);
		BgLabel= createBackgroundLabel();
		setLocation(150, 150);
		setUndecorated(true);
		add(BgLabel);

		
		l5=new JLabel("CORRECT WORD IS");
		l5.setBounds(70, 20, 300, 20);
		l5.setForeground(Color.MAGENTA);
		l5.setHorizontalAlignment(SwingConstants.CENTER);
		l5.setFont(new Font("Tahoma", Font.BOLD, 26));
		BgLabel.add(l5);
		
		l6=new JLabel("\n Your Score Is");
		l6.setBounds(130, 200, 150, 20);
		l6.setForeground(Color.BLACK);
		l6.setHorizontalAlignment(SwingConstants.CENTER);
		l6.setFont(new Font("Tahoma", Font.BOLD, 20));
		BgLabel.add(l6);
		
		
		ImageIcon backgroundImages3 = new ImageIcon("close.png");
		w=new JButton();
		w.setBounds(400, 0, 50, 20);
		w.addActionListener(this);
		w.setActionCommand("cancel");
		Dimension sizel3=w.getSize();
		w.setIcon(new ImageIcon(backgroundImages3.getImage().getScaledInstance((int) sizel3.getWidth(), (int) sizel3.getHeight(), Image.SCALE_SMOOTH)));
		w.setContentAreaFilled(false);
		w.setBorderPainted(false);
		w.setActionCommand("cancel");
		BgLabel.add(w);
		

	
		l7=new JLabel();
		l7.setBounds(285, 200, 50, 20);
		l7.setForeground(Color.red);
		l7.setHorizontalAlignment(SwingConstants.CENTER);
		l7.setFont(new Font("Tahoma", Font.BOLD, 22));
		BgLabel.add(l7);
		
		
		
	
		l1=new JButton("");
		l1.setBounds(20, 75, 50, 50);
		l1.setForeground(Color.BLACK);
		l1.setBorder(new LineBorder(Color.blue, 2, true));
		l1.setContentAreaFilled(false);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Tahoma", Font.BOLD, 28));
		BgLabel.add(l1);

		
		l2=new JButton("");
		l2.setBounds(140, 75, 50, 50);
		l2.setBorder(new LineBorder(Color.blue, 2, true));
		l2.setContentAreaFilled(false);
		l2.setForeground(Color.black);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Tahoma", Font.BOLD, 28));
		BgLabel.add(l2);

		
		l3=new JButton("");
		l3.setBounds(270, 75, 50, 50);
		l3.setBorder(new LineBorder(Color.blue, 2, true));
		l3.setContentAreaFilled(false);
		l3.setForeground(Color.black);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Tahoma", Font.BOLD, 28));
		BgLabel.add(l3);

		l4=new JButton("f");
		l4.setBounds(380, 75, 50, 50);
		l4.setBorder(new LineBorder(Color.blue, 2, true));
		l4.setContentAreaFilled(false);
		l4.setForeground(Color.BLACK);
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setFont(new Font("Tahoma", Font.BOLD, 28));
		BgLabel.add(l4); 
		
		
		ImageIcon backgroundImages5 = new ImageIcon("again.png");
		B1=new JButton("");
		B1.setBounds(140, 300, 150, 50);
		Dimension sizel5=B1.getSize();
		B1.setIcon(new ImageIcon(backgroundImages5.getImage().getScaledInstance((int) sizel5.getWidth(), (int) sizel5.getHeight(), Image.SCALE_SMOOTH)));
		B1.setContentAreaFilled(false);
		B1.setBorderPainted(false);
		B1.setActionCommand("play again");
		B1.addActionListener(this);
		BgLabel.add(B1);
		
	//	setVisible(true);


		// TODO Auto-generated constructor stub
	}


	private JLabel createBackgroundLabel() {
		Dimension size = getSize();
		if(Main.fr.COUNT==0)
		{
        Icon backgroundImage = new ImageIcon("time.gif");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, (int) size.getWidth(), (int) size.getHeight());
       // backgroundLabel.setIcon(new ImageIcon(backgroundImage.getImage().getScaledInstance((int) size.getWidth(), (int) size.getHeight(), Image.SCALE_SMOOTH)));
        return backgroundLabel;
		}
		else  //if(Main.fr.COUNT<=24)
		{
        Icon backgroundImage = new ImageIcon("sad.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, (int) size.getWidth(), (int) size.getHeight());
       // backgroundLabel.setIcon(new ImageIcon(backgroundImage.getImage().getScaledInstance((int) size.getWidth(), (int) size.getHeight(), Image.SCALE_SMOOTH)));
        return backgroundLabel;
		}
		/*else
		{
        Icon backgroundImage = new ImageIcon("cong.gif");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, (int) size.getWidth(), (int) size.getHeight());
       // backgroundLabel.setIcon(new ImageIcon(backgroundImage.getImage().getScaledInstance((int) size.getWidth(), (int) size.getHeight(), Image.SCALE_SMOOTH)));
        return backgroundLabel;
		}*/
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("play again"))
		{
			setVisible(false);
			Main.s.setVisible(true);
		}
		// TODO Auto-generated method stub
	
		if(ae.getActionCommand().equals("cancel"))
		{
			dispose();
		}
	}
	
	

	public static void main(String[] args) {
		
		new Final();
		// TODO Auto-generated method stub

	}



	public void ShowWord() {
		// TODO Auto-generated method stub
		if(Main.fr.str1!=null)
		{
			l1.setText(" "+Main.fr.str1.charAt(0));
			l2.setText(" "+Main.fr.str1.charAt(1));
			l3.setText(" "+Main.fr.str1.charAt(2));
			l4.setText(" "+Main.fr.str1.charAt(3));
			l7.setText(""+Main.fr.COUNT);
			
		}
		
		
	}

}
