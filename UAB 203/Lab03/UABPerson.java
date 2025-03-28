package Lab03;

/**
 * This class represent a person at UAB.
 * It takes in name, gender, age, and the blazerID.
 * 
 * It implements two methods:
 * 		checkPalidrom determines if the person's name is the same forward and backwards
 * 		yearsToRetirement looks at age to determine how many years are left until age 65
 * Also prompts a toString method to dislpay who and what age a person is.
 */

public class UABPerson {
	private String name;
	private String gender;
	private int age;
	private String blazerID;

	public UABPerson(String name, String gender, int age, String blazerID) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.blazerID = blazerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBlazerID() {
		return blazerID;
	}

	public void setBlazerID(String blazerID) {
		this.blazerID = blazerID;
	}

	public boolean checkPalidrom() {
		String name = this.name;
		int legnth = name.length();
		for (int i = 0; i < legnth / 2; i++) {
			if (name.charAt(i) != name.charAt(legnth - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public int yearsToRetirement() {
		int age = this.age;
		if (age < 65) {
			return 65 - age;
		} else {
			return 0;
		}
	}

	public String toString() {

		return this.name + " is " + this.age + " years old.";

	}

}
