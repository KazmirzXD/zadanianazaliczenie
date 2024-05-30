import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");

        // Wczytanie liczby od użytkownika
        double liczba = scanner.nextDouble();

        // Sprawdzenie, czy liczba jest dodatnia, ujemna czy zero
        if (liczba > 0) {
            System.out.println("Liczba jest dodatnia.");
        } else if (liczba < 0) {
            System.out.println("Liczba jest ujemna.");
        } else {
            System.out.println("Liczba jest zerem.");
        }

        scanner.close();
    }
}
