package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Empregado;

public class Program_Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empregado empregado = new Empregado();
		double perc = 0;
		
		System.out.println("Name: ");
		empregado.nome = sc.nextLine();
		System.out.println("Gross Salary: ");
		empregado.salario = sc.nextDouble();
		System.out.println("Tax: ");
		empregado.taxa = sc.nextDouble();
		
		System.out.println("Employee : " + empregado.Tostring());
		
		
		System.out.println("Wich percentege to increase salary: ");
		perc = sc.nextDouble();
		empregado.incremento(perc);		
		
		
		System.out.println("Update : " + empregado.Tostring());
		
		
		sc.close();

	}

}
