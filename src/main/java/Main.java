import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Inicjalizacja tablicy liczb całkowitych
        int[] tablica = {5, 3, 8, 4, 2, 7, 1, 6};

        // Wyświetlanie oryginalnej tablicy
        System.out.println("Oryginalna tablica: " + Arrays.toString(tablica));

        // Obliczanie różnicy między największą a najmniejszą wartością
        int roznica = znajdzRoznice(tablica);

        // Wyświetlanie wyniku
        System.out.println("Różnica między największą a najmniejszą wartością: " + roznica);
    }

    // Metoda do obliczania różnicy między największą i najmniejszą wartością w tablicy
    public static int znajdzRoznice(int[] tablica) {
        if (tablica == null || tablica.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być pusta.");
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : tablica) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }
}
