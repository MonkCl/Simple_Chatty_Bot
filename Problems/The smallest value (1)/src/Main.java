import java.math.BigInteger;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger result = BigInteger.ONE;
		BigInteger n = BigInteger.ONE;

		while (a.compareTo(result) > 0) {
			result = result.multiply(n);
			n = n.add(BigInteger.ONE);
		}
		System.out.println(n.subtract(BigInteger.ONE));
	}
}