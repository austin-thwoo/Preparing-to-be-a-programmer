package main.main;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str=sc.next();
str=str.replace(".", "-");
String[] arr = str.split("-");
		String A=arr[2];
		String B=arr[1];
		String C=arr[0];
		
		System.out.printf("%s-%s-%s",A,B,C);
		
}
}

