package task;
import java.util.*;

public class FactorialForloop {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				System.out.println("Enter a number:");
		int num=s.nextInt();
		int result =1;
		for (int i=1;i<=num;i++)
		{
			result=result*i;
			
		}
		System.out.println(result);
		
	}
	

}
