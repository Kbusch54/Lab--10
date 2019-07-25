package co.grandcircus;

import java.util.Scanner;

public class CircleApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String cont;
		double x;
		Circle c = new Circle(1);
		
		System.out.println("Welcome to the Circle Tester");
		do {
		System.out.print("Enter radius:");
		x = scan.nextDouble();
		scan.nextLine();
		if(x<0) {
			System.out.println("error: enter a number above zero");
			cont ="y";
		}else {
		c.setRadius(x);
		
		System.out.println(c.getRadius());
		System.out.println(c.getFormattedCircumference());
		System.out.println(c.getFormattedArea());
		System.out.println("Continue? (y/n):");
		cont = scan.next();}
		}while(cont.equalsIgnoreCase("y"));

		System.out.println("GoodBye!");

		
	scan.close();	
	}

}
