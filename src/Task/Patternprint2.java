package task;

public class Patternprint2 {
	public static void main(String[]args) {
		 String s = "Racecar";	 
		 for (int i = s.length()-1; i >=0; i--) {
			 for (int j=0; j<s.length(); j++) {
				 if(i == j)
				 {
					 System.out.print(s.charAt(i));
				 }
				 else
				 {
					 System.out.print("*");
				 }
			 }
			 System.out.println("");
		 }
	 }
	}

