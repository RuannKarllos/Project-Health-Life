/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.controller;

import br.com.healthylife.dao.IDao;
import br.com.healthylife.entity.Consultation;
import br.com.healthylife.util.Factory;
import java.util.Date;

/**
 *
 * @author ruann
 */
public class ControllerConsultation {

    IDao<Consultation> dc = Factory.getDao(Consultation.class);

    public void registerConsult(String cod, String patientName, String hospitalName, Date consultationDate) {
        Consultation c = new Consultation(cod, patientName, hospitalName, consultationDate);

        dc.insert(c);
    }

    public void updateConsult(String cod, String patientName, String hospitalName, Date consultationDate) throws Exception {
        Consultation c = new Consultation(cod, patientName, hospitalName, consultationDate);

        if (cod.equals(dc.search(cod).getID())) {
            dc.update(c);
        } else {
            throw new Exception("O código de consulta não existe!");
        }
    }
    
    public void cancelColsunt(String cod) throws Exception {
        if (cod.equals(dc.search(cod).getID())) {
            dc.delete(cod);
        } else {
            throw new Exception("Código inexistente!");
        }
    }
}
