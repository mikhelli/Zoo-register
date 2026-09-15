package model;

import interfaces.Nadador;
import interfaces.Voador;

public class Pato extends Animal implements Nadador, Voador {

    public Pato(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " (Pato) diz: Quack quack!");
    }

    @Override
    public void mover() {
        nadar();
        voar();
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " (Pato) nada no lago.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " (Pato) voa sobre a água.");
    }
}