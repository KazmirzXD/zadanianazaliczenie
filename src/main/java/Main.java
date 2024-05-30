import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie ciągu znaków od użytkownika
        System.out.print("Podaj ciąg znaków: ");
        String ciag = scanner.nextLine();

        // Zliczanie znaków interpunkcyjnych
        int liczbaZnakowInterpunkcyjnych = 0;
        for (int i = 0; i < ciag.length(); i++) {
            char znak = ciag.charAt(i);
            if (Character.isLetterOrDigit(znak)) {
                continue; // Pomijamy litery i cyfry
            }
            // Sprawdzamy, czy znak jest znakiem interpunkcyjnym
            if (znak == '!' || znak == '"' || znak == '#' || znak == '$' || znak == '%' || znak == '&' ||
                znak == '\'' || znak == '(' || znak == ')' || znak == '*' || znak == '+' || znak == ',' ||
                znak == '-' || znak == '.' || znak == '/' || znak == ':' || znak == ';' || znak == '<' ||
                znak == '=' || znak == '>' || znak == '?' || znak == '@' || znak == '[' || znak == '\\' ||
                znak == ']' || znak == '^' || znak == '_' || znak == '`' || znak == '{' || znak == '|' ||
                znak == '}' || znak == '~') {
                liczbaZnakowInterpunkcyjnych++;
            }
        }

        // Wyświetlanie liczby znaków interpunkcyjnych
        System.out.println("Liczba znaków interpunkcyjnych w podanym ciągu: " + liczbaZnakowInterpunkcyjnych);

        scanner.close();
    }
}
