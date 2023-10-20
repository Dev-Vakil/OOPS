package oops;

public class Square implements Shape{

	private Double side = 0.0;
	
	Square(Double side){
		this.side = side;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a Square");
	}

	@Override
	public void size() {
		System.out.println("Size of Square: "+ side*side);
	}

}
