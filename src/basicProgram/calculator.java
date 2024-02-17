package basicProgram;
import java.util.Scanner;
public class calculator {
	public static void main(String args[]) {
	Scanner Scanner = new Scanner(System.in);
	System.out.println("Enter two numbers: ");
	double first = Scanner.nextDouble();
	double second = Scanner.nextDouble();
	System.out.print("Enter a operator (+,-,*,%):");
	char operator = Scanner.next().charAt(0);
	double result;
	switch(operator)
	{
	case'+':
		result=first+second;
		break;
	case'-':
		result=first-second;
		break;
	case'*':
		result=first*second;
		break;
	case'/':
		result=first/second;
		break;
		default:
		System.out.printf("Error!  ");
	}
	System.out.printf ("%.1f %c %.1f = %.1f ",first,operator,second,result);
	}

}
