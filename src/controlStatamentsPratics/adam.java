package controlStatamentsPratics;

import java.util.Scanner;

public class adam {
	private static void  isAdam ( int n) {
		 int square =  n*n;
		 int remainder =0;
		 int reverse =0;
		 while(n>0) {		 
		remainder =n%10;		
 reverse= reverse*10+n%10;
		 n=n/10;
		 int k =reverse;
		 while(k>0) {
			 int square2 = k*k;
			 remainder=k%10;
			 reverse = reverse*10+k%10;
			 k=k/10;
		 }
			   if(n*n==k*k) {
			 System.out.println("it is adam number"+square);
		 }
			   else {
				   System.out.println("it is not adam number");
			   }
		 
		 } }
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
System.out.println("enter the  number");
 int k =  s.nextInt();
 isAdam(k);
 
	}

}
