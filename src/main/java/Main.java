    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            // Inicjalizacja skanera do odczytu danych wejściowych od użytkownika
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wprowadzaj znaki (wprowadzenie 'k' kończy program):");

            // Pętla do wczytywania i wyświetlania znaków
            while (true) {
                // Odczyt pojedynczego znaku
                char znak = scanner.next().charAt(0);

                // Sprawdzanie, czy wprowadzono 'k'
                if (znak == 'k') {
                    break;
                }

                // Wyświetlanie wprowadzonego znaku
                System.out.println("Wprowadzony znak: " + znak);
            }

            // Zamknięcie skanera
            scanner.close();
            System.out.println("Program zakończony.");
        }
    }
