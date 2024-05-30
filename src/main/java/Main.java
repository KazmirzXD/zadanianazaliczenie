import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie trzech liczb od użytkownika
        System.out.print("Podaj pierwszą liczbę: ");
        double liczba1 = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double liczba2 = scanner.nextDouble();

        System.out.print("Podaj trzecią liczbę: ");
        double liczba3 = scanner.nextDouble();

        // Znalezienie największej liczby
        double najwieksza = liczba1;

        if (liczba2 > najwieksza) {
            najwieksza = liczba2;
        }

        if (liczba3 > najwieksza) {
            najwieksza = liczba3;
        }

        // Wypisanie największej liczby
        System.out.println("Największa liczba to: " + najwieksza);

        scanner.close();
    }
}
