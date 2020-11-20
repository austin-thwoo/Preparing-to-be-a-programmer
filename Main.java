package main.main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str=sc.next();
String[] arr = str.split(":");
		System.out.println(Integer.parseInt(arr[1]));
}
}





//1 1 1 1 1 1 1 1 1 1
//1 0 0 1 0 0 0 0 0 1
//1 0 0 1 1 1 0 0 0 1
//1 0 0 0 0 0 0 0 0 1
//1 0 1 1 0 0 0 1 0 1
//1 0 0 0 0 1 0 1 1 1
//1 0 0 0 0 1 0 1 0 1
//1 0 0 0 0 1 0 0 0 1
//1 0 0 0 0 0 0 0 0 1
//1 1 1 1 1 1 1 1 1 1