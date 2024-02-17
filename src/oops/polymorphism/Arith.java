package oops.polymorphism;

public class Arith extends SimpleMath{
	
	int a=0,b=0;
	String name;


	public Arith(int a, int b) {
		super(a,b);
		this.a = a;
		this.b = b;
	}
	
	
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int add() {
		super.add();
	return a +b+b;	
	}

}
