package controlStatamentsPratics;

import java.util.Scanner;

public class exampleforIfelse {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("enter a number");
int p = sc.nextInt();
if(1<=p&& p<=300) {
	double k =p *2.75;
System.out.println(k);

	}
else if(301<=p&&p<=500) {
	double m =(p-300)*4.87+(300*2.75);
	System.out.println("value:"+m);
	
}
else if(p>500) {
	double c =(p-500)*6.90+(300*2.75)+(200*4.87);
	System.out.println("vaue:"+c);
	
}
else {
	System.out.println("enter invalid credensitial");
}
	
}

}
