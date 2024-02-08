package fsd.basics;

public class Project2rev {
	public static void main(String[]args) {
		int n=5;
		
	}
	
	public static void middle(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=n+1;j>=1;j--)
			{
				if(i >= j-(i-1))
				System.out.print(j);
				else
			System.out.print(" ");
			}
			System.out.println();
		}
			}
			
			// TODO Auto-generated method stub
		
		
public static void right(int n) {
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.println(j);
		}
		System.out.println();
	}
	
}

public static void left(int n) {
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.println(j);
		}
		System.out.println();
	}
	
}



}