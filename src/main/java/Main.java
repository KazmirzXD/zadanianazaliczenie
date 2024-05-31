import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie trzech liczb od użytkownika
        System.out.print("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int liczba3 = scanner.nextInt();

        // Znajdowanie najmniejszej liczby
        int najmniejsza = liczba1;

        if (liczba2 < najmniejsza) {
            najmniejsza = liczba2;
        }

        if (liczba3 < najmniejsza) {
            najmniejsza = liczba3;
        }

        // Wyświetlanie najmniejszej liczby
        System.out.println("Najmniejsza liczba spośród podanych to: " + najmniejsza);

        scanner.close();
    }
}
