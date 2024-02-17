package overridePro;

public abstract class Base {
	String name;
	//String dob;
	void setname(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public abstract String dob();
}