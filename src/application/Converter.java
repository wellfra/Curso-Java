package application;

import java.util.Locale;
import java.util.Scanner;
import Util.CurrencyConverter;

public class Converter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a cotação do dolar: ");
		double c = sc.nextDouble();
		System.out.println("Qual a quntidade de dolares: ");
		double q = sc.nextDouble();
		double v = CurrencyConverter.converte(c, q);
		
		System.out.println("Valor do pagamento: " + v);
		
		sc.close();
		

	}

}
