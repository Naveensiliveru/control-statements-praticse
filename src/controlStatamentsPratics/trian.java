package controlStatamentsPratics;

import java.util.Scanner;

public class trian {
	private static void trianglePrint(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("");
			}
				for(int k=1;k<=i;k++) {
			System.out.print("*"+"");	
		}
		System.out.println();
			
		}
			}
				
			
			
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
int n = sc.nextInt();
trianglePrint(n);
	}

}
