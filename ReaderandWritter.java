package PraticeProgram;


import java.io.FileReader;
import java.io.FileWriter;

public class ReaderandWritter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("java2");
		String s = "New File of Reader/Writer";
		fw.write(s);
		fw.flush();
		fw.close();
		
		
		FileReader fr = new FileReader("java2"); 
		int i;
		while((i=fr.read())!=-1){
			
			System.out.print((char)i);
		}
		fr.close();

	}

}
