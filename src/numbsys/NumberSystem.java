package numbsys;

import java.util.Stack;

public class NumberSystem {

	public void convertTobase(long number, long base) {
		Stack<Long> r = new Stack<Long>();
		if(number<=0){
			System.out.print("0");
			return;
		}
		while (number > 0) {
			r.add(number % base);
			number = number / base;
		}
		while (!r.isEmpty()) {
			System.out.print(r.pop());
		}
	}
	
	public void convertFromBase(long number, long base) {
		int length = String.valueOf(number).length();
		long r = 0;
		for(int i =0; i < length;){
			r = (long) (r + (number%10) * (Math.pow(base, i)));
			number = number / 10;
			i++;
		}
		System.out.println(r);
	}

	public static void main(String[] args) {
		NumberSystem system = new NumberSystem();
		long binaryInput = 1111101;
		long decimalInput=125;
		system.convertFromBase(binaryInput,2);
		system.convertTobase(decimalInput,3);
		
	}
}
