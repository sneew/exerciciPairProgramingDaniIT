package itFloristeriaJava;

public abstract class Product {
	private double price;

	public Product(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return " Product price = " + price;
	}
	
	
}
