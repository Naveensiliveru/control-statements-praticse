package controlStatamentsPratics;

import java.util.Scanner;

public class brandShoes {

	public static void main(String[] args) {
		Scanner  sc =new Scanner (System.in);
		System.out.println("enter the brand name");
		String  brand = sc.next();
		System.out.println("enter the shoetype");
		String shoestype = sc.nextLine();
		System.out.println("enter price");
		double price = Double.parseDouble(sc.nextLine());  
		double gst =0.0;
		
		if (shoestype.equals("leather")) {
			gst =price+gst;
		}
		System.out.println("brand:"+brand);
		System.out.println("shoestype:"+shoestype);
		System.out.println("gst:"+gst);
		System.out.println("price:"+price); 

	}

}
