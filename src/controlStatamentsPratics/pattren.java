package controlStatamentsPratics;

import java.util.Scanner;

public class pattren {
	private static void printpattern(int n) {
		for(int i=1;i<n;i++) {
		for(int j=1;j<=i;j++) {
			for(int k=n;k<=1;k--) {
				for(int l=n;l<=k;l--) {
				
	
			System.out.print(" *  ");
		}
			System.out.println();
		}
		
	
		
	

		
		}
		System.out.println();
	}
		
	}
		
		
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
printpattern(n);
	}

}
