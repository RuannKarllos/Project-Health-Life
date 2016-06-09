package br.com.healthylife.dao;

import br.com.healthylife.entity.Entity;
import br.com.healthylife.entity.Person;
import br.com.healthylife.structures.ListaLigada;

public class Dao< J extends Entity> implements IDao<J> {

    private Class currentClass;

    ListaLigada lista = new ListaLigada();

    Person entity = new Person();

    public Dao(Class<J> currentClass) {
        this.currentClass = currentClass;

    }

    @Override
    public void delete(String id) {
        lista.removerDoComeco();
    }

    @Override
    public void update(J e) {
        lista.adicionaNoComeco(e);
    }   

    @Override
    public void Find(String id) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public Entity[] listen() {
        throw new UnsupportedOperationException("Not supported yet.");

    }
}
