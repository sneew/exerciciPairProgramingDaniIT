package itFloristeriaJava;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<FlowerShop> flowerShops = new ArrayList();
		FlowerShop fs = new FlowerShop ("FloristeriaFernandez");
		flowerShops.add(fs);
		Tree t = new Tree (15 , 20);
		Flower f = new Flower ("blue", 15);
		Decoration d = new Decoration ("Wood", 20);
		fs.getTrees().add(t);
		fs.getFlowers().add(f);
		fs.getDecorations().add(d);
		
		
		//llamamos a función crear floristería
		createFlowerShop(flowerShops);
		
		//llamamos a función añadir arbol
		addTree(flowerShops);
		
		// llamamos a funcion añadir decoración
		addDecoration(flowerShops);
		
		// llamamos a funcion producto
		addFlower(flowerShops);
		
		// llamamos a funcion stock
		showStock(flowerShops);
	}

	private static void addFlower(List<FlowerShop> flowerShops) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce the colour of the flower");
			String c = sc.next();
			System.out.println("Introduce the price of the flower");
			double p = sc.nextDouble();
			Flower f = new Flower(c, p);
			
			System.out.println("Write the name of the flowerShop to add the flower" + flowerShops.toString() +"?");
			String name = sc.next();
			for (FlowerShop fs : flowerShops) {
				if (name.equals(fs.getName())) {
					fs.getFlowers().add(f);
				}
			}
		}

	private static void showStock(List<FlowerShop> floristerias) {
		//System.out.println(floristerias.toString());
		
		for (FlowerShop fs : floristerias) {
			System.out.println("FlowerShop: " + fs.getName() + "\n");
			System.out.println("Trees: " + fs.getTrees() + "\n");
			System.out.println("Flower: " + fs.getFlowers() + "\n");
			System.out.println("Decorations: " + fs.getDecorations() + "\n");
			
			
		}
		
	}

	private static void addDecoration(List<FlowerShop> flowerShops) {
	
	
		int material;
		String product="";
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert material : 1-Wood 2-Plastic");
		
		material = sc.nextInt();
		switch (material) {
		case 1:
			System.out.println("Wood");
			product="wood";
			break;
		case 2:
			System.out.println("Plastic");
			product="plastic";
			break;


		default:
			System.out.println("Men!! Just you have two posibilities!!");
			break;
		}
		
		double price;
		System.out.println("Introduce the price of the decoration");
		price = sc.nextDouble();
		Decoration dec= new Decoration(product,price);
		System.out.println("Write the name of the flowerShop to add the tree" + flowerShops.toString() + "?");
		String name = sc.next();
		for (FlowerShop fs : flowerShops) {
			if (name.equals(fs.getName())) {
				fs.getDecorations().add(dec);
			}
		}
		
		
	}
	
	   

	private static void addTree(List<FlowerShop> flowerShops) {
		Scanner sc = new Scanner(System.in);
		double h, p;
		String name;
		Tree t;
		System.out.println("Introduce the height of the tree");
		h = sc.nextDouble();
		System.out.println("Introduce the price of the tree");
		p = sc.nextDouble();
		t = new Tree(h, p);
		
		System.out.println("Write the name of the flowerShop to add the tree" + flowerShops.toString() +"?");
		name = sc.next();
		for (FlowerShop fs : flowerShops) {
			if (name.equals(fs.getName())) {
				fs.getTrees().add(t);
			}
		}
	}

	private static void createFlowerShop(List<FlowerShop> flowerShops) {
		Scanner sc = new Scanner(System.in);
		String name;
		FlowerShop flowershop;

		System.out.println("Insert the company name: ");

		name = sc.next();
		flowershop = new FlowerShop(name);
		flowerShops.add(flowershop);	
	}
	

}
