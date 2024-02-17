package oops.encap;

public class Person {

	String firstName, lastName, salutation, gender , ssn, address, zip, phone, dob ,bloodGroup, age;
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String salutation() {
		return salutation;
	}
	public String gender() {
		return gender;
	}
	public String ssn() {
		return ssn;
	}
	public String address() {
			return address;
		}
	public String zip() {
		return zip;
	}
	public String phone() {
		return phone;
	}
	public String dob() {
		return dob;
	}
	public String bloodGroup() {
		return bloodGroup;
	}
	public String age() {
		return age;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public void setAge(String age) {
		this.age = age;
	}
}