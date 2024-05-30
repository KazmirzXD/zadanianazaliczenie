import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Losowanie liczby od 0 do 100
        int wylosowanaLiczba = random.nextInt(101); // nextInt(101) generuje liczby od 0 do 100

        System.out.println("Zgadnij liczbę od 0 do 100:");

        int zgadywanaLiczba = -1; // Inicjalizujemy zmienną wartością spoza zakresu, aby wejść do pętli

        // Pętla do-while pozwalająca zgadywać, aż użytkownik poda poprawną liczbę
        do {
            System.out.print("Podaj swoją liczbę: ");
            zgadywanaLiczba = scanner.nextInt();

            if (zgadywanaLiczba < wylosowanaLiczba) {
                System.out.println("Podana liczba jest za mała.");
            } else if (zgadywanaLiczba > wylosowanaLiczba) {
                System.out.println("Podana liczba jest za duża.");
            } else {
                System.out.println("Gratulacje! Zgadłeś liczbę.");
            }
        } while (zgadywanaLiczba != wylosowanaLiczba);

        scanner.close();
    }
}
