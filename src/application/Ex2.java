package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosFunc;

public class Ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		DadosFunc func = new DadosFunc();
		
		System.out.print("Name: ");
		func.name = sc.nextLine();
		System.out.print("Gross salary: ");
		func.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		func.tax = sc.nextDouble();
		System.out.println();
		System.out.println("Employee: " + func);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		func.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + func);
		sc.close();

	}

}
