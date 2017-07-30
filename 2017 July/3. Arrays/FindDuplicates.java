package Arrays;

import java.util.Random;

public class FindDuplicates {

	//Adhoc Solution
	static boolean findDuplicates(int[] a){
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]==a[j]){
					return true;
				}
			}
		}
		return false;
	}
	//Time Complexity: O(n^2)
	//Space Complexity: O(1)
	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		int[] a = new int[size];
		//filling the array
		Random rand = new Random();
		for(int i=0; i<a.length; i++){
			a[i]=rand.nextInt(10);
		}
		//priting the array
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");				
		}
		System.out.println("");
		boolean result = findDuplicates(a);
		System.out.println("Result = "+result);
	}

}
