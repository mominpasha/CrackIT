package MathsLogic;

import java.util.Random;

public class SumofDigits {

	static int findSumofDigits(int n) {
		if (n <= 0)
			return 0;
		int res = 0;
//		int remainder = 0;
		/*while (n >= 1) {
			remainder = n % 10;
			res = res + remainder;
			n = n / 10;
		}*/
		for(res=0;n >= 1;res+=n%10,n/=10);
		return res;
	}
	//Space Complexity - O(1)
	//Time Complexity - log N

	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(1000);
		int result = findSumofDigits(x);
		System.out.println(x + " - " + result);
	}

}
