

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class MyListener implements ActionListener {
	private int count=0;
	public int getCount() {
		return count;
	}

	private JLabel label;
	
	
	
	
		public MyListener(JLabel label) {
		this.label=label;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		count++;
		label.setText("count"+count);
		
		
		if(count==60)
		{
			if(Main.fr.isActive())
			{
				         Main.fr.timer.stop();
						Main.fr.setVisible(false);
						Main.ei.setVisible(true);
						Main.ei.ShowWord();
						count=0;
						if(Easy.COUNT>Main.max)Main.max=Easy.COUNT;
						System.out.print(count);
						
			}
			else {
				if(Main.fi.isActive())
				{
					Main.fi.timer.stop();
				Main.fi.setVisible(false);
				Main.m.setVisible(true);
				Main.m.ShowWord();
				count=0;
				if(Medium.COUNT>Main.max)Main.max=Medium.COUNT;
				System.out.print(count);
				
				}
		}
		}
		
	
		if(count==120)
		{
			if(Main.sf.isActive())
			{
				Main.sf.timer.stop();
				Main.sf.setVisible(false);
				Main.h.setVisible(true);
				Main.h.ShowWord();
				count=0;
				if(Hard.COUNT>Main.max)Main.max=Hard.COUNT;
				
			}
			
			else 
			{
				Main.Sv.timer.stop();
				if(Main.Sv.isActive())
				{
				Main.Sv.setVisible(false);
				Main.e.setVisible(true);
				Main.e.ShowWord();
				count=0;
				if(Expert.COUNT>Main.max)Main.max=Expert.COUNT;
				
			}
			}
		}
				
		// TODO Auto-generated method stub
		
	}

}
