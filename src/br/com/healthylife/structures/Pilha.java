
package br.com.healthylife.structures;

import br.com.healthylife.entity.Person;

public class Pilha {
    private Person p [];
	private int tamanho;
	
	
	Pilha(){
		
		this.tamanho = -1;
		this.p = new Person[10];
		
	}
	
	public Person[] getP() {
		return p;
	}


	public void setP(Person p[]) {
		this.p = p;
	}
	
	
	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho= tamanho;
	}
	
	
	public boolean vazia(){

	if(this.tamanho==-1){
		
		System.out.println("lista vazia ");}
	
	
		return true;
	}
	
		
	public int TamanhopilhaCheia(){	
		if(this.vazia()){ return 0;}
	
		return this.tamanho+1 ;
	}
		
	public void empilhar(Person p2){
	
		if(this.tamanho<this.p.length){
			this.p[++tamanho] = p2;
			System.out.println(p2.getName()+" "+p2.getAge()+" "+p2.getCPF());
		}
	
	}
	
	public Person desempilhar(){
		
		if(vazia()){
		
		return null;
		
		}return this.p[this. tamanho --];
		
	
	}
        
     public void mostraPilha(){   
        
         for (int i = 0; i <p.length; i++) {
             
             System.out.println(p.getClass().getName());
             
         }
         
        
     }
}
