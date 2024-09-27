package fundamentals;

public class Class1 {
	String fName;
	String lName;

	public Class1 setFirstName(String firstName) {
		this.fName = firstName;
		return this;
	}

	public Class1 setLastName(String lastName) {
		this.lName = lastName;
		return this;
	}

	public String getFullName() {
		return fName + " " + lName;
	}

}
