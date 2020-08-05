
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Main extends JFrame implements ActionListener,Runnable {
	JFrame f;
	JButton B1,B2,B3,cancel;
	JLabel l1,l2,q;
	static Level s;
	static Easy fr;
	static Setting t;
	static Hard sf;
	static Expert Sv;
	static Medium fi;
	static Final ei;
	static JDBC j;
	static FinalE e;
	static FinalH h;
	static FinalM m;
	private JLabel BgLabel;
	
static int score=24;
	static int max;

	public Main() {
		

		max=score;
		setSize(450,400);
		setResizable(false);
		setLayout(null);
		BgLabel= createBackgroundLabel();
		setLocation(150, 150);
		setUndecorated(true);
		add(BgLabel);

		l1=new JLabel("     ");
		l1.setBounds(110,10,300,80);
		l1.setFont(new Font("Papyrus",Font.BOLD,35));
		l1.setForeground(Color.BLACK);
		BgLabel.add(l1);

		ImageIcon backgroundImages3 = new ImageIcon("close.png");
		cancel=new JButton();
		cancel.setBounds(420, 0, 27, 30);
		Dimension sizel3=cancel.getSize();
		cancel.addActionListener(this);
		cancel.setIcon(new ImageIcon(backgroundImages3.getImage().getScaledInstance((int) sizel3.getWidth(), (int) sizel3.getHeight(), Image.SCALE_SMOOTH)));
		cancel.setContentAreaFilled(false);
		cancel.setBorderPainted(false);
		cancel.setActionCommand("Cancel");
		BgLabel.add(cancel);

		l2=new JLabel("   ");
		l2.setBounds(120,100,200,50);
		l2.setFont(new Font("Elephant",Font.PLAIN,28));
		l2.setForeground(Color.BLUE);
		BgLabel.add(l2);
		
		q=new JLabel("");
		q.setBounds(320, 100, 50, 50);
		q.setFont(new Font("Elephant",Font.BOLD,35));
		q.setForeground(Color.RED);
		BgLabel.add(q);

		ImageIcon backgroundImages = new ImageIcon("play.png");
		B1=new JButton("");
		B1.setBounds(175,350,85,50);
		Dimension size1=B1.getSize();
		B1.setIcon(new ImageIcon(backgroundImages.getImage().getScaledInstance((int) size1.getWidth(), (int) size1.getHeight(), Image.SCALE_SMOOTH)));
		B1.addActionListener(this);
		B1.setContentAreaFilled(false);
		B1.setBorderPainted(false);
		B1.setActionCommand("START");
		BgLabel.add(B1);

		ImageIcon backgroundImages1 = new ImageIcon("quit.png");
		B2=new JButton("");
		B2.setBounds(10,350,85,50);
		Dimension sizel1=B2.getSize();
		B2.setIcon(new ImageIcon(backgroundImages1.getImage().getScaledInstance((int) size1.getWidth(), (int) size1.getHeight(), Image.SCALE_SMOOTH)));
		B2.addActionListener(this);
		B2.setContentAreaFilled(false);
		B2.setBorderPainted(false);
		B2.setActionCommand("Quit");
		BgLabel.add(B2);

		ImageIcon backgroundImages2= new ImageIcon("button_setting.png");
		B3=new JButton("");
		//B3.setFont(new Font("Arial", Font.BOLD, 12));
		B3.setBounds(355,350,85,50);
		Dimension sizel2=B3.getSize();
		B3.setIcon(new ImageIcon(backgroundImages2.getImage().getScaledInstance((int) size1.getWidth(), (int) size1.getHeight(), Image.SCALE_SMOOTH)));
		B3.addActionListener(this);
		B3.setContentAreaFilled(false);
		B3.setBorderPainted(false);
		B3.setActionCommand("Setting");
		BgLabel.add(B3);





		
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	private JLabel createBackgroundLabel() {
		Dimension size = getSize();
        ImageIcon backgroundImage = new ImageIcon("WR.jpg");
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, (int) size.getWidth(), (int) size.getHeight());
        backgroundLabel.setIcon(new ImageIcon(backgroundImage.getImage().getScaledInstance((int) size.getWidth(), (int) size.getHeight(), Image.SCALE_SMOOTH)));
        return backgroundLabel;
		// TODO Auto-generated method stub

	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("START"))
		{
				setVisible(false);
				s.setVisible(true);
		}
		if(ae.getActionCommand().equals("Setting"))
		{
			setVisible(false);
			t.setVisible(true);
		}
		if(ae.getActionCommand().equals("Cancel"))
		{
			new FileWrite(max);
			System.exit(0);

		}
		if(ae.getActionCommand().equals("Quit"))
		{
			
			new FileWrite(max);
			System.exit(0);
		}

	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(new Main());
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		j=new JDBC();
		s=new Level();
		fr=new Easy();
		t=new Setting();
		sf=new Hard();
		Sv=new Expert();
		fi=new Medium();
		ei=new Final();
		e=new FinalE();
		m=new FinalM();
		h=new FinalH();

	}

}
