package br.com.healthylife.entity;

public class Employee extends Manager {

	public Employee(String name, String CPF, String dateOfBorn, int age, String sex, String email, String phoneNumber) {
		super(name, CPF, dateOfBorn, age, sex, email, phoneNumber);

	}
	
	@Override
	public void registerClient(Client c) {
		super.registerClient(c);
	}
	
	@Override
	public void registerMedic(Medical m) {
		// TODO Auto-generated method stub
		super.registerMedic(m);
	}
	
	
}
