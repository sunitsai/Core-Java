package PraticeProgram;

import java.util.Scanner;

public class fulltriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the row value : ");
		int row = sc.nextInt();
		
		for(i=0;i<=row;i++){
			
			for(k=row;k>i;k--){
				
				System.out.print(" ");
			}
			
			for(j=1;j<=i;j++){
				
				System.out.print(" *");
			}
			
			System.out.println();
		}

	}

}
