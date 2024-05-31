import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Inicjalizacja tablicy liczb całkowitych
        int[] tablica = {5, 3, 8, 4, 2, 7, 1, 6};

        // Wyświetlanie oryginalnej tablicy
        System.out.println("Oryginalna tablica: " + Arrays.toString(tablica));

        // Sortowanie tablicy w porządku malejącym
        sortujTabliceMalejaco(tablica);

        // Wyświetlanie posortowanej tablicy
        System.out.println("Tablica po sortowaniu malejącym: " + Arrays.toString(tablica));
    }

    // Metoda do sortowania tablicy liczb całkowitych w porządku malejącym (sortowanie bąbelkowe)
    public static void sortujTabliceMalejaco(int[] tablica) {
        int n = tablica.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (tablica[j] < tablica[j + 1]) {
                    // Zamiana miejscami elementów
                    int temp = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = temp;
                }
            }
        }
    }
}
