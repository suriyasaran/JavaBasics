package fsd.basics;
import java.util.*;
public class Oddoreven {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		String j=s.nextLine();
				
		int a[]={11,34,54,93,56,9,6,5,73,88};
		System.out.println("odd number");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(" "+a[i]);
				
			}
				}
		System.out.println("Even Numbers:");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(" "+a[i]);
	}

}
	}
}