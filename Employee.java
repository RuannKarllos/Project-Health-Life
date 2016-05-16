package entity;

public class Employee extends Peolpe implements Entity  {

	public Employee(String name, String cPF, String dateOfBorn, int age, String sex, String email, String phoneNumber) {
		super(name, cPF, dateOfBorn, age, sex, email, phoneNumber);
		
	}

	@Override
	public String getID() {
		return null;
	}

}
