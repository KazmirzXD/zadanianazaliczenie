import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Inicjalizacja skanera do odczytu danych wejściowych od użytkownika
        Scanner scanner = new Scanner(System.in);

        // Pobieranie danych wejściowych od użytkownika
        System.out.println("Podaj liczbę całkowitą:");
        int liczba = scanner.nextInt();

        // Odwracanie kolejności cyfr w liczbie
        int odwroconaLiczba = odwrocLiczbe(liczba);

        // Wyświetlanie odwróconej liczby
        System.out.println("Liczba z odwróconą kolejnością cyfr: " + odwroconaLiczba);

        // Zamknięcie skanera
        scanner.close();
    }

    // Metoda do odwracania kolejności cyfr w liczbie
    public static int odwrocLiczbe(int liczba) {
        int odwrocona = 0;

        while (liczba != 0) {
            int cyfra = liczba % 10;
            odwrocona = odwrocona * 10 + cyfra;
            liczba /= 10;
        }

        return odwrocona;
    }
}
