package PraticeProgram;

import java.util.Scanner;

public class fibonacipractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, a = 0, b = 0, c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println(("enter the value N:"));
		n = sc.nextInt();
		int i = 6;
		do {
			a = b;
			b = c;
			c = a + b;
			System.out.println(+a);
			i++;
		} while (i <= n);
	}

}
