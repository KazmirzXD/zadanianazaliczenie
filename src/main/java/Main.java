import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie ciągu znaków od użytkownika
        System.out.print("Podaj ciąg znaków: ");
        String ciag = scanner.nextLine();

        // Zliczanie liczby słów
        int liczbaSlow = zliczLiczbeSlow(ciag);

        // Wyświetlanie liczby słów
        System.out.println("Liczba słów w podanym ciągu: " + liczbaSlow);

        scanner.close();
    }

    // Metoda do zliczania liczby słów w ciągu znaków
    public static int zliczLiczbeSlow(String ciag) {
        if (ciag == null || ciag.isEmpty()) {
            return 0;
        }

        // Podział ciągu na słowa za pomocą spacji jako separatora
        String[] slowa = ciag.trim().split("\\s+");

        return slowa.length;
    }
}
