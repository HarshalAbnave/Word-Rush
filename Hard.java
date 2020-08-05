
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
import javax.swing.Timer;
import javax.swing.border.LineBorder;

import java.util.*;

public class Hard extends JFrame implements ActionListener,Runnable{
	JFrame f;
	JLabel l1,l2,l3,l4,label,cor,hint;
	JButton HomeButton,l15,l26,l37,l48,l59,l60,w;
	JButton B[];

	private JLabel BgLabel;
	private TreeMap hm;
	private MyListener listener;

	LinkedList l,h;
	Random r;
	static int COUNT=0;
	String str1=null,str2=null;
	 Timer timer;

	public Hard() {
		hm=new TreeMap();
		hm.put("l15", "-1");
		hm.put("l26","-1");
		hm.put("l37", "-1");
		hm.put("l48", "-1");
		hm.put("l59", "-1");
		hm.put("l60","-1");

		l=new LinkedList();
		h=new LinkedList();


		//new JFrame("Fithh");
		setSize(470,450);
		setResizable(false);
		setLayout(null);
		setUndecorated(true);
		setLocation(150, 150);
		BgLabel= createBackgroundLabel();
		add(BgLabel);

		
		cor=new JLabel("Correct");
		cor.setBounds(200, 270, 150, 50);
		cor.setFont(new Font("Tahoma", Font.BOLD, 16));
		cor.setForeground(Color.blue);
		cor.setVisible(false);
		BgLabel.add(cor);
		
		l1=new JLabel("00");
		l1.setBounds(15,8,50,50);
		l1.setForeground(Color.DARK_GRAY);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Tahoma", Font.BOLD, 20));
		BgLabel.add(l1);

		l3=new JLabel("Score");
		l3.setBounds(3, 26, 70, 50);
		l3.setForeground(Color.DARK_GRAY);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Tahoma", Font.BOLD, 20));
		BgLabel.add(l3);

		l2=new JLabel(Main.score+"");
		l2.setBounds(400,8, 50, 50);
		l2.setForeground(Color.DARK_GRAY);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Tahoma", Font.BOLD, 20));
		//l2.setForeground(Color.red);
		BgLabel.add(l2);

		l4=new JLabel("Best");
		l4.setBounds(390, 26, 50, 50);
		l4.setForeground(Color.DARK_GRAY);
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setFont(new Font("Tahoma", Font.BOLD, 20));
		BgLabel.add(l4);

		ImageIcon backgroundImages3 = new ImageIcon("close.png");
		w=new JButton();
		w.setBounds(420, 0, 50, 20);
		w.addActionListener(this);
		w.setActionCommand("cancel");
		Dimension sizel3=w.getSize();
		w.setIcon(new ImageIcon(backgroundImages3.getImage().getScaledInstance((int) sizel3.getWidth(), (int) sizel3.getHeight(), Image.SCALE_SMOOTH)));
		w.setContentAreaFilled(false);
		w.setBorderPainted(false);
		w.setActionCommand("cancel");
		BgLabel.add(w);

		Font f=new Font("Tahoma", Font.BOLD, 20);
		l15=new JButton("");
		l15.setBounds(10, 88, 50, 50);
		l15.setFont(f);
		l15.setForeground(Color.red);
		l15.setBorder(new LineBorder(Color.red, 2, true));
		l15.setContentAreaFilled(false);
		l15.addActionListener(this);
		l15.setActionCommand("l15");
		BgLabel.add(l15);

		l26=new JButton("");
		l26.setBounds(80, 88, 50, 50);
		l26.setFont(f);
		l26.setForeground(Color.red);
		l26.setBorder(new LineBorder(Color.red, 2, true));
		l26.setContentAreaFilled(false);
		l26.addActionListener(this);
		l26.setActionCommand("l26");
		BgLabel.add(l26);

		l37=new JButton("");
		l37.setBounds(160, 88, 50, 50);
		l37.setFont(f);
		l37.setForeground(Color.red);
		l37.setBorder(new LineBorder(Color.red, 2, true));
		l37.setContentAreaFilled(false);
		l37.addActionListener(this);
		l37.setActionCommand("l37");
		BgLabel.add(l37);

		l48=new JButton("");
		l48.setBounds(240, 88, 50, 50);
		l48.setFont(f);
		l48.setForeground(Color.red);
		l48.setBorder(new LineBorder(Color.red, 2, true));
		l48.setContentAreaFilled(false);
		l48.addActionListener(this);
		l48.setActionCommand("l48");
		BgLabel.add(l48);

		l59=new JButton("");
		l59.setBounds(320, 88, 50, 50);
		l59.setFont(f);
		l59.setForeground(Color.red);
		l59.setBorder(new LineBorder(Color.red, 2, true));
		l59.setContentAreaFilled(false);
		l59.addActionListener(this);
		l59.setActionCommand("l59");
		BgLabel.add(l59);

		l60=new JButton("");
		l60.setBounds(390, 88, 50, 50);
		l60.setFont(f);
		l60.setForeground(Color.red);
		l60.setBorder(new LineBorder(Color.red, 2, true));
		l60.setContentAreaFilled(false);
		l60.addActionListener(this);
		l60.setActionCommand("l60");
		BgLabel.add(l60);




		B=new JButton[6];
		B[0]=new JButton("a");
		B[0].setBounds(45, 150, 50, 50);
		B[0].setFont(f);
		B[0].setForeground(Color.DARK_GRAY);
		B[0].setBorder(new LineBorder(Color.ORANGE, 2, true));
		B[0].setContentAreaFilled(false);
		B[0].addActionListener(this);
		B[0].setActionCommand("B1");
		BgLabel.add(B[0]);

		B[1]=new JButton("b");
		B[1].setBounds(340, 150, 50, 50);
		B[1].setFont(f);
		B[1].setForeground(Color.DARK_GRAY);
		B[1].setBorder(new LineBorder(Color.ORANGE, 2, true));
		B[1].setContentAreaFilled(false);
		B[1].addActionListener(this);
		B[1].setActionCommand("B2");
		BgLabel.add(B[1]);

		B[2]=new JButton("c");
		B[2].setBounds(45, 270, 50, 50);
		B[2].setFont(f);
		B[2].setForeground(Color.DARK_GRAY);
		B[2].setBorder(new LineBorder(Color.ORANGE, 2, true));
		B[2].setContentAreaFilled(false);
		B[2].addActionListener(this);
		B[2].setActionCommand("B3");
		BgLabel.add(B[2]);

		B[3]=new JButton("d");
		B[3].setBounds(340, 270, 60, 50);
		B[3].setFont(f);
		B[3].setForeground(Color.DARK_GRAY);
		B[3].setBorder(new LineBorder(Color.ORANGE, 2, true));
		B[3].setContentAreaFilled(false);
		B[3].addActionListener(this);
		B[3].setActionCommand("B4");
		BgLabel.add(B[3]);

		B[4]=new JButton("e");
		B[4].setBounds(130, 210, 60, 50);
		B[4].setFont(f);
		B[4].setForeground(Color.DARK_GRAY);
		B[4].setBorder(new LineBorder(Color.ORANGE, 2, true));
		B[4].setContentAreaFilled(false);
		B[4].addActionListener(this);
		B[4].setActionCommand("B5");
		BgLabel.add(B[4]);

		B[5]=new JButton("f");
		B[5].setBounds(245, 210, 60, 50);
		B[5].setFont(f);
		B[5].setForeground(Color.DARK_GRAY);
		B[5].setBorder(new LineBorder(Color.ORANGE, 2, true));
		B[5].setContentAreaFilled(false);
		B[5].addActionListener(this);
		B[5].setActionCommand("B6");
		BgLabel.add(B[5]);

		hint=new JLabel("HINT:");
		hint.setBounds(30, 320, 380, 50);
		hint.setForeground(Color.MAGENTA);
		hint.setFont(new Font("Tahoma", Font.BOLD, 18));
		BgLabel.add(hint);
		
		ImageIcon backgroundImages1= new ImageIcon("bb.png");
		HomeButton=new JButton("Home");
		HomeButton.setBounds(2,380, 97, 35);
		Dimension sizel=HomeButton.getSize();
		HomeButton.addActionListener(this);
		HomeButton.setIcon(new ImageIcon(backgroundImages1.getImage().getScaledInstance((int) sizel.getWidth(), (int) sizel.getHeight(), Image.SCALE_SMOOTH)));
		HomeButton.setContentAreaFilled(false);
		HomeButton.setBorderPainted(false);
		HomeButton.setActionCommand("Home");
		BgLabel.add(HomeButton);




		//timer.setBounds(260, 350, 70, 20);
		label=new JLabel("count:0");
		BgLabel.add(label);
		label.setBounds(350,370,120,50);
		label.setForeground(Color.BLUE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));




