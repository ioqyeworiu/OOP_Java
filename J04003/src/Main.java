import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Fraction frac = new Fraction(BigInteger.valueOf(input.nextLong()), BigInteger.valueOf(input.nextLong()));
		frac.simplize();
		System.out.println(frac.toString());
	}
}
