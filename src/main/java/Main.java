//-Napisz program, który usunie trzeci element z tablic znakowej.

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Inicjalizacja tablicy znakowej
        char[] tablica = {'a', 'b', 'c', 'd', 'e'};

        // Wyświetlanie oryginalnej tablicy
        System.out.println("Oryginalna tablica: " + Arrays.toString(tablica));

        // Usuwanie trzeciego elementu (indeks 2)
        tablica = usunTrzeciElement(tablica);

        // Wyświetlanie tablicy po usunięciu trzeciego elementu
        System.out.println("Tablica po usunięciu trzeciego elementu: " + Arrays.toString(tablica));
    }

    // Metoda do usuwania trzeciego elementu z tablicy
    public static char[] usunTrzeciElement(char[] tablica) {
        // Sprawdzenie, czy tablica ma co najmniej trzy elementy
        if (tablica.length < 3) {
            System.out.println("Tablica nie ma co najmniej trzech elementów.");
            return tablica;
        }

        // Tworzenie nowej tablicy o rozmiarze mniejszym o 1
        char[] nowaTablica = new char[tablica.length - 1];

        // Kopiowanie elementów z wyjątkiem trzeciego
        for (int i = 0, j = 0; i < tablica.length; i++) {
            if (i != 2) {
                nowaTablica[j++] = tablica[i];
            }
        }

        return nowaTablica;
    }
}