		//setVisible(true);
		// TODO Auto-generated constructor stub
	}

	private JLabel createBackgroundLabel() {
		Dimension size = getSize();
        ImageIcon backgroundImage = new ImageIcon("st.jpg");
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, (int) size.getWidth(), (int) size.getHeight());
        backgroundLabel.setIcon(new ImageIcon(backgroundImage.getImage().getScaledInstance((int) size.getWidth(), (int) size.getHeight(), Image.SCALE_SMOOTH)));
        return backgroundLabel;
		// TODO Auto-generated method stub

	}

	void setTimer()
	{
		listener =new MyListener(label);


		  timer = new Timer(1000,listener);
		 timer.start();
	}
	
	public void clear()
	 {
		 for (int i = 0; i < B.length; i++) {
				B[i].setEnabled(true);
			}
		 l15.setText("");
		 l26.setText("");
		 l37.setText("");
		 l48.setText("");
		 l59.setText("");
		 l60.setText("");
		// timer.stop();
		 label.setText("count:0");
		 COUNT=0;
		 l2.setText(""+Main.max);
	 }

	public static void main(String[] args) {
		new Hard();
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		if(ae.getActionCommand().equals("B1"))
		{
			String object=null;
			Set s=hm.keySet();
			Iterator i=s.iterator();
			while (i.hasNext()) {
				object = (String) i.next();
				if(hm.get(object).equals("-1")){
					hm.put(object, "B1");
					break;
				}
			}
			System.out.println(object);
			if(l15.getActionCommand().equals(object)){

				l15.setText(B[0].getText());
				l15.setBorder(new LineBorder(Color.PINK, 2, true));
				B[0].setBorder(new LineBorder(Color.green, 2, true));
				B[0].setEnabled(false);
				//System.out.println(l5.getText());
			}
			else if(l26.getActionCommand().equals(object)){

				l26.setText(B[0].getText());
				l26.setBorder(new LineBorder(Color.PINK, 2, true));
				B[0].setBorder(new LineBorder(Color.green, 2, true));
				B[0].setEnabled(false);
			}

			else if(l37.getActionCommand().equals(object)){

				l37.setText(B[0].getText());
				l37.setBorder(new LineBorder(Color.PINK, 2, true));
				B[0].setBorder(new LineBorder(Color.green, 2, true));
				B[0].setEnabled(false);
			}

			else if(l48.getActionCommand().equals(object)){

				l48.setText(B[0].getText());
				l48.setBorder(new LineBorder(Color.PINK, 2, true));
				B[0].setBorder(new LineBorder(Color.green, 2, true));
				B[0].setEnabled(false);
		}

			else if(l59.getActionCommand().equals(object)){

				l59.setText(B[0].getText());
				l59.setBorder(new LineBorder(Color.PINK, 2, true));
				B[0].setBorder(new LineBorder(Color.green, 2, true));
				B[0].setEnabled(false);
		}
			else if(l60.getActionCommand().equals(object)){

				l60.setText(B[0].getText());
				l60.setBorder(new LineBorder(Color.PINK, 2, true));
				B[0].setBorder(new LineBorder(Color.green, 2, true));
				B[0].setEnabled(false);
		}
			}



		else if(ae.getActionCommand().equals("B2"))
		{
			String object=null;
			Set s=hm.keySet();
			Iterator i=s.iterator();
			while (i.hasNext()) {
				object = (String) i.next();
				if(hm.get(object).equals("-1")){
					hm.put(object, "B2");
					break;
				}
			}
			System.out.println(object);
			if(l15.getActionCommand().equals(object)){

				l15.setText(B[1].getText());
				l15.setBorder(new LineBorder(Color.PINK, 2, true));
				B[1].setBorder(new LineBorder(Color.green, 2, true));
				B[1].setEnabled(false);
				System.out.println(l15.getText());
			}
			else if(l26.getActionCommand().equals(object)){

				l26.setText(B[1].getText());
				l26.setBorder(new LineBorder(Color.PINK, 2, true));
				B[1].setBorder(new LineBorder(Color.green, 2, true));
				B[1].setEnabled(false);
			}

			else if(l37.getActionCommand().equals(object)){

				l37.setText(B[1].getText());
				l37.setBorder(new LineBorder(Color.PINK, 2, true));
				B[1].setBorder(new LineBorder(Color.green, 2, true));
				B[1].setEnabled(false);
			}

			else if(l48.getActionCommand().equals(object)){

				l48.setText(B[1].getText());
				l48.setBorder(new LineBorder(Color.PINK, 2, true));
				B[1].setBorder(new LineBorder(Color.green, 2, true));
				B[1].setEnabled(false);
		}
			else if(l59.getActionCommand().equals(object)){

				l59.setText(B[1].getText());
				l59.setBorder(new LineBorder(Color.PINK, 2, true));
				B[1].setBorder(new LineBorder(Color.green, 2, true));
				B[1].setEnabled(false);
		}
			else if(l60.getActionCommand().equals(object)){

				l60.setText(B[1].getText());
				l60.setBorder(new LineBorder(Color.PINK, 2, true));
				B[1].setBorder(new LineBorder(Color.green, 2, true));
				B[1].setEnabled(false);
		}
		}


		else if(ae.getActionCommand().equals("B3"))
		{
			String object=null;
			Set s=hm.keySet();
			Iterator i=s.iterator();
			while (i.hasNext()) {
				object = (String) i.next();
				if(hm.get(object).equals("-1")){
					hm.put(object, "B3");
					break;
				}
			}
			System.out.println(object);
			if(l15.getActionCommand().equals(object)){

				l15.setText(B[2].getText());
				l15.setBorder(new LineBorder(Color.PINK, 2, true));
				B[2].setBorder(new LineBorder(Color.green, 2, true));
				B[2].setEnabled(false);
				System.out.println(l15.getText());
			}
			else if(l26.getActionCommand().equals(object)){

				l26.setText(B[2].getText());
				l26.setBorder(new LineBorder(Color.PINK, 2, true));
				B[2].setBorder(new LineBorder(Color.green, 2, true));
				B[2].setEnabled(false);
			}

			else if(l37.getActionCommand().equals(object)){

				l37.setText(B[2].getText());
				l37.setBorder(new LineBorder(Color.PINK, 2, true));
				B[2].setBorder(new LineBorder(Color.green, 2, true));
				B[2].setEnabled(false);
			}

			else if(l48.getActionCommand().equals(object)){

				l48.setText(B[2].getText());
				l48.setBorder(new LineBorder(Color.PINK, 2, true));
				B[2].setBorder(new LineBorder(Color.green, 2, true));
				B[2].setEnabled(false);
		}
			else if(l59.getActionCommand().equals(object)){

				l59.setText(B[2].getText());
				l59.setBorder(new LineBorder(Color.PINK, 2, true));
				B[2].setBorder(new LineBorder(Color.green, 2, true));
				B[2].setEnabled(false);
		}
			else if(l60.getActionCommand().equals(object)){

				l60.setText(B[2].getText());
				l60.setBorder(new LineBorder(Color.PINK, 2, true));
				B[2].setBorder(new LineBorder(Color.green, 2, true));
				B[2].setEnabled(false);
		}
		}



		else if(ae.getActionCommand().equals("B4"))
		{
			String object=null;
			Set s=hm.keySet();
			Iterator i=s.iterator();
			while (i.hasNext()) {
				object = (String) i.next();
				if(hm.get(object).equals("-1")){
					hm.put(object, "B4");
					break;
				}
			}
			System.out.println(object);
			if(l15.getActionCommand().equals(object)){

				l15.setText(B[3].getText());
				l15.setBorder(new LineBorder(Color.PINK, 2, true));
				B[3].setBorder(new LineBorder(Color.green, 2, true));
				B[3].setEnabled(false);
				System.out.println(l15.getText());
			}
			else if(l26.getActionCommand().equals(object)){

				l26.setText(B[3].getText());
				l26.setBorder(new LineBorder(Color.PINK, 2, true));
				B[3].setBorder(new LineBorder(Color.green, 2, true));
				B[3].setEnabled(false);
			}

			else if(l37.getActionCommand().equals(object)){

				l37.setText(B[3].getText());
				l37.setBorder(new LineBorder(Color.PINK, 2, true));
				B[3].setBorder(new LineBorder(Color.green, 2, true));
				B[3].setEnabled(false);
			}

			else if(l48.getActionCommand().equals(object)){

				l48.setText(B[3].getText());
				l48.setBorder(new LineBorder(Color.PINK, 2, true));
				B[3].setBorder(new LineBorder(Color.green, 2, true));
				B[3].setEnabled(false);
		}
			else if(l59.getActionCommand().equals(object)){

				l59.setText(B[3].getText());
				l59.setBorder(new LineBorder(Color.PINK, 2, true));
				B[3].setBorder(new LineBorder(Color.green, 2, true));
				B[3].setEnabled(false);
		}
			else if(l60.getActionCommand().equals(object)){

				l60.setText(B[3].getText());
				l60.setBorder(new LineBorder(Color.PINK, 2, true));
				B[3].setBorder(new LineBorder(Color.green, 2, true));
				B[3].setEnabled(false);
		}
		}


		else if(ae.getActionCommand().equals("B5"))
		{
			String object=null;
			Set s=hm.keySet();
			Iterator i=s.iterator();
			while (i.hasNext()) {
				object = (String) i.next();
				if(hm.get(object).equals("-1")){
					hm.put(object, "B5");
					break;
				}
			}
			System.out.println(object);
			if(l15.getActionCommand().equals(object)){

				l15.setText(B[4].getText());
				l15.setBorder(new LineBorder(Color.PINK, 2, true));
				B[4].setBorder(new LineBorder(Color.green, 2, true));
				B[4].setEnabled(false);
				System.out.println(l15.getText());
			}
			else if(l26.getActionCommand().equals(object)){

				l26.setText(B[4].getText());
				l26.setBorder(new LineBorder(Color.PINK, 2, true));
				B[4].setBorder(new LineBorder(Color.green, 2, true));
				B[4].setEnabled(false);
			}

			else if(l37.getActionCommand().equals(object)){

				l37.setText(B[4].getText());
				l37.setBorder(new LineBorder(Color.PINK, 2, true));
				B[4].setBorder(new LineBorder(Color.green, 2, true));
				B[4].setEnabled(false);
			}

			else if(l48.getActionCommand().equals(object)){

				l48.setText(B[4].getText());
				l48.setBorder(new LineBorder(Color.PINK, 2, true));
				B[4].setBorder(new LineBorder(Color.green, 2, true));
				B[4].setEnabled(false);
		}
			else if(l59.getActionCommand().equals(object)){

				l59.setText(B[4].getText());
				l59.setBorder(new LineBorder(Color.PINK, 2, true));
				B[4].setBorder(new LineBorder(Color.green, 2, true));
				B[4].setEnabled(false);
		}
			else if(l60.getActionCommand().equals(object)){

				l60.setText(B[4].getText());
				l60.setBorder(new LineBorder(Color.PINK, 2, true));
				B[4].setBorder(new LineBorder(Color.green, 2, true));
				B[4].setEnabled(false);
		}
		}


		else if(ae.getActionCommand().equals("B6"))
		{
			String object=null;
			Set s=hm.keySet();
			Iterator i=s.iterator();
			while (i.hasNext()) {
				object = (String) i.next();
				if(hm.get(object).equals("-1")){
					hm.put(object, "B6");
					break;
				}
			}
			System.out.println(object);
			if(l15.getActionCommand().equals(object)){

				l15.setText(B[5].getText());
				l15.setBorder(new LineBorder(Color.PINK, 2, true));
				B[5].setBorder(new LineBorder(Color.green, 2, true));
				B[5].setEnabled(false);
				System.out.println(l15.getText());
			}
			else if(l26.getActionCommand().equals(object)){

				l26.setText(B[5].getText());
				l26.setBorder(new LineBorder(Color.PINK, 2, true));
				B[5].setBorder(new LineBorder(Color.green, 2, true));
				B[5].setEnabled(false);
			}

			else if(l37.getActionCommand().equals(object)){

				l37.setText(B[5].getText());
				l37.setBorder(new LineBorder(Color.PINK, 2, true));
				B[5].setBorder(new LineBorder(Color.green, 2, true));
				B[5].setEnabled(false);
			}

			else if(l48.getActionCommand().equals(object)){

				l48.setText(B[5].getText());
				l48.setBorder(new LineBorder(Color.PINK, 2, true));
				B[5].setBorder(new LineBorder(Color.green, 2, true));
				B[5].setEnabled(false);
		}
			else if(l59.getActionCommand().equals(object)){

				l59.setText(B[5].getText());
				l59.setBorder(new LineBorder(Color.PINK, 2, true));
				B[5].setBorder(new LineBorder(Color.green, 2, true));
				B[5].setEnabled(false);
		}
			else if(l60.getActionCommand().equals(object)){

				l60.setText(B[5].getText());
				l60.setBorder(new LineBorder(Color.PINK, 2, true));
				B[5].setBorder(new LineBorder(Color.green, 2, true));
				B[5].setEnabled(false);
		}
		}





		if(ae.getActionCommand().equals("l15")){
				String object;
				System.out.println("here");
			 object=(String) hm.get("l15");
			 System.out.println(object);
			 l15.setText("");
			if(B[0].getActionCommand().equals(object)){
				hm.put("l15", "-1");
				l15.setBorder(new LineBorder(Color.red, 2, true));
				B[0].setBorder(new LineBorder(Color.orange, 2, true));
				B[0].setEnabled(true);
			}
			else if(B[1].getActionCommand().equals(object)){
				hm.put("l15", "-1");
				l15.setBorder(new LineBorder(Color.red, 2, true));
				B[1].setBorder(new LineBorder(Color.orange, 2, true));
				B[1].setEnabled(true);
			}

			else if(B[2].getActionCommand().equals(object)){
				hm.put("l15", "-1");
				l15.setBorder(new LineBorder(Color.red, 2, true));
				B[2].setBorder(new LineBorder(Color.orange, 2, true));
				B[2].setEnabled(true);
			}

			else if(B[3].getActionCommand().equals(object)){
				hm.put("l15", "-1");
				l15.setBorder(new LineBorder(Color.red, 2, true));
				B[3].setBorder(new LineBorder(Color.orange, 2, true));
				B[3].setEnabled(true);
			}

			else if(B[4].getActionCommand().equals(object)){
				hm.put("l15", "-1");
				l15.setBorder(new LineBorder(Color.red, 2, true));
				B[4].setBorder(new LineBorder(Color.orange, 2, true));
				B[4].setEnabled(true);
			}

			else if(B[5].getActionCommand().equals(object)){
				hm.put("l15", "-1");
				l15.setBorder(new LineBorder(Color.red, 2, true));
				B[5].setBorder(new LineBorder(Color.orange, 2, true));
				B[5].setEnabled(true);
			}


		}



		else if(ae.getActionCommand().equals("l26")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l26");
		 System.out.println(object);
		 l26.setText("");
		if(B[0].getActionCommand().equals(object)){
			hm.put("l26", "-1");
			l26.setBorder(new LineBorder(Color.red, 2, true));
			B[0].setBorder(new LineBorder(Color.orange, 2, true));
			B[0].setEnabled(true);
		}
		else if(B[1].getActionCommand().equals(object)){
			hm.put("l26", "-1");
			l26.setBorder(new LineBorder(Color.red, 2, true));
			B[1].setBorder(new LineBorder(Color.orange, 2, true));
			B[1].setEnabled(true);
		}

		else if(B[2].getActionCommand().equals(object)){
			hm.put("l26", "-1");
			l26.setBorder(new LineBorder(Color.red, 2, true));
			B[2].setBorder(new LineBorder(Color.orange, 2, true));
			B[2].setEnabled(true);
		}

		else if(B[3].getActionCommand().equals(object)){
			hm.put("l26", "-1");
			l26.setBorder(new LineBorder(Color.red, 2, true));
			B[3].setBorder(new LineBorder(Color.orange, 2, true));
			B[3].setEnabled(true);
		}
		else if(B[4].getActionCommand().equals(object)){
			hm.put("l26", "-1");
			l26.setBorder(new LineBorder(Color.red, 2, true));
			B[4].setBorder(new LineBorder(Color.orange, 2, true));
			B[4].setEnabled(true);
		}

		else if(B[5].getActionCommand().equals(object)){
			hm.put("l26", "-1");
			l26.setBorder(new LineBorder(Color.red, 2, true));
			B[5].setBorder(new LineBorder(Color.orange, 2, true));
			B[5].setEnabled(true);
		}
	}


		else if(ae.getActionCommand().equals("l37")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l37");
		 System.out.println(object);
		 l37.setText("");
		if(B[0].getActionCommand().equals(object)){
			hm.put("l37", "-1");
			l37.setBorder(new LineBorder(Color.red, 2, true));
			B[0].setBorder(new LineBorder(Color.orange, 2, true));
			B[0].setEnabled(true);
		}
		else if(B[1].getActionCommand().equals(object)){
			hm.put("l37", "-1");
			l37.setBorder(new LineBorder(Color.red, 2, true));
			B[1].setBorder(new LineBorder(Color.orange, 2, true));
			B[1].setEnabled(true);
		}

		else if(B[2].getActionCommand().equals(object)){
			hm.put("l37", "-1");
			l37.setBorder(new LineBorder(Color.red, 2, true));
			B[2].setBorder(new LineBorder(Color.orange, 2, true));
			B[2].setEnabled(true);
		}

		else if(B[3].getActionCommand().equals(object)){
			hm.put("l37", "-1");
			l37.setBorder(new LineBorder(Color.red, 2, true));
			B[3].setBorder(new LineBorder(Color.orange, 2, true));
			B[3].setEnabled(true);
		}
		else if(B[4].getActionCommand().equals(object)){
			hm.put("l37", "-1");
			l37.setBorder(new LineBorder(Color.red, 2, true));
			B[4].setBorder(new LineBorder(Color.orange, 2, true));
			B[4].setEnabled(true);
		}

		else if(B[5].getActionCommand().equals(object)){
			hm.put("l37", "-1");
			l37.setBorder(new LineBorder(Color.red, 2, true));
			B[5].setBorder(new LineBorder(Color.orange, 2, true));
			B[5].setEnabled(true);
		}
	}

		else if(ae.getActionCommand().equals("l48")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l48");
		 System.out.println(object);
		 l48.setText("");
		if(B[0].getActionCommand().equals(object)){
			hm.put("l48", "-1");
			l48.setBorder(new LineBorder(Color.red, 2, true));
			B[0].setBorder(new LineBorder(Color.orange, 2, true));
			B[0].setEnabled(true);
		}
		else if(B[1].getActionCommand().equals(object)){
			hm.put("l48", "-1");
			l48.setBorder(new LineBorder(Color.red, 2, true));
			B[1].setBorder(new LineBorder(Color.orange, 2, true));
			B[1].setEnabled(true);
		}

		else if(B[2].getActionCommand().equals(object)){
			hm.put("l48", "-1");
			l48.setBorder(new LineBorder(Color.red, 2, true));
			B[2].setBorder(new LineBorder(Color.orange, 2, true));
			B[2].setEnabled(true);
		}

		else if(B[3].getActionCommand().equals(object)){
			hm.put("l48", "-1");
			l48.setBorder(new LineBorder(Color.red, 2, true));
			B[3].setBorder(new LineBorder(Color.orange, 2, true));
			B[3].setEnabled(true);
		}
		else if(B[4].getActionCommand().equals(object)){
			hm.put("l48", "-1");
			l48.setBorder(new LineBorder(Color.red, 2, true));
			B[4].setBorder(new LineBorder(Color.orange, 2, true));
			B[4].setEnabled(true);
		}
		else if(B[5].getActionCommand().equals(object)){
			hm.put("l48", "-1");
			l48.setBorder(new LineBorder(Color.red, 2, true));
			B[5].setBorder(new LineBorder(Color.orange, 2, true));
			B[5].setEnabled(true);
		}

	}


		else if(ae.getActionCommand().equals("l59")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l9");
		 System.out.println(object);
		 l59.setText("");
		if(B[0].getActionCommand().equals(object)){
			hm.put("l59", "-1");
			l59.setBorder(new LineBorder(Color.red, 2, true));
			B[0].setBorder(new LineBorder(Color.orange, 2, true));
			B[0].setEnabled(true);
		}
		else if(B[1].getActionCommand().equals(object)){
			hm.put("l59", "-1");
			l59.setBorder(new LineBorder(Color.red, 2, true));
			B[1].setBorder(new LineBorder(Color.orange, 2, true));
			B[1].setEnabled(true);
		}

		else if(B[2].getActionCommand().equals(object)){
			hm.put("l59", "-1");
			l59.setBorder(new LineBorder(Color.red, 2, true));
			B[2].setBorder(new LineBorder(Color.orange, 2, true));
			B[2].setEnabled(true);
		}

		else if(B[3].getActionCommand().equals(object)){
			hm.put("l59", "-1");
			l59.setBorder(new LineBorder(Color.red, 2, true));
			B[3].setBorder(new LineBorder(Color.orange, 2, true));
			B[3].setEnabled(true);
		}
		else if(B[4].getActionCommand().equals(object)){
			hm.put("l59", "-1");
			l59.setBorder(new LineBorder(Color.red, 2, true));
			B[4].setBorder(new LineBorder(Color.orange, 2, true));
			B[4].setEnabled(true);
		}
		else if(B[5].getActionCommand().equals(object)){
			hm.put("l59", "-1");
			l59.setBorder(new LineBorder(Color.red, 2, true));
			B[5].setBorder(new LineBorder(Color.orange, 2, true));
			B[5].setEnabled(true);
		}

	}

		else if(ae.getActionCommand().equals("l60")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l10");
		 System.out.println(object);
		 l60.setText("");
		if(B[0].getActionCommand().equals(object)){
			hm.put("l60", "-1");
			l60.setBorder(new LineBorder(Color.red, 2, true));
			B[0].setBorder(new LineBorder(Color.orange, 2, true));
			B[0].setEnabled(true);
		}
		else if(B[1].getActionCommand().equals(object)){
			hm.put("l60", "-1");
			l60.setBorder(new LineBorder(Color.red, 2, true));
			B[1].setBorder(new LineBorder(Color.orange, 2, true));
			B[1].setEnabled(true);
		}

		else if(B[2].getActionCommand().equals(object)){
			hm.put("l60", "-1");
			l60.setBorder(new LineBorder(Color.red, 2, true));
			B[2].setBorder(new LineBorder(Color.orange, 2, true));
			B[2].setEnabled(true);
		}

		else if(B[3].getActionCommand().equals(object)){
			hm.put("l60", "-1");
			l60.setBorder(new LineBorder(Color.red, 2, true));
			B[3].setBorder(new LineBorder(Color.orange, 2, true));
			B[3].setEnabled(true);
		}
		else if(B[4].getActionCommand().equals(object)){
			hm.put("l60", "-1");
			l60.setBorder(new LineBorder(Color.red, 2, true));
			B[4].setBorder(new LineBorder(Color.orange, 2, true));
			B[4].setEnabled(true);
		}
		else if(B[5].getActionCommand().equals(object)){
			hm.put("l60", "-1");
			l60.setBorder(new LineBorder(Color.red, 2, true));
			B[5].setBorder(new LineBorder(Color.orange, 2, true));
			B[5].setEnabled(true);
		}

	}

		if(ae.getActionCommand().equals("cancel"))
		{
			setVisible(false);
			Main.s.setVisible(true);
		}

		if(ae.getActionCommand().equals("Home"))
		{
			timer.stop();
			setVisible(false);
			Main.s.setVisible(true);

		}

	}

	@Override
	public void run() {
		try{
		// TODO Auto-generated method stub
		String str=null;
		int a[]=new int[6]; //creating array of size 4
		int w,p,cnt=0; //variable for word and button select
		Random r1;
		for(int i=0;i<a.length;i++) //Initialization of array to -1 for assign the word and button random
			{
			a[i]=-1;
			}

		int n=0;
		r=new Random();
		n=r.nextInt(l.size()); //taking random number of linklist Size to take a random word
		//System.out.println(n+"\t\t"+l.size());
		str1=(String) l.get(n); //geting a word from linklist
		str2=(String) h.get(n);
		hint.setText(str2);
		//System.out.println(str1+"\t"+str1.length());
		r1=new Random(6);

		while(cnt!=6)
		{
			//System.out.println("cnt:"+cnt);
			w=r1.nextInt(6); //taking a random to select a char from word
			p=r1.nextInt(6); //taking a random to select a button
			//System.out.println("cnt:"+cnt+"\t"+p+"\t"+w);
			if(a[p]==-1)
			{

				int i;
				for( i=0;i<a.length;i++)
				{
					if(a[i]==w) {			//checking the button is empty or not
						System.out.println(i+"\t"+a[i]);
						break;
					}
				}
				if(i<a.length) continue;
				//System.out.println("---------------------------------------------------------------");
				a[p]=w;cnt++;   //incrementing the counter and giving the value to button
				//for (i = 0; i < a.length; i++) {
				//	System.out.println(i+"\t"+a[i]);
				//}
			}
			else {
				for(int i=0;i<a.length;i++)
				{
					if(a[i]==w) continue;
				}
			}
		}
		for(int i=0;i<B.length;i++)  //setting char to button
		{
			char ch=str1.charAt(a[i]);
			B[i].setText(ch+"");
		}



		while(listener.getCount()!=120)
		{	//System.out.println(listener.getCount());

			if(B[0].isEnabled()==false  &&  B[1].isEnabled()==false && B[2].isEnabled()==false && B[3].isEnabled()==false && B[4].isEnabled()==false && B[5].isEnabled()==false)
			{
				str=l15.getText()+l26.getText()+l37.getText()+l48.getText()+l59.getText()+l60.getText();
				System.out.println(str);
				if(str.equals(str1))
				{
					cor.setVisible(true);
					System.out.println("correct");
					COUNT++;
					l1.setText(" "+COUNT);
					for (int i = 0; i < B.length; i++) {
						B[i].setEnabled(true);
					}
					Thread.sleep(500); 
					cor.setVisible(false);
					
					l15.setBorder(new LineBorder(Color.red, 2, true));
					l26.setBorder(new LineBorder(Color.red, 2, true));
					l37.setBorder(new LineBorder(Color.red, 2, true));
					l48.setBorder(new LineBorder(Color.red, 2, true));
					l59.setBorder(new LineBorder(Color.red, 2, true));
					l60.setBorder(new LineBorder(Color.red, 2, true));


					B[0].setBorder(new LineBorder(Color.orange, 2, true));
					B[1].setBorder(new LineBorder(Color.orange, 2, true));
					B[2].setBorder(new LineBorder(Color.orange, 2, true));
					B[3].setBorder(new LineBorder(Color.orange, 2, true));
					B[4].setBorder(new LineBorder(Color.orange, 2, true));
					B[5].setBorder(new LineBorder(Color.orange, 2, true));


					hm.put("l15", "-1");
					hm.put("l26", "-1");
					hm.put("l37", "-1");
					hm.put("l48", "-1");
					hm.put("l59", "-1");
					hm.put("l60", "-1");

					l15.setText("");
					l26.setText("");
					l37.setText("");
					l48.setText("");
					l59.setText("");
					l60.setText("");

					cnt=0;
					l.remove(str1); //removing the word from linklist
					h.remove(str2);

					n=r.nextInt(l.size());
					str1=(String) l.get(n);

					for(int i=0;i<a.length;i++)
					{
					a[i]=-1;
					}

					while(cnt!=6)
					{
						//System.out.println("cnt:"+cnt);
						w=r1.nextInt(6);
						p=r1.nextInt(6);
						//System.out.println("cnt:"+cnt+"\t"+p+"\t"+w);
						if(a[p]==-1)
						{

							int i;
							for( i=0;i<a.length;i++)
							{
								if(a[i]==w) {
									System.out.println(i+"\t"+a[i]);
									break;
								}
							}
							if(i<a.length) continue;
							//System.out.println("---------------------------------------------------------------");
							a[p]=w;cnt++;
							//for (i = 0; i < a.length; i++) {
							//	System.out.println(i+"\t"+a[i]);
							//}
						}
						else {
							for(int i=0;i<a.length;i++)
							{
								if(a[i]==w) continue;
							}
						}
					}
					for(int i=0;i<B.length;i++)
					{
						char ch=str1.charAt(a[i]);
						B[i].setText(ch+"");
					}

				}
			}
		}

		}catch(Exception e)
		{
			
		}
	}
		
}
