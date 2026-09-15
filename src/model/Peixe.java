package model;

import interfaces.Nadador;

public class Peixe extends Animal implements Nadador {

    public Peixe(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        // deixei sem nada pq o peixe não tem som mas eu precisava sobrescrever já que é regra
    }

    @Override
    public void mover() {
        nadar();
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " (Peixe) nada no aquário.");
    }
}