package entity;

public class Peolpe {

	private String name;
	private String CPF;
	private String dateOfBorn;
	private int age;
	private String sex;
	private String email;
	private String phoneNumber;

	
	
	
	public Peolpe(String name, String CPF, String dateOfBorn, int age, String sex, String email, String phoneNumber) {
		super();
		this.name = name;
		this.CPF = CPF;
		this.dateOfBorn = dateOfBorn;
		this.age = age;
		this.sex = sex;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getDateOfBorn() {
		return dateOfBorn;
	}

	public void setDateOfBorn(String dateOfBorn) {
		this.dateOfBorn = dateOfBorn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
