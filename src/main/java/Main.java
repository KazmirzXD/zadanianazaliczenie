import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie równania od użytkownika
        System.out.print("Podaj równanie w postaci 'ax + b = c': ");
        String rownanie = scanner.nextLine();

        // Usunięcie białych znaków z równania
        rownanie = rownanie.replaceAll("\\s", "");

        // Sprawdzanie, czy równanie jest liniowe
        boolean czyLiniowe = czyRownanieLiniowe(rownanie);

        // Wyświetlanie wyniku
        if (czyLiniowe) {
            System.out.println("Podane równanie jest równaniem liniowym.");
        } else {
            System.out.println("Podane równanie nie jest równaniem liniowym.");
        }

        scanner.close();
    }

    // Metoda do sprawdzania czy równanie jest równaniem liniowym
    public static boolean czyRownanieLiniowe(String rownanie) {
        // Sprawdzenie czy równanie zawiera 'x'
        if (!rownanie.contains("x")) {
            return false;
        }

        // Podział równania na lewą i prawą stronę
        String[] strony = rownanie.split("=");

        // Sprawdzenie, czy obie strony zawierają 'x'
        if (strony.length != 2 || strony[0].indexOf('x') == -1 || strony[1].indexOf('x') == -1) {
            return false;
        }

        // Podział lewej strony na 'ax' i 'b'
        String[] lewaStrona = strony[0].split("x");

        // Sprawdzenie czy 'ax' jest liczbą
        try {
            Double.parseDouble(lewaStrona[0]);
        } catch (NumberFormatException e) {
            return false;
        }

        // Sprawdzenie czy 'b' jest liczbą
        try {
            Double.parseDouble(lewaStrona[1]);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}
