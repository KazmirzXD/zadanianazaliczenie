import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Inicjalizacja tablicy liczb całkowitych
        int[] tablica = {5, 3, 8, 4, 2, 7, 1, 6};

        // Wyświetlanie oryginalnej tablicy
        System.out.println("Oryginalna tablica: " + Arrays.toString(tablica));

        // Sortowanie tablicy w porządku rosnącym
        sortujTablice(tablica);

        // Wyświetlanie posortowanej tablicy
        System.out.println("Tablica po sortowaniu: " + Arrays.toString(tablica));
    }

    // Metoda do sortowania tablicy liczb całkowitych w porządku rosnącym
    public static void sortujTablice(int[] tablica) {
        Arrays.sort(tablica);
    }
}
