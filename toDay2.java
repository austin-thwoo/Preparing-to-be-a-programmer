package Main.dayByday2;

import java.util.Scanner;

public class toDay2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		String[] arr = str.split(":");
				System.out.println(Integer.parseInt(arr[1]));
		
	}
}
