import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
public class FileWrite {

	public FileWrite(int highScore) {
		// TODO Auto-generated constructor stub
		try {
			String s="static int score="+highScore+";";
			File f=new File("//cslogin//ty025//workspace//FinalProject/src//Main.java");
			BufferedReader br=new BufferedReader(new FileReader(f));
			String ss=null;
			LinkedList ll=new LinkedList();
			while((ss=br.readLine())!=null){
				if(ss.contains("static int score="))ll.add(s);
				else ll.add(ss);
			}
			FileWriter fw=new FileWriter(f);
			Iterator iterator=ll.iterator();
			while (iterator.hasNext()) {
				String object = (String) iterator.next();
				fw.write(object+"\n");
				
			}
			fw.close();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new FileWrite(24);
	}

}
