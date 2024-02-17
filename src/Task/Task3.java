package task;

import java.util.*;

public class Task3 {
	public static void main (String [] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter a number 1:");
	int num=s.nextInt();
	System.out.println("Enter a number 2:");
	int nu=s.nextInt();
	System.out.println("Your choice are:");
	System.out.println("+");
	System.out.println("-");
	System.out.println("*");
	System.out.println("/");
	System.out.println("Enter your choice:");
	String choice=s.next();
	switch(choice)
	{
	case "+":
		ob.add(num1,num2);
		break;
	case "-":
		ob.add(num1,num2);
		break;
	case "*":
		ob.add(num1,num2);
		break;
	case "/":
		ob.add(num1,num2);
		break;
		default:
			System.out.println("Invalid input");
			break;
			
	}
	
	
		
	}

}
