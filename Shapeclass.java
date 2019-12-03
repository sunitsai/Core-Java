package PraticeProgram;

import java.util.Scanner;

abstract class Shape {

	abstract void areatriangle(double l, double h);
}

class findarea extends Shape {

	@Override
	void areatriangle(double l, double h) {
		// TODO Auto-generated method stub

		double area = l * h;
		System.out.println("Area of Trinangle : " + area);
	}

}

public class Shapeclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double l,h;
		Scanner sc = new Scanner(System.in);
		findarea a = new findarea();
		
		System.out.println("\n Enter the value of H:");
		h = sc.nextDouble();
		System.out.println("Enter the value of L : ");
		l = sc.nextDouble();
		
		a.areatriangle(l, h);
	}
}
