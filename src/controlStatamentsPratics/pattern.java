package controlStatamentsPratics;

import java.util.Scanner;

public class pattern {
	private static void numberprint(int x) {
		for(int i =1;i<=x;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int x = sc.nextInt();
numberprint(x);
	}

}
 