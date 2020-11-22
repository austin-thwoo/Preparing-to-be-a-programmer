package Main.main;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
//	   0번
	  Scanner sc = new Scanner(System.in);
	  int[][] pan= new int [20][20];
	  int il = 1;
	  int young=0;
	  int x=sc.nextInt();
	  int y=sc.nextInt();


//	  1번
	  for (int i = 0; i <= 18; i++) {
		for (int j = 0; j <= 18; j++) {
			pan[i][j]=sc.nextInt();
		}
	}
	 
	 int A=sc.nextInt();
//	 가로줄바꾸기
	 for (int i = 1; i <= A; i++) {
			for (int j = 1; j < 18; j++) {
				
				if (pan[x][j]==1) {
					pan[x][j]=0;
				}else {
					pan[x][j]=1;
				}for (int j2 = 0; j2 < pan.length; j2++) {
					if (pan[x][j2]==1) {
						pan[x][j2]=0;
					}else {
						pan[x][j2]=1;
					}
				}
			}
		}
//	 세로줄바꾸기

	
//	  2번
	  for (int i = 0; i < pan.length-1; i++) {
		for (int j = 0; j < pan.length-1; j++) {
			System.out.print(pan[j][i]+" ");
		}System.out.println();
	}
//	for (int i = 0; i < ber; i++) {
//		int A=sc.nextInt();
//		int B=sc.nextInt();
//		if (pan [B][A]==0) {
//			pan  [B][A]=il;
//		}else {pan  [B][A]=young;}
//	}
	
   }
   
}
	
	
			
		
	
	
		 	 
//	 System.out.println();
//	for (int i = 0; i < pan.length/2+1; i++) {
//		for (int j = 0; j < pan.length/2+1; j++) {
//			
//			System.out.print(pan[(i)][(j)]+ " ");
//		}System.out.println();
//	}
	 
	  
  
/*    
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
2
10 10
12 12
      */

      
   

