import java.util.Scanner;

public class Main {

    // Metoda przeliczająca prędkość z m/s na km/h
    public static double przeliczPredkosc(double predkoscMs) {
        return predkoscMs * 3.6;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie prędkości od użytkownika w m/s
        System.out.print("Podaj prędkość w metrach na sekundę (m/s): ");
        double predkoscMs = scanner.nextDouble();

        // Przeliczanie prędkości na km/h
        double predkoscKmh = przeliczPredkosc(predkoscMs);
        System.out.println("Prędkość w kilometrach na godzinę (km/h) wynosi: " + predkoscKmh);

        scanner.close();
    }
}
