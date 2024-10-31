package controlStatamentsPratics;

import java.util.Scanner;

public class loginaccexes {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the user name");
		String  userName  =sc.nextLine();
		System.out.println("enter the password");
		String password =sc.nextLine();
		if( userName.equals("ashok it")&&password.equals("ashit@123")) {
			
			System.out.println("login succes" );
		}
		else {
			System.out.println("login failed");
		}

	}

}
