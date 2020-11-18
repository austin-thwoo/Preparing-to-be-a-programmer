package Main.dayByday4;

import java.util.Scanner;

public class toDay4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String X = sc.nextLine();
		String[] arr= X.split("\\."); 
		System.out.printf("%s\n%s",arr[0], arr[1]);
		
		
	}

}
