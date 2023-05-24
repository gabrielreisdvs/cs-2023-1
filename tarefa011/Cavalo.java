public class Cavalo extends Animal {
    @Override
    void emitirSom() {
        System.out.println("iiirrrri");
    }

    @Override
    String movimentar() {
        return "O cavalo correu";
    }
}
