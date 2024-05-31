import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Inicjalizacja tablicy liczb całkowitych
        int[] tablica = {5, 3, 8, 4, 2, 7, 1, 6};

        // Wyświetlanie oryginalnej tablicy
        System.out.println("Oryginalna tablica: " + Arrays.toString(tablica));

        // Znajdowanie drugiej najniższej liczby
        try {
            int drugaNajniższa = znajdzDrugaNajnisza(tablica);
            System.out.println("Druga najniższa liczba w tablicy to: " + drugaNajniższa);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Metoda do znajdowania drugiej najniższej liczby w tablicy liczb całkowitych
    public static int znajdzDrugaNajnisza(int[] tablica) {
        if (tablica.length < 2) {
            throw new IllegalArgumentException("Tablica musi zawierać co najmniej dwa elementy.");
        }

        int najnizsza = Integer.MAX_VALUE;
        int drugaNajnisza = Integer.MAX_VALUE;

        for (int num : tablica) {
            if (num < najnizsza) {
                drugaNajnisza = najnizsza;
                najnizsza = num;
            } else if (num < drugaNajnisza && num != najnizsza) {
                drugaNajnisza = num;
            }
        }

        if (drugaNajnisza == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Tablica nie zawiera drugiej najniższej liczby.");
        }

        return drugaNajnisza;
    }
}
