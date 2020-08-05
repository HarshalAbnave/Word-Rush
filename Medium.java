
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

public class Medium extends JFrame implements ActionListener,Runnable{
	JFrame f;
	JLabel l1,l2,l3,l4,label,hint,cor;
	JButton HomeButton,l5,l6,l7,l8,l9,w;
	JButton B[];

	private JLabel BgLabel;
	private TreeMap hm;

	LinkedList l,h;
	Random r;
	static int COUNT=0;
	String str1=null,str2=null;
	private MyListener listener;
	 Timer timer;

	public Medium() {
		hm=new TreeMap();
		hm.put("l5", "-1");
		hm.put("l6","-1");
		hm.put("l7", "-1");
		hm.put("l8", "-1");
		hm.put("l9", "-1");
		
		l=new LinkedList();
		h=new LinkedList();


		new JFrame("Fifth");
		setSize(470,450);
		setResizable(false);
		setUndecorated(true);
		setLocation(150, 150);
		setLayout(null);
		BgLabel= createBackgroundLabel();
		add(BgLabel);

		cor=new JLabel("Correct");
		cor.setBounds(200, 250, 150, 50);
		cor.setFont(new Font("Tahoma", Font.BOLD, 16));
		cor.setForeground(Color.BLUE);
		cor.setVisible(false);
		BgLabel.add(cor);
		
		
		l1=new JLabel("00");
		l1.setBounds(10, 8, 50, 50);
		l1.setForeground(Color.DARK_GRAY);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Tahoma", Font.BOLD, 20));
		BgLabel.add(l1);


		l3=new JLabel("Score");
		l3.setBounds(3, 28, 70, 50);
		l3.setForeground(Color.DARK_GRAY);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Tahoma", Font.BOLD, 20));
		BgLabel.add(l3);


		ImageIcon backgroundImages3 = new ImageIcon("close.png");
		w=new JButton();
		w.setBounds(420, 0, 50, 20);
		w.addActionListener(this);
		w.setActionCommand("cancel");
		Dimension sizel3=w.getSize();
		w.setIcon(new ImageIcon(backgroundImages3.getImage().getScaledInstance((int) sizel3.getWidth(), (int) sizel3.getHeight(), Image.SCALE_SMOOTH)));
		w.setContentAreaFilled(false);
		w.setBorderPainted(false);
		BgLabel.add(w);

		l2=new JLabel(Main.score+"");
		l2.setBounds(400, 8, 70, 50);
		l2.setForeground(Color.DARK_GRAY);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Tahoma", Font.BOLD, 20));
		BgLabel.add(l2);

		l4=new JLabel("Best");
		l4.setBounds(410, 28, 50, 50);
		l4.setForeground(Color.DARK_GRAY);
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setFont(new Font("Tahoma", Font.BOLD, 20));
		BgLabel.add(l4);

		Font f=new Font("Tahoma", Font.BOLD, 20);
		l5=new JButton("");
		l5.setBounds(10, 88, 50, 50);
		l5.setFont(f);
		l5.addActionListener(this);
		l5.setBorder(new LineBorder(Color.red, 2, true));
		l5.setContentAreaFilled(false);
		l5.setActionCommand("l5");
		BgLabel.add(l5);

		l6=new JButton("");
		l6.setBounds(95, 88, 50, 50);
		l6.addActionListener(this);
		l6.setFont(f);
		l6.setBorder(new LineBorder(Color.red, 2, true));
		l6.setContentAreaFilled(false);
		l6.setActionCommand("l6");
		BgLabel.add(l6);

		l7=new JButton("");
		l7.setBounds(204, 88, 50, 50);
		l7.addActionListener(this);
		l7.setFont(f);
		l7.setBorder(new LineBorder(Color.red, 2, true));
		l7.setContentAreaFilled(false);
		l7.setActionCommand("l7");
		BgLabel.add(l7);

		l8=new JButton("");
		l8.setBounds(316, 88, 50, 50);
		l8.addActionListener(this);
		l8.setFont(f);
		l8.setBorder(new LineBorder(Color.red, 2, true));
		l8.setContentAreaFilled(false);
		l8.setActionCommand("l8");
		BgLabel.add(l8);

		l9=new JButton("");
		l9.setBounds(408, 88, 50, 50);
		l9.addActionListener(this);
		l9.setFont(f);
		l9.setBorder(new LineBorder(Color.red, 2, true));
		l9.setContentAreaFilled(false);
		l9.setActionCommand("l9");
		BgLabel.add(l9);

		B=new JButton[5];
		B[0]=new JButton("a");
		B[0].setBounds(45, 150, 50, 50);
		B[0].addActionListener(this);
		B[0].setFont(f);
		B[0].setBorder(new LineBorder(Color.ORANGE, 2, true));
		B[0].setContentAreaFilled(false);
		B[0].setActionCommand("B1");
		BgLabel.add(B[0]);

		B[1]=new JButton("b");
		B[1].setBounds(350, 150, 50, 50);
		B[1].addActionListener(this);
		B[1].setFont(f);
		B[1].setBorder(new LineBorder(Color.ORANGE, 2, true));
		B[1].setContentAreaFilled(false);
		B[1].setActionCommand("B2");
		BgLabel.add(B[1]);

		B[2]=new JButton("c");
		B[2].setBounds(45, 250, 50, 50);
		B[2].addActionListener(this);
		B[2].setFont(f);
		B[2].setBorder(new LineBorder(Color.ORANGE, 2, true));
		B[2].setContentAreaFilled(false);
		B[2].setActionCommand("B3");
		BgLabel.add(B[2]);

		B[3]=new JButton("d");
		B[3].setBounds(350, 250, 50, 50);
		B[3].addActionListener(this);
		B[3].setFont(f);
		B[3].setBorder(new LineBorder(Color.ORANGE, 2, true));
		B[3].setContentAreaFilled(false);
		B[3].setActionCommand("B4");
		BgLabel.add(B[3]);

		B[4]=new JButton("e");
		B[4].setBounds(210, 300, 50, 50);
		B[4].setFont(f);
		B[4].addActionListener(this);
		B[4].setBorder(new LineBorder(Color.ORANGE, 2, true));
		B[4].setContentAreaFilled(false);
		B[4].setActionCommand("B5");
		BgLabel.add(B[4]);

		ImageIcon backgroundImages1= new ImageIcon("ho.gif");
		HomeButton=new JButton("Home");
		HomeButton.setBounds(2,410, 90, 25);
		Dimension sizel=HomeButton.getSize();
		HomeButton.addActionListener(this);
		HomeButton.setIcon(new ImageIcon(backgroundImages1.getImage().getScaledInstance((int) sizel.getWidth(), (int) sizel.getHeight(), Image.SCALE_SMOOTH)));
		HomeButton.setContentAreaFilled(false);
		HomeButton.setBorderPainted(false);
		HomeButton.setActionCommand("Home");
		BgLabel.add(HomeButton);


		hint=new JLabel("HINT:");
		hint.setBounds(30, 350, 350, 50);
		hint.setForeground(Color.MAGENTA);
		hint.setFont(new Font("Tahoma", Font.BOLD, 18));
		BgLabel.add(hint);

		label=new JLabel("count:0");
		BgLabel.add(label);
		label.setBounds(370,380,80,50);
		label.setForeground(Color.magenta);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));




		//setVisible(true);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Medium();
	}

	private JLabel createBackgroundLabel() {
		Dimension size = getSize();
        ImageIcon backgroundImage = new ImageIcon("s.jpg");
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
		 label.setText("count:0");
		// timer.stop();
		 l5.setText("");
		 l6.setText("");
		 l7.setText("");
		 l8.setText("");
		 l9.setText("");
		 COUNT=0;
		 l2.setText(""+Main.max);
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
			//System.out.println(object);
			if(l5.getActionCommand().equals(object)){

				l5.setText(B[0].getText());
				l5.setBorder(new LineBorder(Color.PINK, 2, true));
				B[0].setBorder(new LineBorder(Color.green, 2, true));
				B[0].setEnabled(false);
				//System.out.println(l5.getText());
			}
			else if(l6.getActionCommand().equals(object)){

				l6.setText(B[0].getText());
				l6.setBorder(new LineBorder(Color.PINK, 2, true));
				B[0].setBorder(new LineBorder(Color.green, 2, true));
				B[0].setEnabled(false);
			}

			else if(l7.getActionCommand().equals(object)){

				l7.setText(B[0].getText());
				l7.setBorder(new LineBorder(Color.PINK, 2, true));
				B[0].setBorder(new LineBorder(Color.green, 2, true));
				B[0].setEnabled(false);
			}

			else if(l8.getActionCommand().equals(object)){

				l8.setText(B[0].getText());
				l8.setBorder(new LineBorder(Color.PINK, 2, true));
				B[0].setBorder(new LineBorder(Color.green, 2, true));
				B[0].setEnabled(false);
		}

			else if(l9.getActionCommand().equals(object)){

				l9.setText(B[0].getText());
				l9.setBorder(new LineBorder(Color.PINK, 2, true));
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
			if(l5.getActionCommand().equals(object)){

				l5.setText(B[1].getText());
				l5.setBorder(new LineBorder(Color.PINK, 2, true));
				B[1].setBorder(new LineBorder(Color.green, 2, true));
				B[1].setEnabled(false);
				System.out.println(l5.getText());
			}
			else if(l6.getActionCommand().equals(object)){

				l6.setText(B[1].getText());
				l6.setBorder(new LineBorder(Color.PINK, 2, true));
				B[1].setBorder(new LineBorder(Color.green, 2, true));
				B[1].setEnabled(false);
			}

			else if(l7.getActionCommand().equals(object)){

				l7.setText(B[1].getText());
				l7.setBorder(new LineBorder(Color.PINK, 2, true));
				B[1].setBorder(new LineBorder(Color.green, 2, true));
				B[1].setEnabled(false);
			}

			else if(l8.getActionCommand().equals(object)){

				l8.setText(B[1].getText());
				l8.setBorder(new LineBorder(Color.PINK, 2, true));
				B[1].setBorder(new LineBorder(Color.green, 2, true));
				B[1].setEnabled(false);
		}
			else if(l9.getActionCommand().equals(object)){

				l9.setText(B[1].getText());
				l9.setBorder(new LineBorder(Color.PINK, 2, true));
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
			if(l5.getActionCommand().equals(object)){

				l5.setText(B[2].getText());
				l5.setBorder(new LineBorder(Color.PINK, 2, true));
				B[2].setBorder(new LineBorder(Color.green, 2, true));
				B[2].setEnabled(false);
				System.out.println(l5.getText());
			}
			else if(l6.getActionCommand().equals(object)){

				l6.setText(B[2].getText());
				l6.setBorder(new LineBorder(Color.PINK, 2, true));
				B[2].setBorder(new LineBorder(Color.green, 2, true));
				B[2].setEnabled(false);
			}

			else if(l7.getActionCommand().equals(object)){

				l7.setText(B[2].getText());
				l7.setBorder(new LineBorder(Color.PINK, 2, true));
				B[2].setBorder(new LineBorder(Color.green, 2, true));
				B[2].setEnabled(false);
			}

			else if(l8.getActionCommand().equals(object)){

				l8.setText(B[2].getText());
				l8.setBorder(new LineBorder(Color.PINK, 2, true));
				B[2].setBorder(new LineBorder(Color.green, 2, true));
				B[2].setEnabled(false);
		}
			else if(l9.getActionCommand().equals(object)){

				l9.setText(B[2].getText());
				l9.setBorder(new LineBorder(Color.PINK, 2, true));
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
			if(l5.getActionCommand().equals(object)){

				l5.setText(B[3].getText());
				l5.setBorder(new LineBorder(Color.PINK, 2, true));
				B[3].setBorder(new LineBorder(Color.green, 2, true));
				B[3].setEnabled(false);
				System.out.println(l5.getText());
			}
			else if(l6.getActionCommand().equals(object)){

				l6.setText(B[3].getText());
				l6.setBorder(new LineBorder(Color.PINK, 2, true));
				B[3].setBorder(new LineBorder(Color.green, 2, true));
				B[3].setEnabled(false);
			}

			else if(l7.getActionCommand().equals(object)){

				l7.setText(B[3].getText());
				l7.setBorder(new LineBorder(Color.PINK, 2, true));
				B[3].setBorder(new LineBorder(Color.green, 2, true));
				B[3].setEnabled(false);
			}

			else if(l8.getActionCommand().equals(object)){

				l8.setText(B[3].getText());
				l8.setBorder(new LineBorder(Color.PINK, 2, true));
				B[3].setBorder(new LineBorder(Color.green, 2, true));
				B[3].setEnabled(false);
		}
			else if(l9.getActionCommand().equals(object)){

				l9.setText(B[3].getText());
				l9.setBorder(new LineBorder(Color.PINK, 2, true));
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
			if(l5.getActionCommand().equals(object)){

				l5.setText(B[4].getText());
				l5.setBorder(new LineBorder(Color.PINK, 2, true));
				B[4].setBorder(new LineBorder(Color.green, 2, true));
				B[4].setEnabled(false);
				System.out.println(l5.getText());
			}
			else if(l6.getActionCommand().equals(object)){

				l6.setText(B[4].getText());
				l6.setBorder(new LineBorder(Color.PINK, 2, true));
				B[4].setBorder(new LineBorder(Color.green, 2, true));
				B[4].setEnabled(false);
			}

			else if(l7.getActionCommand().equals(object)){

				l7.setText(B[4].getText());
				l7.setBorder(new LineBorder(Color.PINK, 2, true));
				B[4].setBorder(new LineBorder(Color.green, 2, true));
				B[4].setEnabled(false);
			}

			else if(l8.getActionCommand().equals(object)){

				l8.setText(B[4].getText());
				l8.setBorder(new LineBorder(Color.PINK, 2, true));
				B[4].setBorder(new LineBorder(Color.green, 2, true));
				B[4].setEnabled(false);
		}
			else if(l9.getActionCommand().equals(object)){

				l9.setText(B[4].getText());
				l9.setBorder(new LineBorder(Color.PINK, 2, true));
				B[4].setBorder(new LineBorder(Color.green, 2, true));
				B[4].setEnabled(false);
		}
		}



		if(ae.getActionCommand().equals("l5")){
				String object;
				System.out.println("here");
			 object=(String) hm.get("l5");
			 System.out.println(object);
			 l5.setText("");
			if(B[0].getActionCommand().equals(object)){
				hm.put("l5", "-1");
				l5.setBorder(new LineBorder(Color.red, 2, true));
				B[0].setBorder(new LineBorder(Color.orange, 2, true));
				B[0].setEnabled(true);
			}
			else if(B[1].getActionCommand().equals(object)){
				hm.put("l5", "-1");
				l5.setBorder(new LineBorder(Color.red, 2, true));
				B[1].setBorder(new LineBorder(Color.orange, 2, true));
				B[1].setEnabled(true);
			}

			else if(B[2].getActionCommand().equals(object)){
				hm.put("l5", "-1");
				l5.setBorder(new LineBorder(Color.red, 2, true));
				B[2].setBorder(new LineBorder(Color.orange, 2, true));
				B[2].setEnabled(true);
			}

			else if(B[3].getActionCommand().equals(object)){
				hm.put("l5", "-1");
				l5.setBorder(new LineBorder(Color.red, 2, true));
				B[3].setBorder(new LineBorder(Color.orange, 2, true));
				B[3].setEnabled(true);
			}

			else if(B[4].getActionCommand().equals(object)){
				hm.put("l5", "-1");
				l5.setBorder(new LineBorder(Color.red, 2, true));
				B[4].setBorder(new LineBorder(Color.orange, 2, true));
				B[4].setEnabled(true);
			}


		}



		else if(ae.getActionCommand().equals("l6")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l6");
		 System.out.println(object);
		 l6.setText("");
		if(B[0].getActionCommand().equals(object)){
			hm.put("l6", "-1");
			l6.setBorder(new LineBorder(Color.red, 2, true));
			B[0].setBorder(new LineBorder(Color.orange, 2, true));
			B[0].setEnabled(true);
		}
		else if(B[1].getActionCommand().equals(object)){
			hm.put("l6", "-1");
			l6.setBorder(new LineBorder(Color.red, 2, true));
			B[1].setBorder(new LineBorder(Color.orange, 2, true));
			B[1].setEnabled(true);
		}

		else if(B[2].getActionCommand().equals(object)){
			hm.put("l6", "-1");
			l6.setBorder(new LineBorder(Color.red, 2, true));
			B[2].setBorder(new LineBorder(Color.orange, 2, true));
			B[2].setEnabled(true);
		}

		else if(B[3].getActionCommand().equals(object)){
			hm.put("l6", "-1");
			l6.setBorder(new LineBorder(Color.red, 2, true));
			B[3].setBorder(new LineBorder(Color.orange, 2, true));
			B[3].setEnabled(true);
		}
		else if(B[4].getActionCommand().equals(object)){
			hm.put("l6", "-1");
			l6.setBorder(new LineBorder(Color.red, 2, true));
			B[4].setBorder(new LineBorder(Color.orange, 2, true));
			B[4].setEnabled(true);
		}


	}


		else if(ae.getActionCommand().equals("l7")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l7");
		 System.out.println(object);
		 l7.setText("");
		if(B[0].getActionCommand().equals(object)){
			hm.put("l7", "-1");
			l7.setBorder(new LineBorder(Color.red, 2, true));
			B[0].setBorder(new LineBorder(Color.orange, 2, true));
			B[0].setEnabled(true);
		}
		else if(B[1].getActionCommand().equals(object)){
			hm.put("l7", "-1");
			l7.setBorder(new LineBorder(Color.red, 2, true));
			B[1].setBorder(new LineBorder(Color.orange, 2, true));
			B[1].setEnabled(true);
		}

		else if(B[2].getActionCommand().equals(object)){
			hm.put("l7", "-1");
			l7.setBorder(new LineBorder(Color.red, 2, true));
			B[2].setBorder(new LineBorder(Color.orange, 2, true));
			B[2].setEnabled(true);
		}

		else if(B[3].getActionCommand().equals(object)){
			hm.put("l7", "-1");
			l7.setBorder(new LineBorder(Color.red, 2, true));
			B[3].setBorder(new LineBorder(Color.orange, 2, true));
			B[3].setEnabled(true);
		}
		else if(B[4].getActionCommand().equals(object)){
			hm.put("l7", "-1");
			l7.setBorder(new LineBorder(Color.red, 2, true));
			B[4].setBorder(new LineBorder(Color.orange, 2, true));
			B[4].setEnabled(true);
		}


	}

		else if(ae.getActionCommand().equals("l8")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l8");
		 System.out.println(object);
		 l8.setText("");
		if(B[0].getActionCommand().equals(object)){
			hm.put("l8", "-1");
			l8.setBorder(new LineBorder(Color.red, 2, true));
			B[0].setBorder(new LineBorder(Color.orange, 2, true));
			B[0].setEnabled(true);
		}
		else if(B[1].getActionCommand().equals(object)){
			hm.put("l8", "-1");
			l8.setBorder(new LineBorder(Color.red, 2, true));
			B[1].setBorder(new LineBorder(Color.orange, 2, true));
			B[1].setEnabled(true);
		}

		else if(B[2].getActionCommand().equals(object)){
			hm.put("l8", "-1");
			l8.setBorder(new LineBorder(Color.red, 2, true));
			B[2].setBorder(new LineBorder(Color.orange, 2, true));
			B[2].setEnabled(true);
		}

		else if(B[3].getActionCommand().equals(object)){
			hm.put("l8", "-1");
			l8.setBorder(new LineBorder(Color.red, 2, true));
			B[3].setBorder(new LineBorder(Color.orange, 2, true));
			B[3].setEnabled(true);
		}
		else if(B[4].getActionCommand().equals(object)){
			hm.put("l8", "-1");
			l8.setBorder(new LineBorder(Color.red, 2, true));
			B[4].setBorder(new LineBorder(Color.orange, 2, true));
			B[4].setEnabled(true);
		}


	}


		else if(ae.getActionCommand().equals("l9")){
			String object;
			System.out.println("here");
		 object=(String) hm.get("l9");
		 System.out.println(object);
		 l9.setText("");
		if(B[0].getActionCommand().equals(object)){
			hm.put("l9", "-1");
			l9.setBorder(new LineBorder(Color.red, 2, true));
			B[0].setBorder(new LineBorder(Color.orange, 2, true));
			B[0].setEnabled(true);
		}
		else if(B[1].getActionCommand().equals(object)){
			hm.put("l9", "-1");
			l9.setBorder(new LineBorder(Color.red, 2, true));
			B[1].setBorder(new LineBorder(Color.orange, 2, true));
			B[1].setEnabled(true);
		}

		else if(B[2].getActionCommand().equals(object)){
			hm.put("l9", "-1");
			l9.setBorder(new LineBorder(Color.red, 2, true));
			B[2].setBorder(new LineBorder(Color.orange, 2, true));
			B[2].setEnabled(true);
		}

		else if(B[3].getActionCommand().equals(object)){
			hm.put("l9", "-1");
			l9.setBorder(new LineBorder(Color.red, 2, true));
			B[3].setBorder(new LineBorder(Color.orange, 2, true));
			B[3].setEnabled(true);
		}
		else if(B[4].getActionCommand().equals(object)){
			hm.put("l9", "-1");
			l9.setBorder(new LineBorder(Color.red, 2, true));
			B[4].setBorder(new LineBorder(Color.orange, 2, true));
			B[4].setEnabled(true);
		}


	}



		if(ae.getActionCommand().equals("Home"))
		{
			setVisible(false);
			Main.s.setVisible(true);


		}

		if(ae.getActionCommand().equals("cancel"))
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
		int a[]=new int[5]; //creating array of size 4
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
		r1=new Random(5);

		while(cnt!=5)
		{
			//System.out.println("cnt:"+cnt);
			w=r1.nextInt(5); //taking a random to select a char from word
			p=r1.nextInt(5); //taking a random to select a button
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



		while(listener.getCount()!=60)
		{	//System.out.println(listener.getCount());

			if(B[0].isEnabled()==false  &&  B[1].isEnabled()==false && B[2].isEnabled()==false && B[3].isEnabled()==false && B[4].isEnabled()==false)
			{
				str=l5.getText()+l6.getText()+l7.getText()+l8.getText()+l9.getText();
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

					l5.setBorder(new LineBorder(Color.red, 2, true));
					l6.setBorder(new LineBorder(Color.red, 2, true));
					l7.setBorder(new LineBorder(Color.red, 2, true));
					l8.setBorder(new LineBorder(Color.red, 2, true));
					l9.setBorder(new LineBorder(Color.red, 2, true));


					B[0].setBorder(new LineBorder(Color.orange, 2, true));
					B[1].setBorder(new LineBorder(Color.orange, 2, true));
					B[2].setBorder(new LineBorder(Color.orange, 2, true));
					B[3].setBorder(new LineBorder(Color.orange, 2, true));
					B[4].setBorder(new LineBorder(Color.orange, 2, true));


					hm.put("l5", "-1");
					hm.put("l6", "-1");
					hm.put("l7", "-1");
					hm.put("l8", "-1");
					hm.put("l9", "-1");
					//hm.put("l10", "-1");

					l5.setText("");
					l6.setText("");
					l7.setText("");
					l8.setText("");
					l9.setText("");


					cnt=0;
					l.remove(str1); //removing the word from linklist
					h.remove(str2);
					
					n=r.nextInt(l.size());
					str1=(String) l.get(n);
					str2=(String) h.get(n);
					hint.setText(str2);

					for(int i=0;i<a.length;i++)
					{
					a[i]=-1;
					}

					while(cnt!=5)
					{
						//System.out.println("cnt:"+cnt);
						w=r1.nextInt(5);
						p=r1.nextInt(5);
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

		}
		catch(Exception e)
		{
			
		}
	}
		


	}


