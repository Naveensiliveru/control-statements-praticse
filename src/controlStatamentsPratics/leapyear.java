package controlStatamentsPratics;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the  number");
		int k = sc .nextInt();
		if(k%4==0) {
			System.out.println(" it is leap year");
		}



		else if(k%4==0&&k%100==0) {
			System.out.println("it is aleap year");


		}
		else{
			System.out.println("not leap year");



		}
	}}	


