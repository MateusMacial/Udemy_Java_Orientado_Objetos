package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;

	public static double dollarConverted(double dollarPrice, double dollarsBought) {
		return (dollarsBought * dollarPrice) * (1.0 + IOF);
	}

}
