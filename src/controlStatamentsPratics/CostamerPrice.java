package controlStatamentsPratics;

import java.util.Scanner;

public class CostamerPrice {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the coustamer");
		String coustamertype = sc.next();
		System.out.println("enter the quality");
		int  quality = Integer. parseInt(sc.next());
		System.out.println("enter the price");
		double  price =  Double. parseDouble(sc.next());
		double totalprice = quality*price;
		double  discount= 0.0;
		if( coustamertype .equals("premium")) {
		discount = totalprice*10/100;
		totalprice = totalprice*discount;
		System.out.println("coustamerType:"+coustamertype);
		System.out.println("discount:"+discount);
		System.out.println("price:"+price);

	}

}}
