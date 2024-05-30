    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {

        // Metoda do sprawdzania czy dwa ciągi znaków są anagramami
        public static boolean czyAnagram(String pierwszy, String drugi) {
            // Sprawdzenie czy długości obu ciągów są takie same
            if (pierwszy.length() != drugi.length()) {
                return false;
            }

            // Konwersja ciągów na tablice znaków i sortowanie ich
            char[] pierwszyTablica = pierwszy.toCharArray();
            char[] drugiTablica = drugi.toCharArray();
            Arrays.sort(pierwszyTablica);
            Arrays.sort(drugiTablica);

            // Porównanie posortowanych tablic znaków
            return Arrays.equals(pierwszyTablica, drugiTablica);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pobieranie dwóch ciągów od użytkownika
            System.out.print("Podaj pierwszy ciąg: ");
            String pierwszy = scanner.nextLine();

            System.out.print("Podaj drugi ciąg: ");
            String drugi = scanner.nextLine();

            // Sprawdzanie czy ciągi są anagramami
            if (czyAnagram(pierwszy, drugi)) {
                System.out.println("Podane ciągi są anagramami.");
            } else {
                System.out.println("Podane ciągi nie są anagramami.");
            }

            scanner.close();
        }
    }
