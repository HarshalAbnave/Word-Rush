
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Level extends JFrame implements ActionListener {
	JFrame f;
	JButton B1,B2,B3,B4,back,w;
	JLabel l;

	private JLabel BgLabel;

	public Level() {
		new JFrame("Second Frame");
		setSize(470,450);
		setResizable(false);
		setLayout(null);
		setUndecorated(true);
		setLocation(150, 150);
		BgLabel= createBackgroundLabel();
		add(BgLabel);

		l=new JLabel("SELECT LEVEL");
		l.setForeground(Color.GREEN);
		l.setHorizontalAlignment(SwingConstants.CENTER);
		l.setFont(new Font("Engravers MT", Font.BOLD, 25));
		l.setBounds(98,10,280,80);
		BgLabel.add(l);



		ImageIcon backgroundImages6 = new ImageIcon("close.png");
		w=new JButton();
		w.setBounds(420, 0, 50, 20);
		w.addActionListener(this);
		w.setActionCommand("cancel");
		Dimension sizel6=w.getSize();
		w.setIcon(new ImageIcon(backgroundImages6.getImage().getScaledInstance((int) sizel6.getWidth(), (int) sizel6.getHeight(), Image.SCALE_SMOOTH)));
		w.setContentAreaFilled(false);
		w.setBorderPainted(false);
		w.setActionCommand("cancel");
		BgLabel.add(w);

		ImageIcon backgroundImages1= new ImageIcon("A.png");
		B1=new JButton("EASY");
		B1.setBounds(138,100,185,50);
		Dimension sizel=B1.getSize();
		B1.setIcon(new ImageIcon(backgroundImages1.getImage().getScaledInstance((int) sizel.getWidth(), (int) sizel.getHeight(), Image.SCALE_SMOOTH)));
		B1.addActionListener(this);
		B1.setContentAreaFilled(false);
		B1.setBorderPainted(false);
		B1.setActionCommand("EASY");
		BgLabel.add(B1);

		ImageIcon backgroundImages2= new ImageIcon("B.png");
		B2=new JButton("MEDIUM");
		B2.setBounds(138,170,185,50);
		Dimension sizel1=B2.getSize();
		B2.setIcon(new ImageIcon(backgroundImages2.getImage().getScaledInstance((int) sizel.getWidth(), (int) sizel.getHeight(), Image.SCALE_SMOOTH)));
		B2.addActionListener(this);
		B2.setContentAreaFilled(false);
		B2.setBorderPainted(false);
		B2.setActionCommand("MEDIUM");
		BgLabel.add(B2);

		ImageIcon backgroundImages3= new ImageIcon("H.png");
		B3=new JButton("HARD");
		B3.setBounds(138,240,185,50);
		Dimension sizel2=B2.getSize();
		B3.setIcon(new ImageIcon(backgroundImages3.getImage().getScaledInstance((int) sizel.getWidth(), (int) sizel.getHeight(), Image.SCALE_SMOOTH)));
		B3.addActionListener(this);
		B3.setContentAreaFilled(false);
		B3.setBorderPainted(false);
		B3.setActionCommand("HARD");
		BgLabel.add(B3);

		ImageIcon backgroundImages4= new ImageIcon("E.png");
		B4=new JButton("EXPERT");
		B4.setBounds(130,310,220,50);
		Dimension sizel3=B2.getSize();
		B4.setIcon(new ImageIcon(backgroundImages4.getImage().getScaledInstance((int) sizel.getWidth(), (int) sizel.getHeight(), Image.SCALE_SMOOTH)));
		B4.addActionListener(this);
		B4.setContentAreaFilled(false);
		B4.setBorderPainted(false);
		B4.setActionCommand("EXPERT");
		BgLabel.add(B4);



		ImageIcon backgroundImages5= new ImageIcon("back-button-hi.png");
		back=new JButton("Home");
		back.setBounds(2,380, 120, 40);
		Dimension size4=back.getSize();
		back.addActionListener(this);
		back.setIcon(new ImageIcon(backgroundImages5.getImage().getScaledInstance((int) size4.getWidth(), (int) size4.getHeight(), Image.SCALE_SMOOTH)));
		back.setContentAreaFilled(false);
		back.setBorderPainted(false);
		back.setActionCommand("Home");
		BgLabel.add(back);


		//setVisible(true);
		// TODO Auto-generated constructor stub
	}

	private JLabel createBackgroundLabel() {
		Dimension size = getSize();
        ImageIcon backgroundImage = new ImageIcon("level.jpg");
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, (int) size.getWidth(), (int) size.getHeight());
        backgroundLabel.setIcon(new ImageIcon(backgroundImage.getImage().getScaledInstance((int) size.getWidth(), (int) size.getHeight(), Image.SCALE_SMOOTH)));
        return backgroundLabel;
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		new Level();
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("EASY"))
		{
			Main.fr.setVisible(true);
			Main.j.getdata();
			Main.fr.clear();
			Main.fr.setTimer();
			Main.fr.l1.setText("00");
			new Thread(Main.fr).start();

			setVisible(false);
		}

		if(ae.getActionCommand().equals("MEDIUM"))
		{
			Main.fi.setVisible(true);
			Main.j.getdata1();
			Main.fi.clear();
			Main.fi.setTimer();
			Main.fi.l1.setText("00");
			new Thread(Main.fi).start();
			setVisible(false);
		}

		if(ae.getActionCommand().equals("HARD"))
		{
			Main.sf.setVisible(true);
			Main.j.getdata2();
			Main.sf.clear();
			Main.sf.setTimer();
			Main.sf.l1.setText("00");
			new Thread(Main.sf).start();
			setVisible(false);
		}

		if(ae.getActionCommand().equals("EXPERT"))
		{
			Main.Sv.setVisible(true);
			Main.j.getdata3();
			Main.Sv.clear();
			Main.Sv.setTimer();
			Main.Sv.l1.setText("00");
			new Thread(Main.Sv).start();
			setVisible(false);
		}

		if(ae.getActionCommand().equals("Home"))
		{
			new Main();
			setVisible(false);

		}

		if(ae.getActionCommand().equals("cancel"))
		{
			dispose();
		}

		// TODO Auto-generated method stub

	}

}
