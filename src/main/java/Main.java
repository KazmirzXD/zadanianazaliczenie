import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie łańcucha znaków od użytkownika
        System.out.print("Podaj łańcuch znaków: ");
        String lancuch = scanner.nextLine();

        // Obliczanie długości łańcucha
        int dlugosc = lancuch.length();

        // Wyświetlanie długości łańcucha
        System.out.println("Długość podanego łańcucha: " + dlugosc);

        scanner.close();
    }
}
