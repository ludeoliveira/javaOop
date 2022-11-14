package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ConvertCurrency {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");

		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		
		double dollarsToBuy = sc.nextDouble();

		double amount = CurrencyConverter.AmountInReais(dollarsToBuy, dollarPrice);
		
		System.out.printf("Amount to be paid in reais: %.2f", amount);

	}
}