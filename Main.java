package codup;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	boolean result = true;
	

	
	while(true) {
	int x =sc.nextInt();
	int A=x/10;
	int B=x-(A*10);
	
	
	if(x%(A+B)==0) {result=true;
	System.out.println(A+"+"+B+"="+(A+B)+"-->"+x+"/"+(A+B)+"=="+"0"+"--->"+result);
	}
	
	else if(x%(A+B)!=0) {result=false;
	System.out.println(A+"+"+B+"="+(A+B)+"-->"+x+"/"+(A+B)+"!="+"0"+"--->"+result);
	}
	}
	
	
}
}
