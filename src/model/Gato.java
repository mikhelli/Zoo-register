package model;

public class Gato extends Animal {

    public Gato(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " (Gato) diz: Miau!");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " (Gato) caminha devagar.");
    }
}