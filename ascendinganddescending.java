package PraticeProgram;

import java.util.Scanner;

public class ascendinganddescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];
		int i, j, t;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element of Array");

		for (i = 0; i < a.length; i++) {

			System.out.print("Enter " + i + " Element : ");
			a[i] = sc.nextInt();
		}

		System.out.println("Array Elements are  :");

		for (i = 0; i < a.length; i++) {
			System.out.println("A[" + i + "]=" + a[i]);
		}

		for (i = 0; i < a.length; i++) {

			for (j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					t = a[i];
					a[i] = a[j];
					a[j] = t;

				}
			}
		}

		System.out.println("Array are in Ascending order");

		for (i = 0; i < a.length; i++) {

			System.out.println("A[" + i + "] = " + a[i]);
		}

		

		for (i = 0; i < a.length; i++) {

			for (j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {

					t = a[i];
					a[i] = a[j];
					a[j] = t;

				}
			}
		}

		System.out.println("Array are in Descending  order");

		for (i = 0; i < a.length; i++) {

			System.out.println("A[" + i + "] = " + a[i]);
		}
	}

}
