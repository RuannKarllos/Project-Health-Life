package br.com.healthylife.entity;

public class Client extends Person {

	public Client(String name, String CPF, String dateOfBorn, int age, String sex, String email, String phoneNumber) {
		super(name, CPF, dateOfBorn, age, sex, email, phoneNumber);
	}
        
        private double payment = 150;

}
