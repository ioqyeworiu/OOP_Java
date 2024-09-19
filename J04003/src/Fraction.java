import java.math.BigInteger;

public class Fraction {
	private BigInteger numerator, denominator;

	public Fraction(BigInteger numerator, BigInteger denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public void simplize() {
		BigInteger ucln = numerator.gcd(denominator);
		numerator = numerator.divide(ucln);
		denominator = denominator.divide(ucln);
	}

	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}
}
