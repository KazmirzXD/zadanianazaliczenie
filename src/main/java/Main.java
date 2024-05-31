import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Inicjalizacja dwóch tablic znakowych
        char[] tablica1 = {'a', 'b', 'c', 'd', 'e'};
        char[] tablica2 = {'c', 'd', 'e', 'f', 'g'};

        // Wyświetlanie oryginalnych tablic
        System.out.println("Tablica 1: " + new String(tablica1));
        System.out.println("Tablica 2: " + new String(tablica2));

        // Znajdowanie wspólnych elementów
        Set<Character> wspolneElementy = znajdzWspolneElementy(tablica1, tablica2);

        // Wyświetlanie wspólnych elementów
        System.out.println("Wspólne elementy: " + wspolneElementy);
    }

    // Metoda do znajdowania wspólnych elementów między dwiema tablicami znakowymi
    public static Set<Character> znajdzWspolneElementy(char[] tablica1, char[] tablica2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        // Dodawanie elementów pierwszej tablicy do zbioru
        for (char c : tablica1) {
            set1.add(c);
        }

        // Dodawanie elementów drugiej tablicy do zbioru
        for (char c : tablica2) {
            set2.add(c);
        }

        // Zachowywanie tylko wspólnych elementów
        set1.retainAll(set2);

        return set1;
    }
}
