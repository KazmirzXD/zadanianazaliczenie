import java.util.Scanner;

public class Main {

    // Metoda obliczająca NWD za pomocą algorytmu Euklidesa
    public static int nwd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Metoda obliczająca NWW dwóch liczb
    public static int nww(int a, int b) {
        return Math.abs(a * b) / nwd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie dwóch liczb od użytkownika
        System.out.print("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();

        // Obliczanie NWW
        int wynik = nww(liczba1, liczba2);
        System.out.println("Największa Wspólna Wielokrotność (NWW) " + liczba1 + " i " + liczba2 + " wynosi: " + wynik);

        scanner.close();
    }
}
