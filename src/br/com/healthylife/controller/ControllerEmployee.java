/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.controller;

import br.com.healthylife.apresentation.MainScreenEmployee;
import br.com.healthylife.dao.IDao;
import br.com.healthylife.entity.Employee;
import br.com.healthylife.util.Factory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author ruann
 */
public class ControllerEmployee {

    IDao<Employee> de = Factory.getDao(Employee.class);
    
    MainScreenEmployee msE = new MainScreenEmployee();
    
    public boolean checkLogin(String login, String password) throws FileNotFoundException, IOException, ClassNotFoundException {
        String folder = "\\Projeto\\Client";

        File file = new File(folder, login + ".data");

        if (file.exists()) {

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee employee = (Employee) ois.readObject();

            if (password.equals(employee.getPassword())) {
                msE.setVisible(true);
                return true;
            }
        }
        return false;
    }

    public void register(String name, String CPF, int age, String sex, String email, String phoneNumber, String password) {
        Employee e = new Employee(name, CPF, age, sex, email, phoneNumber, password);

        de.insert(e);
    }

    public void update(String name, String CPF, int age, String sex, String email, String phoneNumber, String password) throws Exception {
        Employee e = new Employee(name, CPF, age, sex, email, phoneNumber, password);

        if (CPF.equals(de.search(CPF).getID())) {
            de.update(e);
        } else {
            throw new Exception("O usuário não se encontra cadastrado!");
        }
    }
    
    public void delete(String id) throws Exception {
        if (id.equals(de.search(id).getID())) {
            de.delete(id);
        } else {
            throw new Exception("O usuário desejado não se encontra cadastrado!");
        }
    }
}
