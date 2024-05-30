          import java.util.Scanner;

          public class Main {

              // Stały kurs wymiany
              private static final double KURS_PLN_NA_EUR = 4.50;
              private static final double KURS_EUR_NA_PLN = 1 / KURS_PLN_NA_EUR;

              // Metoda konwertująca z PLN na EUR
              public static double konwertujPlnNaEur(double kwotaPln) {
                  return kwotaPln / KURS_PLN_NA_EUR;
              }

              // Metoda konwertująca z EUR na PLN
              public static double konwertujEurNaPln(double kwotaEur) {
                  return kwotaEur * KURS_PLN_NA_EUR;
              }

              public static void main(String[] args) {
                  Scanner scanner = new Scanner(System.in);

                  System.out.println("Kalkulator walutowy:");
                  System.out.println("1. Konwersja z PLN na EUR");
                  System.out.println("2. Konwersja z EUR na PLN");
                  System.out.print("Wybierz opcję (1 lub 2): ");
                  int opcja = scanner.nextInt();

                  if (opcja == 1) {
                      // Konwersja z PLN na EUR
                      System.out.print("Podaj kwotę w PLN: ");
                      double kwotaPln = scanner.nextDouble();
                      double wynik = konwertujPlnNaEur(kwotaPln);
                      System.out.printf("Kwota w EUR: %.2f%n", wynik);
                  } else if (opcja == 2) {
                      // Konwersja z EUR na PLN
                      System.out.print("Podaj kwotę w EUR: ");
                      double kwotaEur = scanner.nextDouble();
                      double wynik = konwertujEurNaPln(kwotaEur);
                      System.out.printf("Kwota w PLN: %.2f%n", wynik);
                  } else {
                      System.out.println("Nieprawidłowa opcja. Wybierz 1 lub 2.");
                  }

                  scanner.close();
              }
          }
