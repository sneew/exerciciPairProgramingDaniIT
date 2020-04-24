package itFloristeriaJava;

public class Decoration extends Product {
	
	private String material;

	public Decoration(String material, double price) {
		super(price);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Decoration material = " + material + " " + super.toString();
	}
	
	

	
	
	
}
