package fsd.basics;
//import java.util.Scanner;

public class Duplicateelements {
	
	public static void main(String[] args) {
		
		int[] arr= {11,26,33,56,77,93,46,85,53,67};
//		int n=sc.nextInt();
//		int arr[]=new int[n];
		System.out.println("Original value`show :");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		int dup=0;
		System.out.println("\nduplicate value : ");
		for(int i = 0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					dup++;
					System.out.print(arr[j]+" ");
				}
			}
		}
		
		
	}

}
