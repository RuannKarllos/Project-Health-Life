package entity;

public class Doctor extends Peolpe implements Entity {

	public Doctor(String name, String cPF, String dateOfBorn, int age, String sex, String email, String phoneNumber) {
		super(name, cPF, dateOfBorn, age, sex, email, phoneNumber);
		
	}

	@Override
	public String getID() {
		
		return getCPF();
	} 
	
	
	
	
	
	
	
	
	
	
	
	
}
