import java.util.Random;

public class FindDuplicates2 {
	
	//Time Complexity = nlogn + nlogn = O(nlogn)
	//Space Complexity = O(1)
	static boolean findDuplicates2(int[] a){
	    java.util.Arrays.sort(a);//nlogn
	    for(int i=0; i<a.length-1;i++){//n
	     boolean result = binarySearch(a,a[i],i+1,a.length-1);//log n
	     if(result==true) return true;
	    }
	    return false;
	}
	//Time Complexity = O(logn)
	static boolean binarySearch(int[] a, int x, int i, int j) {
		boolean result = false;
		if (i <= j) {
			int mid = (i + j) / 2;
			if (a[mid] == x) {
				return true;
			} else if (a[mid] > x) {
				result = binarySearch(a, x, i, mid - 1);
			} else {
				result = binarySearch(a, x, mid + 1, j);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = Integer.parseInt(args[0]);
		int[] a = new int[size];
		//filling the array
		Random rand = new Random();
		for(int i=0; i<a.length; i++){
			a[i]=rand.nextInt(100);
		}
		//priting the array
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");				
		}
		System.out.println("");
		boolean result = findDuplicates2(a);
		System.out.println("Result = "+result);
	}

}
