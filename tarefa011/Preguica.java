public class Preguica extends Animal {
    @Override
    void emitirSom() {
        System.out.println("oin");
    }

    @Override
    String movimentar() {
        return "A preguiça subiu na árvore!";
    }
}
