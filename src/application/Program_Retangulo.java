package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class Program_Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo rect = new Retangulo();
				
		System.out.println("Entre com a largura e altura:");
		rect.largura = sc.nextDouble();
		rect.altura  = sc.nextDouble();
		
		System.out.printf("AREA = %2.f%n", rect.area());
		System.out.printf("PERIMETRO = %2.f%n", rect.perimetro());
		System.out.printf("DIAGONAL = %2.f%n", rect.diagonal());		
		sc.close();

	}

}
