import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie liczby całkowitej od użytkownika
        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        // Obliczanie sumy cyfr
        int sumaCyfr = obliczSumeCyfr(liczba);

        // Wyświetlanie sumy cyfr
        System.out.println("Suma cyfr w podanej liczbie: " + sumaCyfr);

        scanner.close();
    }

    // Metoda do obliczania sumy cyfr w liczbie całkowitej
    public static int obliczSumeCyfr(int liczba) {
        int suma = 0;
        liczba = Math.abs(liczba);  // obsługa liczb ujemnych

        while (liczba != 0) {
            suma += liczba % 10;  // dodawanie ostatniej cyfry do sumy
            liczba /= 10;  // usuwanie ostatniej cyfry
        }

        return suma;
    }
}
