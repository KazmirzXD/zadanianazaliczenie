import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        // Losowanie liczby oczek dla pierwszej kostki
        int kostka1 = random.nextInt(6) + 1; // Zwraca liczbę od 1 do 6
        // Losowanie liczby oczek dla drugiej kostki
        int kostka2 = random.nextInt(6) + 1; // Zwraca liczbę od 1 do 6

        System.out.println("Wynik rzutu pierwszą kostką: " + kostka1);
        System.out.println("Wynik rzutu drugą kostką: " + kostka2);

        // Porównanie wyników
        if (kostka1 == kostka2) {
            System.out.println("Wygrana! Obie kostki mają taką samą liczbę oczek.");
        } else {
            System.out.println("Przegrana. Kostki mają różne liczby oczek.");
        }
    }
}
