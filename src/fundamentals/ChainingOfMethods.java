package fundamentals;

public class ChainingOfMethods {

	String fName;
	String lName;
	String fullName;

	public ChainingOfMethods setFirstName(String firstName) {
		this.fName = firstName;
		return this;
	}

	public ChainingOfMethods setLastName(String lastName) {
		this.lName = lastName;
		return this;
	}

	public ChainingOfMethods setFullName() {
		this.fullName = fName + " " + lName;
		return this;
	}
	
	public String getFullName() {
		return this.fullName;
	}

	public void displayFullName() {
		System.out.println(this.getFullName());
	}
	
	

	public static void main(String[] args) {
		ChainingOfMethods chainMethods = new ChainingOfMethods();
		chainMethods.setFirstName("Raju");
		chainMethods.setLastName("Ch");
		chainMethods.setFullName();
		chainMethods.displayFullName();
		
		chainMethods.setFirstName("Raju").setLastName("Ch").setFullName().displayFullName();
		
		Class1 cls1 = new Class1();
		Class2 cls2 = new Class2();
		
		cls2.setFullName(cls1.setFirstName("Raju").setLastName("Ch").getFullName()).displayFullName();
		
	}

}
