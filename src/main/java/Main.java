import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Inicjalizacja tablicy liczb całkowitych
        int[] tablica = {5, 3, 8, 4, 2, 7, 1, 6};

        // Wyświetlanie oryginalnej tablicy
        System.out.println("Oryginalna tablica: " + Arrays.toString(tablica));

        // Znajdowanie liczby parzystych i nieparzystych liczb
        int[] wynik = policzParzysteINieparzyste(tablica);

        // Wyświetlanie wyników
        System.out.println("Liczba parzystych liczb: " + wynik[0]);
        System.out.println("Liczba nieparzystych liczb: " + wynik[1]);
    }

    // Metoda do liczenia parzystych i nieparzystych liczb w tablicy liczb całkowitych
    public static int[] policzParzysteINieparzyste(int[] tablica) {
        int liczbaParzystych = 0;
        int liczbaNieparzystych = 0;

        for (int num : tablica) {
            if (num % 2 == 0) {
                liczbaParzystych++;
            } else {
                liczbaNieparzystych++;
            }
        }

        return new int[] {liczbaParzystych, liczbaNieparzystych};
    }
}
