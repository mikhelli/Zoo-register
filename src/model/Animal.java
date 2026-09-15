package model;

public abstract class Animal {

    private String nome;
    private int idade;
    protected double peso;

    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public abstract void emitirSom();

    public abstract void mover();
}