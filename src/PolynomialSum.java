public class PolynomialSum {

	public static void main(String[] args) {
		String input1 = "3x^3-2x^2+3";
		String input2 = "5x^7+6x^3+2";
		System.out.println(input1.split("(?=[-+])|(?<=[-+])")[2]);

	}

}
