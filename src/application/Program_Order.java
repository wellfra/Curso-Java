package application;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order1;
import entities.OrderItem;
import entities.Procut2;
import entities.enums.OrderStatus;

public class Program_Order {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter Client Data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birth = sdf.parse(sc.nextLine());
		Client client = new Client(name, email, birth);
				
		System.out.println("Enter order Data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Order1 order = new Order1(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for(int i=1; i<n; i++) {
			System.out.println("Enter #" + i + " item data:");
			
			System.out.print("Product name: ");
			String productname = sc.nextLine();
			System.out.println("Product price: ");
			double productprice = sc.nextDouble();
			Procut2 produto = new Procut2(productname, productprice); 
			
			
			System.out.println("Product quantity: ");
			int productquantity = sc.nextInt();
			
			OrderItem item = new OrderItem(productquantity, productprice, produto);
			order.addItem(item);
		}
		
		System.out.println();

		System.out.println("ORDER SUMMARY:");

		System.out.println(order);
		
		sc.close();

	}

}
