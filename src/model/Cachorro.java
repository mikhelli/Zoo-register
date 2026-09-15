package model;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " (Cachorro) diz: Au au!");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " (Cachorro) corre pelo pátio.");
    }
}