package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Program_Reserva {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Quartos[] vect = new Quartos[10];
		int room;
		
		System.out.println("How many room will be rented? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.printf("RENT #%d%n", (i + 1) );
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.println("Room: ");
			room = sc.nextInt();
			
			vect[room] = new Quartos(name, email, room);
		}
		
		System.out.println("Busy Rooms:,");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);		
			}
		}
		sc.close();
		

	}

}
