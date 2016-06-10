package br.com.healthylife.entity;

import java.io.Serializable;

public class Medic extends Person implements Serializable {

    private double crm;

    public Medic(String name, String CPF, int age, String sex, String email, String phoneNumber, double crm) {
        super(name, CPF, age, sex, email, phoneNumber);
        this.crm = crm;

    }

    public double getCrm() {
        return crm;
    }

    public void setCrm(double crm) {
        this.crm = crm;
    }

    @Override
    public String getID() {
        return getCPF();
    }

}
