package fundamentals;

public class Class2 {

	String fullName;

	public Class2 setFullName(String fullName) {
		this.fullName = fullName;
		return this;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void displayFullName() {
		System.out.println(this.getFullName());
	}

}
