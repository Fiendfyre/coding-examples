package prime;

public class PrimeVerifier {

	public boolean isPrime(long input) {
		if(input ==0 || input ==1 || input == -1){
			return false;
		}
		for (int fac1 = 2; fac1 <= Math.sqrt(input); fac1++) {
			if (input % fac1 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PrimeVerifier pv = new PrimeVerifier();
		System.out.println(pv.isPrime(1729));
	}
}
