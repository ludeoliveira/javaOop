package util;

public class CurrencyConverter {
	public static final double IOF = 1.06;
	
	public static final double AmountInReais(double dollarsToBuy, double dollarPrice) {
		return dollarsToBuy * dollarPrice * IOF;
	}

}
