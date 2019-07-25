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
	
		x =Validator.getDouble(scan, "Enter radius:");
		
		
		c.setRadius(x);
		
		System.out.println(c.getRadius());
		System.out.println(c.getFormattedCircumference());
		System.out.println(c.getFormattedArea());
		
		cont = Validator.getString(scan, "Continue? (y/n):");
		}while(cont.equalsIgnoreCase("y"));

		System.out.println("GoodBye!");

		
	scan.close();	
	}

}
