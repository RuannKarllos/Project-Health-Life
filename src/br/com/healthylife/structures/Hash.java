
package br.com.healthylife.structures;

import br.com.healthylife.entity.Person;


public class Hash {
    
    
    DinamicList array [];

    public Hash() {
        
        array = new DinamicList[50];
        startList();   
    }
    
    final void startList(){
        
        for (int i = 0; i < array.length; i++) {
            
            array[i]=new DinamicList();
        } 
        
        
    }
    
public void addHash(String name){    
    
   array[funcaoHash(name)].add(name);
  
}   



final int funcaoHash(String name){
  name = name.toLowerCase();
  int posicao = name.charAt(0);
    
    
      return posicao - 97;
    }        
    
  
}
