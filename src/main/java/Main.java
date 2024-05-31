import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Inicjalizacja skanera do odczytu danych wejściowych od użytkownika
        Scanner scanner = new Scanner(System.in);

        // Pobieranie danych wejściowych od użytkownika
        System.out.println("Podaj liczbę:");
        String input = scanner.nextLine();

        // Sprawdzanie, czy podana wartość jest liczbą całkowitą
        if (czyLiczbaCalkowita(input)) {
            System.out.println("Podana wartość jest liczbą całkowitą.");
        } else {
            System.out.println("Podana wartość nie jest liczbą całkowitą.");
        }

        // Zamknięcie skanera
        scanner.close();
    }

    // Metoda do sprawdzania, czy podana wartość jest liczbą całkowitą
    public static boolean czyLiczbaCalkowita(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
