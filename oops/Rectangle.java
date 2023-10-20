package oops;

public class Rectangle implements Shape{

	private Double length;
	private Double breadth;
	
	Rectangle(Double length, Double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public void size() {
		System.out.println("Size of Rectangle: "+ length * breadth);
	}

	@Override
	public void draw() {		
		System.out.println("Drawing a Rectangle");
	}

}
