

import java.awt.Button;
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


public class FinalM extends JFrame implements ActionListener {

	JFrame F;
	JButton l1,l2,l3,l4,l8;
	JLabel l5,l6,l7,l9;
	JButton B1,B2,w;
	
	private JLabel BgLabel;
	
	public FinalM() {
		setSize(450,470);
		setResizable(false);
		setLayout(null);
		BgLabel= createBackgroundLabel();
		setLocation(150, 150);
		setUndecorated(true);
		add(BgLabel);

		
		l5=new JLabel("Correct Word Is");
		l5.setBounds(70, 20, 250, 20);
		l5.setForeground(Color.MAGENTA);
		l5.setHorizontalAlignment(SwingConstants.CENTER);
		l5.setFont(new Font("Tahoma", Font.BOLD, 26));
		BgLabel.add(l5);
		
		l6=new JLabel("Youe Score Is");
		l6.setBounds(150, 190, 250, 20);
		l6.setForeground(Color.red);
		l6.setFont(new Font("Tahoma", Font.BOLD, 23));
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
		

	
		l7=new JLabel("");
		l7.setBounds(195, 210, 50, 50);
		l7.setForeground(Color.DARK_GRAY);
		l7.setHorizontalAlignment(SwingConstants.CENTER);
		l7.setFont(new Font("Tahoma", Font.BOLD, 25));
		BgLabel.add(l7);
		
		
		
	
		l1=new JButton("");
		l1.setBounds(20, 75, 50, 50);
		l1.setBorder(new LineBorder(Color.BLUE, 2, true));
		l1.setContentAreaFilled(false);
		l1.setForeground(Color.cyan);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Tahoma", Font.BOLD, 28));
		BgLabel.add(l1);

		l2=new JButton("");
		l2.setBounds(100, 75, 50, 50);
		l2.setBorder(new LineBorder(Color.blue, 2, true));
		l2.setContentAreaFilled(false);
		l2.setForeground(Color.cyan);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Tahoma", Font.BOLD, 28));
		BgLabel.add(l2);

	
		l3=new JButton("");
		l3.setBounds(200, 75, 50, 50);
		l3.setBorder(new LineBorder(Color.blue, 2, true));
		l3.setContentAreaFilled(false);
		l3.setForeground(Color.cyan);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Tahoma", Font.BOLD, 28));
		BgLabel.add(l3);

	
		l4=new JButton("");
		l4.setBounds(290, 75, 50, 50);
		l4.setBorder(new LineBorder(Color.blue, 2, true));
		l4.setContentAreaFilled(false);
		l4.setForeground(Color.cyan);
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setFont(new Font("Tahoma", Font.BOLD, 28));
		BgLabel.add(l4); 
		
		l8=new JButton("");
		l8.setBounds(370, 75, 50, 50);
		l8.setBorder(new LineBorder(Color.blue, 2, true));
		l8.setContentAreaFilled(false);
		l8.setForeground(Color.cyan);
		l8.setHorizontalAlignment(SwingConstants.CENTER);
		l8.setFont(new Font("Tahoma", Font.BOLD, 28));
		BgLabel.add(l8); 

		
		
		ImageIcon backgroundImages4 = new ImageIcon("again.png");
		B1=new JButton("");
		B1.setBounds(150, 330, 150, 50);
		Dimension sizel4=B1.getSize();
		B1.setIcon(new ImageIcon(backgroundImages4.getImage().getScaledInstance((int) sizel4.getWidth(), (int) sizel4.getHeight(), Image.SCALE_SMOOTH)));
		B1.setContentAreaFilled(false);
		B1.setBorderPainted(false);
		B1.setActionCommand("play again");
		B1.addActionListener(this);
		BgLabel.add(B1);
		
		//setVisible(true);

		// TODO Auto-generated constructor stub
	}
	
	private JLabel createBackgroundLabel() {
		Dimension size = getSize();
        ImageIcon backgroundImage = new ImageIcon("d.jpg");
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, (int) size.getWidth(), (int) size.getHeight());
        backgroundLabel.setIcon(new ImageIcon(backgroundImage.getImage().getScaledInstance((int) size.getWidth(), (int) size.getHeight(), Image.SCALE_SMOOTH)));
        return backgroundLabel;
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("play again"))
		{
			setVisible(false);
			Main.s.setVisible(true);
		}
		
		if(ae.getActionCommand().equals("cancel"))
		{
			dispose();
		}
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new FinalM();
		// TODO Auto-generated method stub

	}
	
	public void ShowWord() {
		// TODO Auto-generated method stub
		if(Main.fi.str1!=null)
		{
			l1.setText(" "+Main.fi.str1.charAt(0));
			l2.setText(" "+Main.fi.str1.charAt(1));
			l3.setText(" "+Main.fi.str1.charAt(2));
			l4.setText(" "+Main.fi.str1.charAt(3));
			l8.setText(" "+Main.fi.str1.charAt(4));
			l7.setText(""+Main.fi.COUNT);
			
		}
	}

}
