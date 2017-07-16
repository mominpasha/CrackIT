package MathsLogic;

import java.util.Random;

public class Factorial {
	static int findFactorial(int n){
		if(n<=0) return 1;
		int result = 1;
		for(int i = n; i >= 1; i--)
			result = result * i;
		return result;
	}
	//Space Complexity - O(1)
	//Time Complexity - N

	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(4);
		int result = findFactorial(x);
		System.out.println(x + " - " + result);
	}

}
