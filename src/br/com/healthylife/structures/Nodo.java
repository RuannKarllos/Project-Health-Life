package br.com.healthylife.structures;



import br.com.healthylife.entity.Person;
import br.com.healthylife.entity.Entity;


public class Nodo {

	private Nodo proximo;

	private Entity e;

	public Nodo(Nodo proximo,Entity e){

	this.proximo = proximo;
	this.e = e;
		
	}
	public Nodo(Entity e){
	
	this.e = e;
	
	}
	
	public Nodo getProximo() {
		return proximo;
	}

	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}

	public Entity getP() {
		return e;
	}

	public void setP(Person person) {
		this.e = e;
	}
	
}
