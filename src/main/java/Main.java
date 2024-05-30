            import java.util.Scanner;

            public class Main {

                // Metoda sprawdzająca, czy rok jest przestępny
                public static boolean czyRokPrzestepny(int rok) {
                    if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
                        return true;
                    } else {
                        return false;
                    }
                }

                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);

                    // Pobieranie roku od użytkownika
                    System.out.print("Podaj rok: ");
                    int rok = scanner.nextInt();

                    // Sprawdzanie, czy rok jest przestępny
                    if (czyRokPrzestepny(rok)) {
                        System.out.println("Rok " + rok + " jest rokiem przestępnym.");
                    } else {
                        System.out.println("Rok " + rok + " nie jest rokiem przestępnym.");
                    }

                    scanner.close();
                }
            }
