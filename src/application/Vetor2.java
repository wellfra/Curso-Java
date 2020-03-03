package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Procut2;

public class Vetor2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Procut2[] vect = new Procut2[n];

		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Procut2(name, price);
		}
		
		double sum = 0.00;
		
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avr = sum / vect.length;
		
		System.out.printf("AVERAGE price: " + avr);

		sc.close();
	}

}
