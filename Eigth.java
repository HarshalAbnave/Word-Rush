
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

public class Eigth extends JFrame implements ActionListener,Runnable {
		JFrame F;
		JLabel l1,l2,l3,l4,l5,l6,l7;
		JButton B1,B2,w;
		
		private JLabel BgLabel;
		
		
	public Eigth() {
		
		
		//F=new JFrame();
		setSize(450,470);
		setResizable(false);
		setLayout(null);
		BgLabel= createBackgroundLabel();
		setLocation(100, 100);
		setUndecorated(true);
		add(BgLabel);

		
		l5=new JLabel("Correct Word Is");
		l5.setBounds(70, 20, 250, 20);
		l5.setForeground(Color.MAGENTA);
		l5.setHorizontalAlignment(SwingConstants.CENTER);
		l5.setFont(new Font("Tahoma", Font.BOLD, 26));
		BgLabel.add(l5);
		
		l6=new JLabel("Youe Score Is");
		l6.setBounds(10, 160, 150, 20);
		l6.setForeground(Color.CYAN);
		l6.setHorizontalAlignment(SwingConstants.CENTER);
		l6.setFont(new Font("Tahoma", Font.BOLD, 18));
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
		

		//l7=new JLabel(""+First.fr.COUNT);
		l7=new JLabel();
		l7.setBounds(50, 200, 50, 50);
		l7.setForeground(Color.red);
		l7.setHorizontalAlignment(SwingConstants.CENTER);
		l7.setFont(new Font("Tahoma", Font.BOLD, 22));
		BgLabel.add(l7);
		
		
		
		//l1=new JLabel(" "+First.fr.str1.charAt(0));
		l1=new JLabel();
		l1.setBounds(20, 75, 30, 50);
		l1.setForeground(Color.MAGENTA);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(l1);

		//l2=new JLabel(" "+First.fr.str1.charAt(1));
		l2=new JLabel();
		l2.setBounds(80, 75, 30, 50);
		l2.setForeground(Color.magenta);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(l2);

		//l3=new JLabel(" "+First.fr.str1.charAt(2));
		l3=new JLabel();
		l3.setBounds(150, 75, 30, 50);
		l3.setForeground(Color.magenta);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(l3);

		//l4=new JLabel(" "+First.fr.str1.charAt(3));
		l4=new JLabel();
		l4.setBounds(210, 75, 30, 50);
		l4.setForeground(Color.magenta);
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(l4); 
		
		
		ImageIcon backgroundImages5 = new ImageIcon("again.png");
		B1=new JButton("");
		B1.setBounds(20, 250, 150, 50);
		Dimension sizel5=B1.getSize();
		B1.setIcon(new ImageIcon(backgroundImages5.getImage().getScaledInstance((int) sizel5.getWidth(), (int) sizel5.getHeight(), Image.SCALE_SMOOTH)));
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
        ImageIcon backgroundImage = new ImageIcon("boy.jpg");
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
		// TODO Auto-generated method stub
	
		if(ae.getActionCommand().equals("cancel"))
		{
			dispose();
		}
	}
	
	

	public static void main(String[] args) {
		
		new Eigth();
		// TODO Auto-generated method stub

	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		l1.setText(" "+Main.fr.str1.charAt(0));
		l2.setText(" "+Main.fr.str1.charAt(1));
		l3.setText(" "+Main.fr.str1.charAt(2));
		l4.setText(" "+Main.fr.str1.charAt(3));
		l7.setText(""+Main.fr.COUNT);
		
	}

}
