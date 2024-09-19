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

	public Fraction Add(Fraction other) {
		BigInteger minJointMul = (this.denominator.multiply(other.denominator)).divide(this.denominator.gcd(other.denominator));
		Fraction tmp = new Fraction(BigInteger.valueOf(1), BigInteger.valueOf(1));
		this.numerator = this.numerator.multiply(minJointMul.divide(this.denominator));
		other.numerator = other.numerator.multiply(minJointMul.divide(other.denominator));
		tmp.numerator = this.numerator.add(other.numerator);
		tmp.denominator = minJointMul;
		return tmp;
	}
	
	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}
}
