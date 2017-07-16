package MathsLogic;

import java.util.Random;

public class PrimalityTest1 {
	
	static boolean checkPrimality(int x){
		for(int i=2; i<=x/2; ++i){
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
	}
	//Space Complexity - O(1)
	//Time Complexity - N

	public static void main(String[] args) {
//		int x = Integer.parseInt(args[0]);
		Random rand = new Random();
		int x = rand.nextInt(10) + 2;
		boolean result = checkPrimality(x);
		System.out.println(x + " - " + result);

	}

}
