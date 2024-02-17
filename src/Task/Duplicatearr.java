package task;

public class Duplicatearr {
public static void main(String[] args) {
	int[] arr = {8,21,19,8,19};
	findDuplicate(arr,0,0);
}
public static void findDuplicate(int[]arr,int i,int j) {
	System.out.println("Function call i:"+i+" j:"+j);
	
	if (j < arr.length -1) {
		j= j+1;
	}
	
	else {
		i = i+1;
		j = j+1;
	}
	System.out.println("Function call i:"+i+" j:"+j);
	if(i < arr.length-1) {
		if(i<arr.length-1) {
			System.out.println("Duplicate: "+arr[i]);
		}
		findDuplicate(arr,i,j);
	}
	System.out.println("Function return i:"+i+" j:"+j);
}

public static void print(int[] arr) {

}








}
