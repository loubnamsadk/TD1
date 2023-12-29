import java.util.Scanner;

public class EX13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un entier N : ");
        int N = scanner.nextInt();
        System.out.println("La représentation binaire de " + N + " est : " + convertirEnBinaire(N));

        scanner.close();
    }
    private static String convertirEnBinaire(int nombre) {
        return Integer.toBinaryString(nombre);
    }
}
