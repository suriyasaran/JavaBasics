package fsd.basics;

public class Recursiveloop {
	public static void main(String[] args) {
		int[] arr = {34,56,78,65,43,45,32};
		int[] aseRes = asc(arr,0,0);
		int[] descRes = desc(arr,0,0);
		System.out.println("Asc");
		print(aseRes);
		System.out.println("Desc");
		print(descRes);
		
	}
	public static void print(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			
		}
	}
	 public static int[] asc(int[] arr,int i,int j) {
		 if(j<arr.length-1) {
			 j++;
		 }
		 else {
			 j=0; i++;
		 }
		 if(i<arr.length) {
			 int temp = arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
		 }
		 asc(arr,i,j);
	 }
	return 0;
}

public static int[] desc(int[] arr,int i,int j) {
	if (j<arr.length-1) {
		j++;
	}
	else {
		j=0; i++;
	}
	if (i<arr.length) {
		
		
	}
	desc(arr,i,j);
}
}


