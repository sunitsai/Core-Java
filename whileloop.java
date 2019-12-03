package PraticeProgram;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N : ");
		
		n=sc.nextInt();
		
		while(n>0){
			
			sum = sum + n;
			n--;
		}
		
		System.out.println("Sum :"+sum);
	}

}
