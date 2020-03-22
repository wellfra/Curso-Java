package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program_Employee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n) ? :");
			char out = sc.next().charAt(0);
			System.out.print("Name :");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours :");
			int hour = sc.nextInt();
			System.out.print("Valeu Per Hours :");
			Double valuePerHour = sc.nextDouble();
			if (out == 'y') {
				System.out.println("Additional Charge: ");
				Double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hour, valuePerHour, additionalCharge);
				list.add(emp);
			} else {
				Employee emp = new Employee(name, hour, valuePerHour);
				list.add(emp);
			}

		}

		System.out.println();
		System.out.println("Payments:");

		for (Employee x : list) {
			System.out.println(x.getName() + " - $ " + String.format("%2f", x.payment()));
		}

		sc.close();

	}

}
