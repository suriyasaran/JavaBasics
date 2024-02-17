package oops.encap;

public class EncapMain {

public static void main(String[] args) {
	Person person = new Person("Ranjith","Kumar");
	
	person.setAge("50");
	person.setGender("Male");
	person.setBloodGroup("B+ve");
	 
	String name = person.getFirstName()+" "+person.getLastName()+" ,"+person.getAge()+"/"+person.getGender();
	System.out.println(name);
}

}
