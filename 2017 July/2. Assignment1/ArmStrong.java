package Assignment1;

import java.util.Random;

public class ArmStrong {

	static boolean checkArmstrong(int n) {
		if(n<0) return false;
		int digit = 0;
		int given = n;
		int sum = 0;
		while (n > 0) {
			digit = n % 10;
			sum = sum + (digit * digit * digit);
			n = n / 10;
		}
		if(given == sum) return true;
		else return false;
	}
	//Time Complexity - log N
	//Space Complexity - O(1)  

	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(10);
		boolean result = checkArmstrong(x);
		System.out.println(x + " - " + result);
	}

}
