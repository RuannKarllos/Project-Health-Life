/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.controller;

import br.com.healthylife.dao.IDao;
import br.com.healthylife.entity.Medic;
import br.com.healthylife.util.Factory;
import java.io.File;

/**
 *
 * @author ruann
 */
public class ControllerMedic {
    
    IDao<Medic> dm = Factory.getDao(Medic.class);
    Medic m;
    public void register(String name, String CPF, int age, String sex, String email, String phoneNumber, int crm, String password) throws Exception {
        
        m = new Medic(name, CPF, age, sex, email, phoneNumber, crm, password);
        
        String folder = "Medic";
        File file = new File(folder, String.valueOf(crm) + ".data");
        
        if (!checkFields(name, CPF, age, sex, email, phoneNumber, crm, password)) {
            if (!file.exists()) {
                dm.insert(m);                
            } else {
                throw new Exception("Médico já foi cadastrado!");
            }
        } else {
            throw new Exception("Campos vazios ou preenchidos incorretamentes! \nVerifique os campos de IDADE e CRM!");
        }
    }
    
    public void update(String name, String CPF, int age, String sex, String email, String phoneNumber, int crm, String password) throws Exception {
         m = new Medic(name, CPF, age, sex, email, phoneNumber, crm, password);
        
        String folder = "Medic";
        File file = new File(folder, String.valueOf(crm) + ".data");
        
        if (!checkFields(name, CPF, age, sex, email, phoneNumber, crm, password)) {
            if (file.exists()) {
                dm.update(m);                
            } else {
                throw new Exception("Médico já foi cadastrado!");
            }
        } else {
            throw new Exception("Campos vazios ou preenchidos incorretamentes! \nVerifique os campos de IDADE e CRM!");
        }
    }
    
    public void delete(String id) throws Exception {
        dm.delete(id);
    }
    
    public Medic search(String id) {
        return (Medic) dm.search(id);
    }

    private boolean checkFields(String name, String CPF, int age, String sex, String email, String phoneNumber, int crm, String password) {
        return name.length() <= 0 || CPF.length() <= 0 || age >= 18 || sex.length() <= 0 
                || email.length() <= 0 || phoneNumber.length() <= 0 || String.valueOf(crm).length() < 3 || password.length() <= 0;
    }
    
}
