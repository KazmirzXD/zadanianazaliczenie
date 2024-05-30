public class Main {

    // Metoda sprawdzająca, czy liczba jest pierwsza
    public static boolean czyLiczbaPierwsza(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Liczby pierwsze z zakresu 1-500:");

        // Iteracja przez liczby od 2 do 500
        for (int liczba = 2; liczba <= 500; liczba++) {
            if (czyLiczbaPierwsza(liczba)) {
                System.out.print(liczba + " ");
            }
        }
    }
}
