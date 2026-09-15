package service;

import model.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    private List<Animal> animais = new ArrayList<>();

    public void cadastrar(Animal animal) {
        animais.add(animal);
    }

    public void visitar() {
        for (Animal animal : animais) {
            animal.emitirSom();
            animal.mover();
            System.out.println("------------------------------");
        }
    }
}