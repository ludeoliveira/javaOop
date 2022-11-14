package entities;

public class DadosFunc {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percent) {
		grossSalary  += grossSalary * percent / 100.0; 
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}

}
