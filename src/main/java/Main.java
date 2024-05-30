import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie współczynników równania kwadratowego od użytkownika
        System.out.println("Podaj współczynniki równania kwadratowego ax^2 + bx + c = 0:");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        // Obliczanie delta
        double delta = b * b - 4 * a * c;

        // Sprawdzanie rodzaju pierwiastków
        if (delta > 0) {
            double pierwiastekDelta = Math.sqrt(delta);
            double x1 = (-b + pierwiastekDelta) / (2 * a);
            double x2 = (-b - pierwiastekDelta) / (2 * a);
            System.out.println("Równanie ma dwa pierwiastki rzeczywiste:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Równanie ma jeden podwójny pierwiastek rzeczywisty:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Równanie nie ma pierwiastków rzeczywistych.");
        }

        scanner.close();
    }
}
