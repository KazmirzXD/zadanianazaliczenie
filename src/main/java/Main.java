import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicjalizacja tablicy znakowej
        char[] tablica = {'a', 'b', 'c', 'd', 'e'};

        // Wyświetlanie oryginalnej tablicy
        System.out.println("Oryginalna tablica: " + Arrays.toString(tablica));

        // Pobieranie indeksów od użytkownika
        System.out.print("Podaj indeks pierwszego elementu do zamiany: ");
        int indeks1 = scanner.nextInt();
        System.out.print("Podaj indeks drugiego elementu do zamiany: ");
        int indeks2 = scanner.nextInt();

        // Sprawdzanie, czy podane indeksy są poprawne
        if (indeks1 >= 0 && indeks1 < tablica.length && indeks2 >= 0 && indeks2 < tablica.length) {
            // Zamiana elementów w tablicy
            zamienElementy(tablica, indeks1, indeks2);

            // Wyświetlanie tablicy po zamianie elementów
            System.out.println("Tablica po zamianie elementów: " + Arrays.toString(tablica));
        } else {
            System.out.println("Podane indeksy są niepoprawne.");
        }

        scanner.close();
    }

    // Metoda do zamiany dwóch elementów w tablicy znakowej
    public static void zamienElementy(char[] tablica, int indeks1, int indeks2) {
        char temp = tablica[indeks1];
        tablica[indeks1] = tablica[indeks2];
        tablica[indeks2] = temp;
    }
}
