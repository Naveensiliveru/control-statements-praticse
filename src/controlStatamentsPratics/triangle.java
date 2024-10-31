package controlStatamentsPratics;

import java.util.Scanner;

public class triangle {
	private static void printpattren(int x) {
		for(int i =0;i<=x;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(""+"*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt();
		 printpattren(x);

	}

}
