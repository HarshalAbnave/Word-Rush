

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

public class FinalH extends JFrame implements ActionListener {
	JFrame F;
	JButton l1,l2,l3,l4,l8,l9;
	JButton B1,B2,w;
	JLabel l5,l6,l7;
	
	private JLabel BgLabel;

	public FinalH() {
		// TODO Auto-generated constructor stub
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
		l6.setBounds(150, 190, 300, 20);
		l6.setForeground(Color.red);
	//	l6.setHorizontalAlignment(SwingConstants.CENTER);
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
		l7.setForeground(Color.darkGray);
		l7.setHorizontalAlignment(SwingConstants.CENTER);
		l7.setFont(new Font("Tahoma", Font.BOLD, 25));
		BgLabel.add(l7);
		
		
		
		
		l1=new JButton("");
		l1.setBounds(10, 75, 60, 50);
		l1.setForeground(Color.MAGENTA);
		l1.setBorder(new LineBorder(Color.red, 2, true));
		l1.setContentAreaFilled(false);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Tahoma", Font.BOLD, 24));
		BgLabel.add(l1);

		
		l2=new JButton("");
		l2.setBounds(90, 75, 60, 50);
		l2.setBorder(new LineBorder(Color.red, 2, true));
		l2.setContentAreaFilled(false);
		l2.setForeground(Color.magenta);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Tahoma", Font.BOLD, 24));
		BgLabel.add(l2);

		
		l3=new JButton("");
		l3.setBounds(170, 75, 60, 50);
		l3.setBorder(new LineBorder(Color.red, 2, true));
		l3.setContentAreaFilled(false);
		l3.setForeground(Color.magenta);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Tahoma", Font.BOLD, 24));
		BgLabel.add(l3);

		
		l4=new JButton("");
		l4.setBounds(240, 75, 60, 50);
		l4.setBorder(new LineBorder(Color.red, 2, true));
		l4.setContentAreaFilled(false);
		l4.setForeground(Color.magenta);
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setFont(new Font("Tahoma", Font.BOLD, 24));
		BgLabel.add(l4); 
		
		
		l8=new JButton("");
		l8.setBounds(320, 75, 60, 50);
		l8.setBorder(new LineBorder(Color.red, 2, true));
		l8.setContentAreaFilled(false);
		l8.setForeground(Color.MAGENTA);
		l8.setHorizontalAlignment(SwingConstants.CENTER);
		l8.setFont(new Font("Tahoma", Font.BOLD, 24));
		BgLabel.add(l8); 

		l9=new JButton("");
		l9.setBounds(390, 75, 60, 50);
		l9.setBorder(new LineBorder(Color.red, 2, true));
		l9.setContentAreaFilled(false);
		l9.setForeground(Color.magenta);
		l9.setHorizontalAlignment(SwingConstants.CENTER);
		l9.setFont(new Font("Tahoma", Font.BOLD, 24));
		BgLabel.add(l9); 

		
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
		
	//	setVisible(true);

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FinalH();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
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
	
	public void ShowWord() {
		// TODO Auto-generated method stub
		if(Main.sf.str1!=null)
		{
			l1.setText(" "+Main.sf.str1.charAt(0));
			l2.setText(" "+Main.sf.str1.charAt(1));
			l3.setText(" "+Main.sf.str1.charAt(2));
			l4.setText(" "+Main.sf.str1.charAt(3));
			l8.setText(" "+Main.sf.str1.charAt(4));
			l9.setText(" "+Main.sf.str1.charAt(5));
			l7.setText(""+Main.sf.COUNT);
			
		}

}
}
