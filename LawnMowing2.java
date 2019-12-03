package PraticeProgram;

import java.util.Scanner;

class Lawn2 {
	final int N;
	double fee;

	public Lawn2() {
		N = 6;
		fee = 0.0;
	}

	public double lawnMowingFee(double area) {
		if (area < 500) {
			fee = 40;
		} else if (area >= 500 && area < 900) {
			fee = 60;
		}
		if (area >= 900 && area < 1500) {
			fee = 75;
		}
		if (area >= 1500) {
			fee = 100;
		}
		return fee;
	}

	public int lawnNumber(double highfee, double lw[], double lwfee[]) {
		int lno = 0;
		/*
		 * for (int i = 0; i < lw.length; i++) { if (highfee == lwfee[i]) { lno
		 * = i + 1; } }
		 */
		int i = 0;

		while (i < lw.length) {
			if (highfee == lwfee[i]) {
				lno = i + 1;
			}
			i++;
		}
		return lno;

	}

	public double checkMaxLwanfee(double lwfee[]) {

		double maxfee = lwfee[0];
		/*
		 * for (int i = 1; i < lwfee.length; i++) { if (lwfee[i] > maxfee) {
		 * maxfee = lwfee[i]; } }
		 */

		int i = 1;
		while (i < lwfee.length) {
			if (lwfee[i] > maxfee) {
				maxfee = lwfee[i];
			}
			i++;
		}
		return maxfee;
	}

	public double checkLowLwanfee(double lwfee[]) {

		double lowfee = lwfee[0];
		/*
		 * for (int i = 1; i < lwfee.length; i++) { if (lwfee[i] < lowfee) {
		 * lowfee = lwfee[i]; } }
		 */
		int i = 1;
		while (i < lwfee.length) {
			if (lwfee[i] < lowfee) {
				lowfee = lwfee[i];
			}
			i++;
		}
		return lowfee;
	}

}

public class LawnMowing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lawn2 l = new Lawn2();
		Scanner sc = new Scanner(System.in);
		int new_N, lno;
		double sum = 0;
		double highfee, lowfee;
		do {
			System.out.print("How many lown value you want to enter:");
			new_N = sc.nextInt();
		} while (new_N > l.N);

		double lw[] = new double[new_N];
		double lwfee[] = new double[new_N];

		for (int i = 0; i < lw.length; i++) {
			System.out.print("Enter area for lawn no " + (i + 1) + ":");
			lw[i] = sc.nextInt();
			lwfee[i] = l.lawnMowingFee(lw[i]);
			System.out.println("Lown moving fee for lawn no " + lw[i] + " is:" + l.lawnMowingFee(lw[i]));
			sum = sum + lwfee[i];
		}

		highfee = l.checkMaxLwanfee(lwfee);
		lowfee = l.checkLowLwanfee(lwfee);
		lno = l.lawnNumber(highfee, lw, lwfee);
		double avg = sum / lwfee.length;

		System.out.println("**************** REPORT ********************");
		System.out.println("Total weekly lawn mowing fee:" + sum);
		System.out.println("Average of weekly lawn mowing fee:" + avg);
		System.out.println("Highest lown fee is:" + highfee);
		System.out.println("Lown number of Highest lown fee is:" + lno);
		System.out.println("Lowest lown fee is:" + lowfee);

		/*
		 * System.out.
		 * println("\033[31;1mHello\033[0m, \033[32;1;2mworld!\033[0m");
		 * System.out.
		 * println("\033[31mRed\033[32m, Green\033[33m, Yellow\033[34m, Blue\033[0m"
		 * );
		 * 
		 */

	}
}
