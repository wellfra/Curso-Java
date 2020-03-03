package Util;

public class CurrencyConverter {
	
	public static final double IOF = 1.06;
	
	public static double converte(double price, double quantity) {
		return price * quantity * IOF;
	}

}
