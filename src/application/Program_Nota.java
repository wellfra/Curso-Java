package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Estudante;


public class Program_Nota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante estud = new Estudante();
		double miss = 0.00;
		
		System.out.println("Nome do Aluno: ");
		estud.nome = sc.nextLine();
		
		System.out.println("Nota 1� trimestre: ");
		do {
			estud.t1 = sc.nextDouble();
			if (estud.t1 > 30.00) {
				System.out.println(" Nota m�xima 1� tirmestre = 30.00, digite novamente");
			}
		} while (estud.t1 > 30.00);
		
		System.out.println("Nota 2� trimestre: ");
		do {
			estud.t2 = sc.nextDouble();
			if (estud.t2 > 35.00) {
				System.out.println(" Nota m�xima 2� tirmestre = 50.00, digite novamente");
			}
		} while (estud.t2 > 35.00);

		System.out.println("Nota 3� trimestre: ");
		do {
			estud.t3 = sc.nextDouble();
			if (estud.t3 > 35.00) {
				System.out.println(" Nota m�xima 3� tirmestre = 35.00, digite novamente");
			}
		} while (estud.t3 > 35.00);
		
		System.out.printf("Final Grade = %.2f%n", estud.notaFinal());
		
		if (estud.notaFinal() >= 60.00) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			miss = 60.00 - estud.notaFinal();
			System.out.println("MISSING " + miss + " POINTS");
		}
		
		
		sc.close();
		

	}

}
