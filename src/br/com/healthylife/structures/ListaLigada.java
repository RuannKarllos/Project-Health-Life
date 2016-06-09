package br.com.healthylife.structures;



import br.com.healthylife.entity.Entity;
import br.com.healthylife.entity.Person;


public class ListaLigada {


	private Nodo primeiro;

	private Nodo ultimo;

	private int totalElementos;

	public void adicionaNoComeco(Entity e){

		Nodo novo = new Nodo(this.primeiro,e);
		this.primeiro=novo;

		if(this.totalElementos == 0){

			this.ultimo = this.primeiro;
		}

		totalElementos++;
	}

	public void adicionaNoFim(Person person){

		if(this.totalElementos == 0){		

			this.adicionaNoComeco(person);			


		} else {

			Nodo novo = new Nodo(person);

			this.ultimo.setProximo(novo);

			this.ultimo=novo;

			this.totalElementos++;

		}
	}
	public String toString(){

		if(this.totalElementos == 0 ){

			return "[]";
		}

		StringBuilder builder = new StringBuilder("[");

		Nodo atual = primeiro;

		for (int i = 0; i < this.totalElementos-1;i++) {
                        
                    
                    
			builder.append((Person) atual.getP());
			builder.append(" , ");
			atual = atual.getProximo();

		}

		builder.append(atual.getP().getID());
		builder.append(" ] ");



		return builder.toString();
	}	

	private boolean posicaoOcupada(int posicao){

		return posicao >= 0 && posicao< this.totalElementos;
	}

	private Nodo pegaNodo(int posicao){

		if(!this.posicaoOcupada(posicao)){	

			throw new IllegalArgumentException("posicao nao existe");


		}

		Nodo atual = primeiro;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();


		}
		return atual;

	}


	public void adicionarQualquerPosicao(int posicao , Person person){

		if(posicao == 0){
			this.adicionaNoComeco(person);

		} else if (posicao == totalElementos){

			this.adicionaNoFim(person);

		}else{

			Nodo anterior = this.pegaNodo(posicao-1);
			Nodo novo = new Nodo(anterior.getProximo(),person);
			anterior.setProximo(novo);
			this.totalElementos++;

		}
	}

	public Object pega(int posicao){

		return this.pegaNodo(posicao).getP();	
	}


	public void removerDoComeco(){

		if(!this.posicaoOcupada(0)){

			throw new IllegalArgumentException("Posição nao existe");

		}
		this.primeiro = this.primeiro.getProximo();
		this.totalElementos--;

		if(this.totalElementos == 0){

			this.ultimo = null;	
		}

	}


	public int tamanho (){ 
		return this.totalElementos;

	
}

}