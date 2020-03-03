package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program_Stock {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		Product product = new Product();
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data" + product);	
		
		System.out.println();
		System.out.print("Enter the numnber of products to be added in Stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Product data: " + product);	
		
		System.out.println();
		System.out.print("Enter the numnber of products to be removed in Stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Product data: " + product);
		
		sc.close();

	}

}
