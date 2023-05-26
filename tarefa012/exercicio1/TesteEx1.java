import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TesteEx1 {
    public static void main(String[] args) {


        int[] cem = new int[100];
        int[] mil = new int[1000];
        int[] dezMil = new int[10000];

        Random rand = new Random();

        for(int i = 0; i < 100; i++) {
            cem[i] = rand.nextInt(10000000);
        }

        for(int i = 0; i < 1000; i++) {
            mil[i] = rand.nextInt(10000000);
        }

        for(int i = 0; i < 10000; i++) {
            dezMil[i] = rand.nextInt(10000000);
        }

        // QuickSort Recursivo
        QuickSortRecursivo quickSortRecursivo = new QuickSortRecursivo();
        long startTime = System.nanoTime();
        quickSortRecursivo.ordenarVetorDeInteiros(cem);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("O tempo de exec. do quicksort recursivo com 100: " + timeElapsed / 10000);
        startTime = System.nanoTime();
        quickSortRecursivo.ordenarVetorDeInteiros(mil);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("O tempo de exec. do quicksort recursivo com 1000: " + timeElapsed / 10000);
        startTime = System.nanoTime();
        quickSortRecursivo.ordenarVetorDeInteiros(dezMil);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("O tempo de exec. do quicksort recursivo com 10000: " + timeElapsed / 10000);

        for(int i = 0; i < 100; i++) {
            cem[i] = rand.nextInt(10000000);
        }

        for(int i = 0; i < 1000; i++) {
            mil[i] = rand.nextInt(10000000);
        }

        for(int i = 0; i < 10000; i++) {
            dezMil[i] = rand.nextInt(10000000);
        }

        // QuickSort Iterativo
        QuickSortIterativo quickSortIterativo = new QuickSortIterativo();
        startTime = System.nanoTime();
        quickSortIterativo.iterativeQuicksort(cem);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("O tempo de exec. do quicksort iterativo com 100: " + timeElapsed / 10000);
        startTime = System.nanoTime();
        quickSortIterativo.iterativeQuicksort(mil);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("O tempo de exec. do quicksort iterativo com 1000: " + timeElapsed / 10000);
        startTime = System.nanoTime();
        quickSortIterativo.iterativeQuicksort(dezMil);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("O tempo de exec. do quicksort iterativo com 10000: " + timeElapsed / 10000);
    }
}