import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Pierwsza tablica
        int[] tablica1 = {1, 2, 3, 4, 5};

        // Tworzenie drugiej tablicy o tej samej wielkości co pierwsza
        int[] tablica2 = new int[tablica1.length];

        // Kopiowanie elementów z pierwszej do drugiej tablicy
        for (int i = 0; i < tablica1.length; i++) {
            tablica2[i] = tablica1[i];
        }

        // Wyświetlanie obu tablic
        System.out.println("Pierwsza tablica: " + Arrays.toString(tablica1));
        System.out.println("Druga tablica: " + Arrays.toString(tablica2));
    }
}
