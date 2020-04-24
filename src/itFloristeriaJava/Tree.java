package itFloristeriaJava;

public class Tree extends Product {
	private double height;

	public Tree(double height, double price) {
		super(price);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Tree height = " + height + " " + super.toString();
	}

	
	
	

}
