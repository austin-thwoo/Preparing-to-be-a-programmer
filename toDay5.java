package Main.dayByday5;

import java.util.Scanner;

public class toDay5 {
	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		
		String X = scanner.next();
		
		String day[] = X.split("\\.");
		
		
				
		int to=Integer.parseInt(day[0]);
		int too=Integer.parseInt(day[1]);
		int tooo=Integer.parseInt(day[2]);
		System.out.printf("%04d.%02d.%02d", to,too,tooo);
		/*
		System.out.printf
		("%04d" "%2d" "%02d", X);
		*/
		
		
	}
}
