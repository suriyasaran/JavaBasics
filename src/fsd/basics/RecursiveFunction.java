package fsd.basics;

public class RecursiveFunction {
	public static void main(String[]args) {
		int[]arr= {8,5,3,2,9};
		System.out.println("Original : ");
		recursive(arr,0);
		System.out.println("Reverse : ");
		reverserecursive(arr,arr.length-1);
	}
	public static int recursive(int[] arr,int i) {
		if(i<arr.length) {
			System.out.println(arr[i]);
			recursive(arr,++i);
		}
		return i;
	}
	
	public static int reverserecursive(int[] arr,int i) {
		if(i>=0) {
			System.out.println(arr[i]);
			reverserecursive(arr,--i);
		}
		return i;
	}

}
