package factory;

import model.*;

public class AnimalFactory {

    public enum TipoAnimal {
        CACHORRO, GATO, PASSARO, PEIXE, PATO
    }

    public static Animal criar(TipoAnimal tipo, String nome, int idade, double peso) {
        switch (tipo) {
            case CACHORRO:
                return new Cachorro(nome, idade, peso);
            case GATO:
                return new Gato(nome, idade, peso);
            case PASSARO:
                return new Passaro(nome, idade, peso);
            case PEIXE:
                return new Peixe(nome, idade, peso);
            case PATO:
                return new Pato(nome, idade, peso);
            default:
                throw new IllegalArgumentException("Tipo de animal desconhecido: " + tipo);
        }
    }
}