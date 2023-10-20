package oops;

import java.util.Scanner;

public class LooseCoupling {
	public static void main(String[] args) {
		
		int choice = 0;
		char repeat = 'y' ;
		Shape shape;
		Scanner sc = new Scanner(System.in);
		
		while(repeat == 'y') {		
			System.out.println("1. Square");
			System.out.println("2. Circle");
			System.out.println("3. Rectangle");
			System.out.println("choose a shape from 1, 2 & 3 :");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Enter side of square:");				
					Double side = sc.nextDouble();
					shape = new Square(side);
					shape.draw();
					shape.size();
					break;		
				case 2:
					System.out.println("Enter radius of circle:");				
					Double radius = sc.nextDouble();
					shape = new Circle(radius);
					shape.draw();
					shape.size();
					break;		
				case 3:
					System.out.println("Enter length of Rectangle:");				
					Double length = sc.nextDouble();
					System.out.println("Enter breadth of Rectangle:");				
					Double breadth = sc.nextDouble();
					shape = new Rectangle(length,breadth);
					shape.draw();
					shape.size();
					break;		
				default:
					System.out.println("The choice was invalid!");
					
			}
			System.out.println("Do you want to continue y/n:");
			repeat = sc.next().charAt(0);
		}
		System.out.println("-----------Terminated-------------");
	}
}
