package Main.dayByday4;

import java.util.Scanner;

public class toDay4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		String a = sc.next();
		String[] arr = a.split("");
		double b=arr.length;

		for (int i = 0; i < arr.length; i++) {
			double c=Math.pow(10, b-1);
			long IN;   
			IN=Integer.parseInt(arr[i]);
			System.out.printf("%.0f",IN*c);
			System.out.println();
			b--;
		}
	}





}


