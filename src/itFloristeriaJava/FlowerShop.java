package itFloristeriaJava;

import java.util.ArrayList;
import java.util.List;

public class FlowerShop {

	private String name;
	private List<Flower>Flowers=new ArrayList<Flower>();
	private List<Tree>Trees = new ArrayList<Tree>();
	private List<Decoration>Decorations= new ArrayList<Decoration>();
	
	public FlowerShop(String name) {
		this.name=name;
	}

	public FlowerShop(String name, List<Flower> flowers, List<Tree> trees, List<Decoration> decorations) {
		super();
		this.name = name;
		Flowers = flowers;
		Trees = trees;
		Decorations = decorations;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Flower> getFlowers() {
		return Flowers;
	}

	public void setFlowers(List<Flower> flowers) {
		Flowers = flowers;
	}

	public List<Tree> getTrees() {
		return Trees;
	}

	public void setTrees(List<Tree> trees) {
		Trees = trees;
	}

	public List<Decoration> getDecorations() {
		return Decorations;
	}

	public void setDecorations(List<Decoration> decorations) {
		Decorations = decorations;
	}

	@Override
	public String toString() {
		return "FlowerShop name=" + name;
	}
	
}
                          