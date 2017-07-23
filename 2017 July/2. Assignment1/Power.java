package Assignment1;

import java.util.Random;

public class Power {
	static int calculatePower(int x, int n){
		int result = x;
		for(int i = 1; i < n; i++){
			result = result*x;
		}
		return result;
	}
	//Time Complexity - O(N)
	//Space Complexity - O(1) 

	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(3)+1;
		int n = rand.nextInt(3)+1;
		int result = calculatePower(x,n);
		System.out.println(x + ","+ n + " - " + result);
	}

}
