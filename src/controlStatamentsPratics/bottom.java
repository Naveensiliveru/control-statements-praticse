package controlStatamentsPratics;

import java.util.Scanner;

public class bottom {
	private static void bottom(int n) {
		for(int i =n;i>=1;i--) {
			for(int j =1;j<=i;j++) {
				System.out.print("*"+"");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row");
		int n = sc.nextInt();
		bottom(n);

	}

}
