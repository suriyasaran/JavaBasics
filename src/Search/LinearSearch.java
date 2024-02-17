package Search;

public class LinearSearch {

	public static void main(String[] args) {
	int	arr[]= {7,8,12,23,9,35,8,3,6};
	int	n = 9;
	int res = -1;
	for (int i=0;i<arr.length;i++) {
		if(arr[i]==n)
		{
			res =i;
			break;
		}
	}
	System.out.println(res);

	}

}
