package oops;

public class Circle implements Shape{

	private Double radius;
	
	Circle(Double radius){
		this.radius = radius;
	}
	
	@Override
	public void size() {
		System.out.println("Size of Circle: "+ 3.14 * radius * radius);
	}

	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}

}
