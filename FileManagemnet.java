package PraticeProgram;


import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileManagemnet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		FileOutputStream fos = new FileOutputStream("java");
		String s =  "This is my file managemnet program";
		byte []b = s.getBytes();
		
		fos.write(b);
		fos.flush();
		fos.close();
		
		System.out.println("Data successfully Entered !");
	
		
		
		
		FileInputStream fis = new FileInputStream("java");
		
		int i ;
		
		while((i=fis.read())!= -1){
			
			System.out.println((char)i);
		}
		
		fis.close();
		System.out.println("Data successfully read!");
	}
	
	

}


