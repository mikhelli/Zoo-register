import factory.AnimalFactory;
import factory.AnimalFactory.TipoAnimal;
import model.Animal;
import service.Zoologico;

public class Main {
    public static void main(String[] args) {

        Zoologico zoo = new Zoologico();

        Animal cachorro = AnimalFactory.criar(TipoAnimal.CACHORRO, "Bolinha", 3, 12.5);
        Animal gato = AnimalFactory.criar(TipoAnimal.GATO, "Branquinho", 2, 4.2);
        Animal passaro = AnimalFactory.criar(TipoAnimal.PASSARO, "Pinta Silva", 1, 0.3);
        Animal peixe = AnimalFactory.criar(TipoAnimal.PEIXE, "Bob", 1, 0.1);
        Animal pato = AnimalFactory.criar(TipoAnimal.PATO, "Lillá", 2, 2.0);

        zoo.cadastrar(cachorro);
        zoo.cadastrar(gato);
        zoo.cadastrar(passaro);
        zoo.cadastrar(peixe);
        zoo.cadastrar(pato);

        zoo.visitar();
    }
}