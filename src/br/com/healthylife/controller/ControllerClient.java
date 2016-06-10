/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.controller;

import br.com.healthylife.apresentation.MainScreenClient;
import br.com.healthylife.dao.IDao;
import br.com.healthylife.entity.Client;
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
public class ControllerClient {
    
    IDao<Client> dc = Factory.getDao(Client.class);
    MainScreenClient msC = new MainScreenClient();
    
    public void registerClient(String name, String CPF, int age, String sex, String email, String phoneNumber, String date, String password) {
        Client c = new Client(name, CPF, age, sex, email, phoneNumber, date, password);
        
        if (age < 0) {
            throw new NumberFormatException("Não são aceitos números nagativos!");
        }
        
        dc.insert(c);
        
    }
    
    public boolean checkLogin(String login, String password) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        String folder = "\\Projeto\\Client";

        File file = new File(folder, login + ".data");

        if (file.exists()) {

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Client client = (Client) ois.readObject();

            if (password.equals(client.getPassword())) {
                msC.setVisible(true);
                return true;
            }
        } 
        
        return false;
    }
    
    public void update(String name, String CPF, int age, String sex, String email, String phoneNumber, String date, String password) {
        Client c = new Client(name, CPF, age, sex, email, phoneNumber, date, password);
        
        if (age < 0) {
            throw new NumberFormatException("Não são aceitos números nagativos!");
        }
    }    
}
