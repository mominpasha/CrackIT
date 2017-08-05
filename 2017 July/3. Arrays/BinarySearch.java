package Arrays;

import java.util.Random;
import java.util.Arrays;

public class BinarySearch {
	static boolean findElement(int[] a, int x) {
		Arrays.sort(a);//nlogn
		//printing the array
				for(int i=0; i<a.length; i++){
					System.out.print(a[i]+" ");				
				}
		boolean result = auxFindElement(a, x, 0, a.length - 1);//logn
		return result;
	}

	static boolean auxFindElement(int[] a, int x, int i, int j) {
		boolean result = false;
		if (i <= j) {
			int mid = (i + j) / 2;
			if (a[mid] == x) {
				return true;
			} else if (a[mid] > x) {
				result = auxFindElement(a, x, i, mid - 1);
			} else {
				result = auxFindElement(a, x, mid + 1, j);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		
		int[] a = new int[size];
		
		//filling the array
		Random rand = new Random();
		for(int i=0; i<a.length; i++){
			a[i]=rand.nextInt(5);
		}
		//randomly taking a number for searching
		int x = rand.nextInt(5); 
		boolean result = findElement(a,x);
		System.out.println("");
		System.out.println("x = "+x + " - "+result);
	}

}
