import java.util.Scanner;

public class Main {

    // Metoda obliczająca silnię w sposób iteracyjny
    public static long silniaIteracyjnie(int n) {
        long wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    // Metoda obliczająca silnię w sposób rekurencyjny
    public static long silniaRekurencyjnie(int n) {
        if (n == 0) {
            return 1;
        }
        return n * silniaRekurencyjnie(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie liczby od użytkownika
        System.out.print("Podaj liczbę do obliczenia silni: ");
        int liczba = scanner.nextInt();

        // Obliczanie silni w sposób iteracyjny
        long wynikIteracyjny = silniaIteracyjnie(liczba);
        System.out.println("Silnia (iteracyjnie) z " + liczba + " wynosi: " + wynikIteracyjny);

        // Obliczanie silni w sposób rekurencyjny
        long wynikRekurencyjny = silniaRekurencyjnie(liczba);
        System.out.println("Silnia (rekurencyjnie) z " + liczba + " wynosi: " + wynikRekurencyjny);

        scanner.close();
    }
}
