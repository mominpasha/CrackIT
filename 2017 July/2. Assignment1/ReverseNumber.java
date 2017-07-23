package Assignment1;

import java.util.Random;

public class ReverseNumber {

	static void printReverse(int n) {
		if (n < 0)
			return;
		int given = n;
		int reverse = 0;
		int digit = 0;
		while (n > 0) {
			digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}
		System.out.println(given + " - " + reverse);
	}
	//Time Complexity: O(log N)
	//Space Complexity: O(1)

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(1000);
		printReverse(n);
	}

}
