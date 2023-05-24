public class Cachorro extends Animal {


    @Override
    void emitirSom() {
        System.out.println("Au-Au!");
    }

    @Override
    String movimentar() {
        return "O cachorro correu!";
    }
}
