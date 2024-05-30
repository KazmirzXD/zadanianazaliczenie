import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie wymiarów macierzy od użytkownika
        System.out.print("Podaj liczbę wierszy macierzy: ");
        int wiersze = scanner.nextInt();

        System.out.print("Podaj liczbę kolumn macierzy: ");
        int kolumny = scanner.nextInt();

        // Tworzenie macierzy
        int[][] macierz = new int[wiersze][kolumny];

        // Pobieranie elementów macierzy od użytkownika
        System.out.println("Podaj elementy macierzy:");

        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                System.out.print("Podaj element [" + i + "][" + j + "]: ");
                macierz[i][j] = scanner.nextInt();
            }
        }

        // Obliczanie sumy elementów macierzy
        int suma = 0;
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                suma += macierz[i][j];
            }
        }

        // Wyświetlanie sumy elementów macierzy
        System.out.println("Suma elementów macierzy: " + suma);

        scanner.close();
    }
}
