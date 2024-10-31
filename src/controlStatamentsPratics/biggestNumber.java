package controlStatamentsPratics;

import java.util.Scanner;

public class biggestNumber {
		public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the frist number");
		int k = Integer.parseInt(sc.nextLine());
		System.out.println("enter the second number");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("enter the third number");
		int c = Integer.parseInt(sc.nextLine());
		      if(k>b&&k>c) {
			System.out.println("k is biggest number :");
		}
		
	        else if (b>c) {
			
			System.out.println(" b isbiggest number is:");
	        }
		else {
				
			System.out.println(" c isbiggest :" );
			}
		      }}