package PraticeProgram;

import java.util.Scanner;

public class StaticKeyword {

	
	static int a;
	
	void putA(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A: ");
		a = sc.nextInt();
	}
	
	void getA(){
		
		System.out.println("A : "+a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StaticKeyword s1 = new StaticKeyword();
		StaticKeyword s2 = new StaticKeyword();
		StaticKeyword s3 = new StaticKeyword();
		
		s1.putA();
		s2.putA();
		s3.putA();
		
		
		s1.getA();
		s2.getA();
		s3.getA();
		
	}

}
