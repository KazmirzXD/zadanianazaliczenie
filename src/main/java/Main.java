import java.util.Scanner;

public class Main {

    // Metoda sprawdzająca płeć na podstawie numeru PESEL
    public static String okreslPlec(String pesel) {
        // Sprawdzanie, czy PESEL ma długość 11 znaków
        if (pesel.length() != 11) {
            return "Nieprawidłowy numer PESEL.";
        }

        // Pobieranie 10-tego znaku z PESEL-u, który określa płeć
        char znakPlec = pesel.charAt(9);

        // Konwertowanie znaku na cyfrę
        int cyfraPlec = Character.getNumericValue(znakPlec);

        // Określanie płci na podstawie cyfry: parzysta - kobieta, nieparzysta - mężczyzna
        if (cyfraPlec % 2 == 0) {
            return "Płeć: Kobieta";
        } else {
            return "Płeć: Mężczyzna";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie numeru PESEL od użytkownika
        System.out.print("Podaj numer PESEL: ");
        String pesel = scanner.nextLine();

        // Określanie płci na podstawie PESEL-u
        String plec = okreslPlec(pesel);
        System.out.println(plec);

        scanner.close();
    }
}
