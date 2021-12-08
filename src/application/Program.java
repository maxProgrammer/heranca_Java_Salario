package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		List<Employee> emp1 = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Employee #%d data:%n", i + 1);
			System.out.printf("Outsourced (y/n)? ");
			char c  = sc.next().charAt(0);
			if(c == 'n') {
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valueperhour = sc.nextDouble();
				emp1.add(new Employee(name,hours,valueperhour)) ;
			}
			else {
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valueperhour = sc.nextDouble();
				System.out.print("Addicional charge: ");
				double adCharge = sc.nextDouble();
				emp1.add(new OutsourceEmployee(name,hours,valueperhour,adCharge)) ;
			}
			
		}
		
		System.out.println("\nPAYMENTS:");
		for(Employee e : emp1) {
			System.out.println(e.toString());
		}
				
		sc.close();

	}

}
