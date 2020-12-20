package Main.dayByday4;

import java.util.Scanner;

public class toDay4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String[] arr=str.split(" ");
		int A =Integer.parseInt(arr[0]);
		int B =Integer.parseInt(arr[1]);
			System.out.print(A % B);
		}
	}






