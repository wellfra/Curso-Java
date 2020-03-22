package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product3;
import entities.UsedProduct;

public class Program_Product {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product3> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		System.out.println();
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if (tipo == 'i') {
				System.out.print("Customs fee: ");
				Double customsfee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsfee));
			} else if (tipo == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureDate));
			} else {
				list.add(new Product3(name, price));
			}
		}
		System.out.println("PRICE TAGS: ");
		for (Product3 x: list) {
			System.out.println(x.priceTag());
		}
		
		sc.close();

	}

}
