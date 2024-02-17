package oops.inheritance.multiple;
import oops.inheritance.single.Father;
import oops.inheritance.single.Son;

public class OopsMain {
public static void main(String[] args) {
	 Father father = new Father("Ram");
	 Father father1 = new Father("Gokul");
	 Son son =new Son("Rahul");
	 father.setName("Surya");
	 System.out.println(father.getName());
	 System.out.println(father1.getName());
	 System.out.println(son.getName());
	 System.out.println(son.getAge());
	 
}


}
