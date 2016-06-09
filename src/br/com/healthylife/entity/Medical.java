package br.com.healthylife.entity;

public class Medical extends Person {

    private double crm;    
	public Medical(String name, String CPF, String dateOfBorn, int age, String sex, String email, String phoneNumber,double crm) {
		super(name, CPF, dateOfBorn, age, sex, email, phoneNumber);
            this.crm= crm;
        
        }

}
