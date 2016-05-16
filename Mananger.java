package entity;

public class Mananger extends Peolpe implements Entity{


	public Mananger(String name, String cPF, String dateOfBorn, int age, String sex, String email, String phoneNumber) {
		super(name, cPF, dateOfBorn, age, sex, email, phoneNumber);
		
	}

	@Override
	public String getID() {
		return getCPF();
	}

}
