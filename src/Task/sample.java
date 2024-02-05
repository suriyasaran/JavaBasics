package task;

import java.util.Scanner;

public class sample {
	public static void main(String[]args) { 
	Scanner s= new Scanner(System.in);
	String str=s.next();
	String str1 =" str";
	String str2 ="";
	for(int i=str1.length()-1;i>=0;i++)
	{
		str2+=str1.charAt(i);
	}
	if(str2.equals(str1))
	{
		System.out.println("It is palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
	}
	

}
