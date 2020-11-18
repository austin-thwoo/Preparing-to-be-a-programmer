package Main.dayByday1;

import java.util.Scanner;

public class toDay1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String[] sarr= str.split("-");
		int X = Integer.parseInt(sarr[0]);
		int Y = Integer.parseInt(sarr[1]);
		System.out.printf("%06d%d",X,Y);
		
	}
	
		
	
}
