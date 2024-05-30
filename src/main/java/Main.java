public class Main {

    public static void main(String[] args) {
        System.out.println("Liczby Armstronga od 1 do 600:");

        for (int i = 1; i <= 600; i++) {
            if (czyLiczbaArmstronga(i)) {
                System.out.println(i);
            }
        }
    }

    // Metoda do sprawdzania czy liczba jest liczbą Armstronga
    public static boolean czyLiczbaArmstronga(int liczba) {
        int sumaPoteg = 0;
        int temp = liczba;
        int liczbaCyfr = String.valueOf(liczba).length();

        while (temp != 0) {
            int cyfra = temp % 10;
            sumaPoteg += Math.pow(cyfra, liczbaCyfr);
            temp /= 10;
        }

        return sumaPoteg == liczba;
    }
}
