import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Fraction frac1 = new Fraction(BigInteger.valueOf(input.nextLong()), BigInteger.valueOf(input.nextLong()));
		Fraction frac2 = new Fraction(BigInteger.valueOf(input.nextLong()), BigInteger.valueOf(input.nextLong()));
		Fraction frac3 = new Fraction(BigInteger.valueOf(1), BigInteger.valueOf(1));

		frac1.simplize();
		frac2.simplize();
		
		frac3 = frac1.Add(frac2);
		frac3.simplize();
		System.out.println(frac3.toString());
	}
}
