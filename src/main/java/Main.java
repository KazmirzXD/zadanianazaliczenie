import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Inicjalizacja tablicy liczb całkowitych
        int[] tablica = {5, 3, 8, 4, 2, 7, 1, 6};

        // Wyświetlanie oryginalnej tablicy
        System.out.println("Oryginalna tablica: " + Arrays.toString(tablica));

        // Odwracanie tablicy
        odwracajTablice(tablica);

        // Wyświetlanie odwróconej tablicy
        System.out.println("Tablica po odwróceniu: " + Arrays.toString(tablica));
    }

    // Metoda do odwracania tablicy liczb całkowitych
    public static void odwracajTablice(int[] tablica) {
        int n = tablica.length;
        for (int i = 0; i < n / 2; i++) {
            // Zamiana miejscami elementów
            int temp = tablica[i];
            tablica[i] = tablica[n - 1 - i];
            tablica[n - 1 - i] = temp;
        }
    }
}
