package task;

public class Patternprint3 {
	public static void main(String[]args) {
		 String s = "Racecar";		
		 for (int i = 0; i <s.length(); i++) {
			 for (int j=0; j<s.length(); j++) {
				 if(i+j==s.length()-1)					 
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

