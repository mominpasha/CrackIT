package Arrays;

import java.util.Random;

public class Basics {

	static boolean findElement(int[] a, int x){
		for(int i=0; i<a.length; i++){
			if(a[i]==x){
				return true;
			}
		}
		return false;
	}
	static void printReverse(int[] a){
		for(int i=a.length-1; i>=0; i--){
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		int[] a = new int[size];
		//filling the array
		Random rand = new Random();
		for(int i=0; i<a.length; i++){
			a[i]=rand.nextInt(1000);
		}
		//priting the array
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");				
		}
		//printing array in reverse
		System.out.println("");
		printReverse(a);
		//Just a new line for readability
		System.out.println("");
		//getting one more random number as search element
		int x = rand.nextInt(1000);
		boolean result = findElement(a,x);
		System.out.println(x + " - " + result);
		

	}

}
