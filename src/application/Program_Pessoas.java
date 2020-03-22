package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;
import entities.PessoasFisicas;
import entities.PessoasJuridicas;

public class Program_Pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoas> list = new ArrayList<>();
		Double sum = 0.00;

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
	
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if (tipo == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new PessoasFisicas(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new PessoasJuridicas(name, anualIncome, numberEmployees));
			}
		}
		
		System.out.println("TAXES PAID: ");
		for(Pessoas x : list) {
			System.out.println(x.getNome() + ": $ " + String.format("%.2f", x.imposto()));
			sum += x.imposto();
		}

		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();

	}

}
