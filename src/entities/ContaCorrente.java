package entities;

public class ContaCorrente {
	
	private int numeroConta;
	private String nomeTitular;
	private double saldoConta;
	
	public ContaCorrente(int numeroConta, String nomeTitular, double saldoConta) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		addSaldo(saldoConta);
	}
	
	public ContaCorrente(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldoConta() {
		return saldoConta;
	}
	
	
	public void addSaldo(double valor) {
		saldoConta += valor;
	}
	
	public void removeSaldo(double valor) {
		saldoConta -= valor + 5.00;
	}
	
	public String toString() {
		return "Número da conta "
				+ numeroConta
				+ ", Titular da conta: "
				+ nomeTitular
				+ ", Saldo: $"
				+ String.format("%.2f", saldoConta);
	}
	
}

