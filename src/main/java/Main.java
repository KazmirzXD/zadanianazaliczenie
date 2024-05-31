import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Inicjalizacja skanera do odczytu danych wejściowych od użytkownika
        Scanner scanner = new Scanner(System.in);

        // Pobieranie danych wejściowych od użytkownika
        System.out.println("Podaj łańcuch znaków:");
        String lancuch = scanner.nextLine();

        // Usuwanie wszystkich spacji z łańcucha
        String bezSpacji = usunSpacje(lancuch);

        // Wyświetlanie wyniku
        System.out.println("Łańcuch bez spacji: " + bezSpacji);

        // Zamknięcie skanera
        scanner.close();
    }

    // Metoda do usuwania wszystkich spacji z łańcucha znaków
    public static String usunSpacje(String lancuch) {
        return lancuch.replace(" ", "");
    }
}
