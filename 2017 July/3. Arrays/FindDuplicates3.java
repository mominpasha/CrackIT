package Arrays;

import java.util.HashSet;
import java.util.Random;

public class FindDuplicates3 {

	public static boolean findDuplicates3(int[] a){
		HashSet<Integer> hset = new HashSet<Integer>();
		boolean res = false;
		int length =  a.length;
		for (int i = 0; i < length; i++){
			res = hset.contains(a[i]);
			if(res){
				return true;
			}
			hset.add(a[i]);
		}
		return false;
	}
	//Time Complexity - O(n)
	//Space Complexity - O(n)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		boolean result = findDuplicates3(a);
		System.out.println("Result = "+result);

	}

}
