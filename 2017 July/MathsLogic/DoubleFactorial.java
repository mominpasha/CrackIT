package MathsLogic;

import java.util.Random;

public class DoubleFactorial {

	static int findDoubleFactorial(int n){
		if(n==0) return 1;
		int res = 1;
		for(int i= n; i >= 1; i=i-2)
		{
			res =  res * i;
		}
		return res;
	}
	//Space Complexity - O(1)
	//Time Complexity - N
	
	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(10);
		int result = findDoubleFactorial(x);
		System.out.println(x + " - " + result);

	}

}
