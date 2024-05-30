import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie daty urodzenia od użytkownika
        System.out.print("Podaj rok urodzenia (YYYY): ");
        int rok = scanner.nextInt();

        System.out.print("Podaj miesiąc urodzenia (MM): ");
        int miesiac = scanner.nextInt();

        System.out.print("Podaj dzień urodzenia (DD): ");
        int dzien = scanner.nextInt();

        // Tworzenie obiektu LocalDate dla daty urodzenia
        LocalDate dataUrodzenia = LocalDate.of(rok, miesiac, dzien);
        // Tworzenie obiektu LocalDate dla bieżącej daty
        LocalDate dzisiaj = LocalDate.now();

        // Obliczanie wieku
        Period wiek = Period.between(dataUrodzenia, dzisiaj);

        // Wyświetlanie wyniku
        System.out.println("Obecny wiek: " + wiek.getYears() + " lat");

        scanner.close();
    }
}
