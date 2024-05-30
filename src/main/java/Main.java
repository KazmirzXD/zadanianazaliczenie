import java.util.Scanner;

public class Main {

    // Metoda sprawdzająca, czy słowo jest palindromem
    public static boolean czyPalindrom(String slowo) {
        int dlugosc = slowo.length();
        for (int i = 0; i < dlugosc / 2; i++) {
            if (slowo.charAt(i) != slowo.charAt(dlugosc - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie słowa od użytkownika
        System.out.print("Podaj słowo: ");
        String slowo = scanner.nextLine();

        // Sprawdzanie, czy słowo jest palindromem
        if (czyPalindrom(slowo)) {
            System.out.println("Słowo " + slowo + " jest palindromem.");
        } else {
            System.out.println("Słowo " + slowo + " nie jest palindromem.");
        }

        scanner.close();
    }
}
