package model;

import interfaces.Voador;

public class Passaro extends Animal implements Voador {

    public Passaro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " (Pássaro) diz: Piu piu!");
    }

    @Override
    public void mover() {
        voar();
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " (Pássaro) voa pelo céu.");
    }
}