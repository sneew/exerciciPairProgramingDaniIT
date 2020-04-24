package itFloristeriaJava;

public class Flower extends Product{
	
	private String color;

	public Flower(String color, double price) {
		super(price);
		this.color = color;
	}

	
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	@Override
	public String toString() {
		return "Flower color = " + color + " "+ super.toString();
	}	

}
