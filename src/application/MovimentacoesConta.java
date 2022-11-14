package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;

public class MovimentacoesConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		ContaCorrente conta;
		
		System.out.println("Enter account number: ");
		int numeroConta = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		
		System.out.println("Is there a initial deposit(y/n): ");
		char option = sc.next().charAt(0);
		
		if (option == 'y') {
			System.out.println("Enter initial value: ");
			double saldoConta = sc.nextDouble();
			
			conta = new ContaCorrente(numeroConta, nomeTitular, saldoConta);
		}
		else {
			conta = new ContaCorrente(numeroConta, nomeTitular);
			System.out.println("Account data: ");
			System.out.printf("Account: %d, Holder: %s, balance: 0.0", numeroConta, nomeTitular);
		}
		
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		
		double deposito = sc.nextDouble();
		conta.addSaldo(deposito);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		
		double valor = sc.nextDouble();
		conta.removeSaldo(valor);
		System.out.println("Updated account data:");
		System.out.println(conta);

		
		sc.close();
	}

}
