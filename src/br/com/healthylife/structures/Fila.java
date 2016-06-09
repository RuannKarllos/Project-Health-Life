/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.structures;

import br.com.healthylife.entity.Person;
import javax.swing.JOptionPane;

/**
 *
 * @author SYSTEM
 */
public class Fila {

    int inicio;
    int fim;
    int tamanho;
    int qtdeElementos;
    Person p[];

    public Fila(){
        inicio = fim = -1;
        tamanho = 100;
        p = new Person[tamanho];
        qtdeElementos = 0;
    }

    public boolean estaVazia(){
        if (qtdeElementos == 0){
            return true;
        }
        return false;
    }

    public boolean estaCheia(){
        if (qtdeElementos == tamanho - 1){
            return true;
        }
        return false;
    }

    public void adicionar(Person p1){
        if (! estaCheia()){
            if (inicio == -1){
                inicio = 0;
            }
            fim++;
            p[fim] = p1;
            qtdeElementos++;
        }
    }

    public void remover(){
        if (! estaVazia() ){
            inicio++;
            qtdeElementos--;
        }
    }

    public void mostrar(){
        String elementos = "";
            for (int i = inicio; i<=fim; i++) {
                elementos += p[i].getName()+ " - ";
            }
            JOptionPane.showMessageDialog(null, elementos);
    }

     public void pesquisarFila(Person p1){
        
        boolean n = true; 
        
        for (int i = 0; i < p.length; i++) {
            
            if(p[i]!=p1){
            n = false;
        }else {
        
                System.out.println("encontrado" +" "+p[i].getName());
                break;
            }
    }
    if(n == false){
    
        System.out.println("essa pessoa nao esta na fila");
        
 
            
    }
}
    

}
    
	
	

    

