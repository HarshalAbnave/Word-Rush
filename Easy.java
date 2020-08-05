import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Easy extends JFrame implements ActionListener,Runnable{

	//JFrame f;
	JLabel l1,l2,l3,l4,label,hint,cor;
	JButton HomeButton,l5,l6,l7,l8,w;
	JButton B[];
	LinkedList l,h;
	Random r;
	static int COUNT=0;

	private JLabel BgLabel;
	private TreeMap hm;

	private MyListener listener;
	 String str1=null,str2=null;
	 Timer timer;

	public Easy() {

		hm=new TreeMap();
		hm.put("l5", "-1");
		hm.put("l6","-1");
		hm.put("l7", "-1");
		hm.put("l8", "-1");

		l=new LinkedList();
		h=new LinkedList();

		setSize(470,450);
		setResizable(false);
		setUndecorated(true);
		setLocation(150, 150);
		setLayout(null);
		BgLabel= createBackgroundLabel();
		add(BgLabel);

		l1=new JLabel("00");
		l1.setBounds(15, 8, 25, 50);
		l1.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(l1);
		
		cor=new JLabel("Correct");
		cor.setBounds(180, 250, 150, 50);
		cor.setForeground(Color.DARK_GRAY);
		cor.setFont(new Font("Tahoma", Font.BOLD, 16));
		cor.setVisible(false);
		BgLabel.add(cor);

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

		l3=new JLabel("Score");
		l3.setBounds(3, 28, 70, 50);
		l3.setForeground(Color.DARK_GRAY);
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(l3);

		l2=new JLabel(Main.score+"");
		l2.setBounds(410, 8, 260, 50);
		l2.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(l2);

		l4=new JLabel("Best");
		l4.setBounds(400, 28, 50, 50);
		l4.setForeground(Color.DARK_GRAY);
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setFont(new Font("Tahoma", Font.BOLD, 16));
		BgLabel.add(l4);

		Font f=new Font("Tahoma",Font.BOLD,25);
		l5=new JButton("");
		l5.setBounds(10, 88, 60, 50);
		l5.setFont(f);
		l5.setForeground(Color.red);
		l5.setBorder(new LineBorder(Color.red, 2, true));
		l5.setContentAreaFilled(false);
		l5.addActionListener(this);
		l5.setActionCommand("l5");
		BgLabel.add(l5);

		l6=new JButton("");
		l6.setBounds(130, 88, 60, 50);
		l6.setFont(f);
		l6.setForeground(Color.red);
		l6.setBorder(new LineBorder(Color.red, 2,true));
		l6.setContentAreaFilled(false);
		l6.addActionListener(this);
		l6.setActionCommand("l6");
		BgLabel.add(l6);

		l7=new JButton("");
		l7.setBounds(250, 88, 60, 50);
		l7.setFont(f);
		l7.setForeground(Color.red);
		l7.setBorder(new LineBorder(Color.red, 2, true));
		l7.setContentAreaFilled(false);
		l7.addActionListener(this);
		l7.setActionCommand("l7");
		BgLabel.add(l7);

		l8=new JButton("");
		l8.setBounds(370, 88, 60, 50);
		l8.setFont(f);
		l8.setForeground(Color.red);
		l8.setBorder(new LineBorder(Color.red, 2, true));
		l8.setContentAreaFilled(false);
		l8.addActionListener(this);
		l8.setActionCommand("l8");
		BgLabel.add(l8);

		B=new JButton[4];
		B[0]=new JButton();
		B[0].setBounds(70, 150, 70, 50);
		B[0].setFont(f);
		B[0].setForeground(Color.MAGENTA);
		B[0].setBorder(new LineBorder(Color.orange, 2, true));
		B[0].setContentAreaFilled(false);
		B[0].addActionListener(this);
		B[0].setActionCommand("B1");
		BgLabel.add(B[0]);

		B[1]=new JButton();
		B[1].setBounds(280, 150, 70, 50);
		B[1].setFont(f);
		B[1].setForeground(Color.MAGENTA);
		B[1].setBorder(new LineBorder(Color.orange, 2, true));
		B[1].setContentAreaFilled(false);
		B[1].addActionListener(this);
		B[1].setActionCommand("B2");
		BgLabel.add(B[1]);

		B[2]=new JButton();
		B[2].setBounds(70, 230, 70, 50);
		B[2].setBorder(new LineBorder(Color.orange, 2, true));
		B[2].setFont(f);
		B[2].setForeground(Color.MAGENTA);
		B[2].setContentAreaFilled(false);
		B[2].addActionListener(this);
		B[2].setActionCommand("B3");
		BgLabel.add(B[2]);

		B[3]=new JButton();
		B[3].setBounds(280, 230, 70, 50);
		B[3].setFont(f);
		B[3].setForeground(Color.MAGENTA);
		B[3].setBorder(new LineBorder(Color.orange, 2, true));
		B[3].setContentAreaFilled(false);
		B[3].addActionListener(this);
		B[3].setActionCommand("B4");
		BgLabel.add(B[3]);

		ImageIcon backgroundImages1= new ImageIcon("bb.png");
		HomeButton=new JButton("Home");
		HomeButton.setBounds(5,410, 90, 35);
		Dimension sizel=HomeButton.getSize();
		HomeButton.addActionListener(this);
		HomeButton.setIcon(new ImageIcon(backgroundImages1.getImage().getScaledInstance((int) sizel.getWidth(), (int) sizel.getHeight(), Image.SCALE_SMOOTH)));
		HomeButton.setContentAreaFilled(false);
		HomeButton.setBorderPainted(false);
		HomeButton.setActionCommand("Home");
		BgLabel.add(HomeButton);

		hint=new JLabel("HINT:");
		BgLabel.add(hint);

		hint.setBounds(80, 350, 380, 50);
		hint.setForeground(Color.MAGENTA);
		hint.setFont(new Font("Tahoma", Font.BOLD, 15));
//		BgLabel.add(hint);

		label=new JLabel("count:0");
		//BgLabel.add(label);
		//label.setBounds(360,380,80,50);
		//label.setHorizontalAlignment(SwingConstants.CENTER);
		//label.setFont(new Font("Tahoma", Font.BOLD, 15));




		//setVisible(true);
		// TODO Auto-generated constructor stub
	}
	 void setTimer()
	 {
		 listener =new MyListener(label);


		 timer = new Timer(1000,listener);
		 timer.start();
	 }

public static void main(String[] args) {
	
	new Easy();
	
		// TODO Auto-generated method stub

	}



	 private JLabel createBackgroundLabel() {
		Dimension size = getSize();
        Icon backgroundImage = new ImageIcon("counter.gif");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, (int) size.getWidth(), (int) size.getHeight());
       // backgroundLabel.setIcon(new ImageIcon(backgroundImage.getImage().getScaledInstance((int) size.getWidth(), (int) size.getHeight(), Image.SCALE_SMOOTH)));
        return backgroundLabel;
		// TODO Auto-generated method stub

	}
	 public void clear()
	 {
		 for (int i = 0; i < B.length; i++) {
				B[i].setEnabled(true);
			}
		 l5.setText("");
		 l6.setText("");
		 l7.setText("");
		 l8.setText("");
		 label.setText("count:0");
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
				l6.setBorder(new LineBorder(Color.pink, 2, true));
				B[0].setBorder(new LineBorder(Color.green, 2, true));
				B[0].setEnabled(false);
			}

			else if(l7.getActionCommand().equals(object)){

				l7.setText(B[0].getText());
				l7.setBorder(new LineBorder(Color.pink, 2, true));
				B[0].setBorder(new LineBorder(Color.green, 2, true));
				B[0].setEnabled(false);
			}

			else if(l8.getActionCommand().equals(object)){

				l8.setText(B[0].getText());
				l8.setBorder(new LineBorder(Color.pink, 2, true));
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
		//	System.out.println(object);
			if(l5.getActionCommand().equals(object)){

				l5.setText(B[1].getText());
				l5.setBorder(new LineBorder(Color.pink, 2, true));
				B[1].setBorder(new LineBorder(Color.green, 2, true));
				B[1].setEnabled(false);
				//System.out.println(l5.getText());
			}
			else if(l6.getActionCommand().equals(object)){

				l6.setText(B[1].getText());
				l6.setBorder(new LineBorder(Color.pink, 2, true));
				B[1].setBorder(new LineBorder(Color.green, 2, true));
				B[1].setEnabled(false);
			}

			else if(l7.getActionCommand().equals(object)){

				l7.setText(B[1].getText());
				l7.setBorder(new LineBorder(Color.pink, 2, true));
				B[1].setBorder(new LineBorder(Color.green, 2, true));
				B[1].setEnabled(false);
			}

			else if(l8.getActionCommand().equals(object)){

				l8.setText(B[1].getText());
				l8.setBorder(new LineBorder(Color.pink, 2, true));
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
			//System.out.println(object);
			if(l5.getActionCommand().equals(object)){

				l5.setText(B[2].getText());
				l5.setBorder(new LineBorder(Color.pink, 2, true));
				B[2].setBorder(new LineBorder(Color.green, 2, true));
				B[2].setEnabled(false);
			//	System.out.println(l5.getText());
			}
			else if(l6.getActionCommand().equals(object)){

				l6.setText(B[2].getText());
				l6.setBorder(new LineBorder(Color.pink, 2, true));
				B[2].setBorder(new LineBorder(Color.green, 2, true));
				B[2].setEnabled(false);
			}

			else if(l7.getActionCommand().equals(object)){

				l7.setText(B[2].getText());
				l7.setBorder(new LineBorder(Color.pink, 2, true));
				B[2].setBorder(new LineBorder(Color.green, 2, true));
				B[2].setEnabled(false);
			}

			else if(l8.getActionCommand().equals(object)){

				l8.setText(B[2].getText());
				l8.setBorder(new LineBorder(Color.pink, 2, true));
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
			//System.out.println(object);
			if(l5.getActionCommand().equals(object)){

				l5.setText(B[3].getText());
				l5.setBorder(new LineBorder(Color.pink, 2, true));
				B[3].setBorder(new LineBorder(Color.green, 2, true));
				B[3].setEnabled(false);
				//System.out.println(l5.getText());
			}
			else if(l6.getActionCommand().equals(object)){

				l6.setText(B[3].getText());
				l6.setBorder(new LineBorder(Color.pink, 2, true));
				B[3].setBorder(new LineBorder(Color.green, 2, true));
				B[3].setEnabled(false);
			}

			else if(l7.getActionCommand().equals(object)){

				l7.setText(B[3].getText());
				l7.setBorder(new LineBorder(Color.pink, 2, true));
				B[3].setBorder(new LineBorder(Color.green, 2, true));
				B[3].setEnabled(false);
			}

			else if(l8.getActionCommand().equals(object)){

				l8.setText(B[3].getText());
				l8.setBorder(new LineBorder(Color.pink, 2, true));
				B[3].setBorder(new LineBorder(Color.green, 2, true));
				B[3].setEnabled(false);
		}
		}




		else if(ae.getActionCommand().equals("l5")){
				String object;
				System.out.println("here");
			 object=(String) hm.get("l5");
			 //System.out.println(object);
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

		}



		else if(ae.getActionCommand().equals("l6")){
			String object;
			//System.out.println("here");
		 object=(String) hm.get("l6");
		// System.out.println(object);
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

	}


		else if(ae.getActionCommand().equals("l7")){
			String object;
			//System.out.println("here");
		 object=(String) hm.get("l7");
		// System.out.println(object);
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

	}


		else if(ae.getActionCommand().equals("l8")){
			String object;

		 object=(String) hm.get("l8");
		// System.out.println(object);
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

	}

		if(ae.getActionCommand().equals("Home"))
		{
			Main.s.setVisible(true);
			setVisible(false);


		}

		if(ae.getActionCommand().equals("cancel"))
		{
			timer.stop(); 
			setVisible(false);
			Main.s.setVisible(true);
		}
		// TODO Auto-generated method stub


}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			String str=null;
			int a[]=new int[4];
			int w,p,cnt=0;
			Random r1;
			for(int i=0;i<a.length;i++)
				{
				a[i]=-1;
				}

			int n=0,p1=0;
			r=new Random();
			n=r.nextInt(l.size());
		//	p1=r.nextInt(h.size());
			//System.out.println(n+"\t\t"+l.size());
			str1=(String) l.get(n);
			str2=(String) h.get(n);
			hint.setText(str2);
			//System.out.println(str1+"\t"+str1.length());
			r1=new Random(4);

			while(cnt!=4)
			{
				//System.out.println("cnt:"+cnt);
				w=r1.nextInt(4);
				p1=r1.nextInt(4);
				//System.out.println("cnt:"+cnt+"\t"+p+"\t"+w);
				if(a[p1]==-1)
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
					a[p1]=w;cnt++;
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



			while(listener.getCount()!=60)
			{	//System.out.println(listener.getCount());

				if(B[0].isEnabled()==false  &&  B[1].isEnabled()==false && B[2].isEnabled()==false && B[3].isEnabled()==false)
				{
					str=l5.getText()+l6.getText()+l7.getText()+l8.getText();
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

						B[0].setBorder(new LineBorder(Color.orange, 2, true));
						B[1].setBorder(new LineBorder(Color.orange, 2, true));
						B[2].setBorder(new LineBorder(Color.orange, 2, true));
						B[3].setBorder(new LineBorder(Color.orange, 2, true));


						hm.put("l5", "-1");
						hm.put("l6", "-1");
						hm.put("l7", "-1");
						hm.put("l8", "-1");

						l5.setText("");
						l6.setText("");
						l7.setText("");
						l8.setText("");

						cnt=0;
						l.remove(str1);
						h.remove(str2);
						
						n=r.nextInt(l.size());
						str1=(String) l.get(n);
						str2=(String) h.get(n);
						hint.setText(str2);

						for(int i=0;i<a.length;i++)
						{
						a[i]=-1;
						}

						while(cnt!=4)
						{
							//System.out.println("cnt:"+cnt);
							w=r1.nextInt(4);
							p1=r1.nextInt(4);
							//System.out.println("cnt:"+cnt+"\t"+p+"\t"+w);
							if(a[p1]==-1)
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
								a[p1]=w;cnt++;
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
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}


