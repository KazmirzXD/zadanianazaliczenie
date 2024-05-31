import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Inicjalizacja skanera do odczytu danych wejściowych od użytkownika
        Scanner scanner = new Scanner(System.in);

        // Pobieranie danych wejściowych od użytkownika
        System.out.println("Podaj znak:");
        char znak = scanner.next().toLowerCase().charAt(0);

        // Sprawdzanie, czy znak jest samogłoską czy spółgłoską
        if (czySamogloska(znak)) {
            System.out.println("Podany znak to samogłoska.");
        } else if (czySpolgloska(znak)) {
            System.out.println("Podany znak to spółgłoska.");
        } else {
            System.out.println("Podany znak nie jest ani samogłoską, ani spółgłoską.");
        }

        // Zamknięcie skanera
        scanner.close();
    }

    // Metoda sprawdzająca, czy znak jest samogłoską
    public static boolean czySamogloska(char znak) {
        return "aeiouy".indexOf(znak) != -1;
    }

    // Metoda sprawdzająca, czy znak jest spółgłoską
    public static boolean czySpolgloska(char znak) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(znak) != -1;
    }
}
