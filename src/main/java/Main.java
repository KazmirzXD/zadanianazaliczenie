import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Inicjalizacja tablicy liczb całkowitych
        int[] tablica = {1, 2, 3, 4, 5, 2, 6, 7, 8, 3, 9, 1};

        // Wyświetlanie oryginalnej tablicy
        System.out.println("Oryginalna tablica: ");
        for (int num : tablica) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Znajdowanie zduplikowanych wartości
        Set<Integer> zduplikowaneWartosci = znajdzZduplikowaneWartosci(tablica);

        // Wyświetlanie zduplikowanych wartości
        System.out.println("Zduplikowane wartości: " + zduplikowaneWartosci);
    }

    // Metoda do znajdowania zduplikowanych wartości w tablicy liczb całkowitych
    public static Set<Integer> znajdzZduplikowaneWartosci(int[] tablica) {
        Set<Integer> wszystkieWartosci = new HashSet<>();
        Set<Integer> zduplikowaneWartosci = new HashSet<>();

        for (int num : tablica) {
            // Jeśli wartość jest już w zbiorze wszystkieWartosci, dodaj ją do zbioru zduplikowaneWartosci
            if (!wszystkieWartosci.add(num)) {
                zduplikowaneWartosci.add(num);
            }
        }

        return zduplikowaneWartosci;
    }
}
