package Arrays;

import java.util.Random;

public class Values {

	static void incrementArrayValues(int[] a) {
		for (int i = 0; i < a.length; i++)
			a[i] = a[i] + 1;
	}

	static void incrememtValues(int x) {
		x = x + 1;
	}
	
	static int sumOfArrays(int[] a){
		int sum = 0;
		for(int i=0; i<a.length; i++){
			sum = sum + a[i];
		}
		return sum;
	}
	static int productOfArrays(int[] a){
		int product = 1;
		for(int i=0; i<a.length; i++){
			product = product * a[i];
		}
		return product;
	}
	static void printPairs(int[] a){
		for(int i=0; i<a.length-1; i++){
			System.out.println("("+a[i]+" , "+a[i+1]+")");
		}
	}

	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		int[] a = new int[size];
		// filling the array
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(5);
		}
		// priting the array
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		//Finding sum of array elements
		int sum = sumOfArrays(a);
		System.out.println("Sum = "+sum);
		//Findind product of array elements
		int product = productOfArrays(a);
		System.out.println("Product = "+product);
		//Printing pairs
		printPairs(a); 
		//call by reference
		incrementArrayValues(a);
		// priting the array
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		//call by value
		int x = 10;
		incrememtValues(x);
		System.out.println("x = " + x);

	}

}
