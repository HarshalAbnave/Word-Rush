
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.LineBorder;


public class Setting extends JFrame implements ActionListener {
	JFrame f;
 	JTextField word,meaning,dir;
 	JButton B;
 	JLabel l;
 	JLabel wo,me,di;

 	Connection c;
	Statement s;
	ResultSet rs;
	PreparedStatement ps1,ps2,ps3,ps4;

 	private JLabel BgLabel;
	 JButton back;
	private JButton w;


	public Setting() {
		//f=new JFrame("Thrid");
		setSize(450,470);
		setResizable(false);
		setLayout(null);
		setUndecorated(true);
		setLocation(150, 150);
		BgLabel= createBackgroundLabel();
		add(BgLabel);

		l=new JLabel("ENTER WORD TO ADD IN DATABASE");
		l.setForeground(Color.red);
		l.setFont(new Font("Tahoma", Font.BOLD, 14));
		l.setBounds(85,20,280,60);
		BgLabel.add(l);

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



		wo=new JLabel("WORD");
		wo.setBounds(50, 170, 90, 50);
		wo.setForeground(Color.GREEN);
		wo.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(wo);

		word=new JTextField(10);
		word.setBounds(168, 180, 220, 30);
		word.setBackground(Color.pink);
		word.setFont(new Font("Tohoma",Font.BOLD,18));
		word.setForeground(Color.BLUE);
		BgLabel.add(word);

		me=new JLabel("MEANING");
		me.setBounds(50, 210, 100, 50);
		me.setForeground(Color.MAGENTA);
		me.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(me);


		meaning=new JTextField();
		meaning.setBounds(168, 220, 220, 30);
		meaning.setBackground(Color.lightGray);
		meaning.setFont(new Font("Tohoma",Font.BOLD,18));
		meaning.setForeground(Color.BLUE);
		BgLabel.add(meaning);


		di=new JLabel("DirName");
		di.setBounds(50, 260, 100, 50);
		di.setForeground(Color.DARK_GRAY);
		di.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(di);

		dir=new JTextField(10);
		dir.setBounds(168, 270, 220, 30);
		dir.setBackground(Color.CYAN);
		dir.setFont(new Font("Tahoma", Font.BOLD, 18));
		dir.setForeground(Color.black);
		BgLabel.add(dir);

		B=new JButton("ADD");
		B.setBounds(86,320,160,30);
		B.addActionListener(this);
		B.setActionCommand("B");
		B.setBorder(new LineBorder(Color.MAGENTA, 2, true));
		//B.setContentAreaFilled(false);
		B.setForeground(Color.MAGENTA);
		BgLabel.add(B);


		ImageIcon backgroundImages5= new ImageIcon("back-button-hi.png");
		back=new JButton("Home");
		back.setBounds(2,380, 120, 40);
		Dimension size4=back.getSize();
		back.addActionListener( this);
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
        ImageIcon backgroundImage = new ImageIcon("Dictionary.gif");
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, (int) size.getWidth(), (int) size.getHeight());
        backgroundLabel.setIcon(new ImageIcon(backgroundImage.getImage().getScaledInstance((int) size.getWidth(), (int) size.getHeight(), Image.SCALE_SMOOTH)));
        return backgroundLabel;
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		new Setting();
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		


		if(ae.getActionCommand().equals("cancel"))
		{
			dispose();
		}

		if(ae.getActionCommand().equals("Home"))
		{
			new Main();
			setVisible(false);
		}

		if(ae.getActionCommand().equals("B"))
		{
			String Dirname = null,Word=null,mean=null;
			Dirname=dir.getText();
			Word=word.getText();
			mean=meaning.getText();
			try
			{
				Class.forName("org.postgresql.Driver");
				c=DriverManager.getConnection("jdbc:postgresql://192.168.0.2:5432/ty025","ty025","");
				s=c.createStatement();
				if(c!=null)
				{
					System.out.println("Connection Successfull");
				}
		
				if(Dirname.equals("fourworddb"))
				{
				ps1 = c.prepareStatement("Insert into dir values(?,?)");
				ps1.setString(1,Word);
				ps1.setString(2,mean);
				ps1.executeUpdate();
				}

				else if(Dirname.equals("fiveworddb"))
				{
				ps2 = c.prepareStatement("Insert into dir1 values(?,?)");
				ps2.setString(1,Word);
				ps2.setString(2,mean);
				ps2.executeUpdate();
				}

				else if (Dirname.equals("sixworddb"))
				{
				ps3 = c.prepareStatement("Insert into dir2 values(?,?)");
				ps3.setString(1,Word);
				ps3.setString(2,mean);
				ps3.executeUpdate();
				}

				else if (Dirname.equals("sevenworddb"))
				{
				ps4 = c.prepareStatement("Insert into dir values(?,?)");
				ps4.setString(1,Word);
				ps4.setString(2,mean);
				ps4.executeUpdate();
				}

			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}


	}

}
