package PraticeProgram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class std1 implements Serializable {

	int rno;
	String fname, lname, email;

	public std1(int rno, String fname, String lname, String email) {
		// TODO Auto-generated constructor stub

		this.rno = rno;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
}

public class Serialization {

	

		public static void main(String[] args) throws Exception {
			std1 s1=new std1(1, "SUNIT", "JHA", "s@gmail.com");
			FileOutputStream fos=new FileOutputStream("ser1");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.flush();
			oos.close();
			
			FileInputStream fis=new FileInputStream("ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			std1 s2=(std1) ois.readObject();
			ois.close();
			System.out.println("Roll No : "+s2.rno+"\nFname : "+s2.fname+"\nLname : "+s2.lname+"\nEmail : "+s2.email);
		}

}
