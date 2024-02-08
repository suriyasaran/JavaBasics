package condition.checking;

public class TwodiamentionalArray {
public static void main(String[] args) {
	int[][] arr1= {{2,3,5},{9,6,2},{2,9,4},{7,9,2},{8,2,6}};
	int[][] arr= new int [5][3];
	

	arr[0][0]=2;
	arr[0][1]=3;
	arr[0][2]=5; 
	arr[1][0]=9; 
	arr[1][1]=6;
	arr[1][2]=2;
	arr[2][0]=2;
	arr[2][1]=9; 
	arr[2][2]=4; 
	arr[3][0]=7;
	arr[3][1]=2;
	arr[3][2]=3;
	arr[4][0]=5; 
	arr[4][1]=9; 
	arr[4][2]=6;
	for(int i=0;i<=arr.length;i++)
	{
		int []val = arr[i];
		for(int j=0;j<val.length;j++)
		{
			System.out.println(val[i]);
		}
	}

}
}
