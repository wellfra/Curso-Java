package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Bom dia");
		System.out.println("Entre com as medidas do triangulo A:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do triangulo A:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areax = x.area();
		double areay = y.area();
				
		System.out.printf("área do triangulo x: %.4f%n", areax);
		System.out.printf("área do triangulo y: %.4f%n", areay);
		
		if (areax > areay) {
			System.out.println("area x é a maior");
		}
		else
			System.out.println("area y é a maior");
		
		sc.close();
	}

}
