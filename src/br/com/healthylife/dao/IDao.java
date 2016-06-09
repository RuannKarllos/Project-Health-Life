/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.dao;

import br.com.healthylife.entity.Entity;


public interface IDao<J extends Entity>{
    
    public void register(J entity);
    
    public void delete(String id); 
    
    public void update(J entity);
    
    public void Find(String id);
    
    Entity[] listen();
}
