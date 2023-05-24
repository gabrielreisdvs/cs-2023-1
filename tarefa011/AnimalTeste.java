public class AnimalTeste {
    public static void main(String[] args) {
        Zoologico z = new Zoologico();

        Animal a1 = new Cavalo();
        a1.emitirSom();
        Animal a2 = new Cachorro();
        a2.emitirSom();
        Animal a3 = new Preguica();
        a3.emitirSom();

        Veterinario v = new Veterinario();

        System.out.println(v.examinar(a1));
        System.out.println(v.examinar(a2));
        System.out.println(v.examinar(a3));

        Animal a4 = new Cavalo();
        Animal a5 = new Cachorro();
        Animal a6 = new Preguica();
        Animal a7 = new Cavalo();
        Animal a8 = new Cachorro();
        Animal a9 = new Preguica();
        Animal a10 = new Cavalo();


        z.getJaulas().add(a1);
        z.getJaulas().add(a2);
        z.getJaulas().add(a3);
        z.getJaulas().add(a4);
        z.getJaulas().add(a5);
        z.getJaulas().add(a6);
        z.getJaulas().add(a7);
        z.getJaulas().add(a8);
        z.getJaulas().add(a9);
        z.getJaulas().add(a10);

        for (Animal a: z.getJaulas()) {
            a.emitirSom();
            if(a instanceof Cachorro || a instanceof Cavalo) {
                System.out.println(a.movimentar());
            }
        }

    }
}
