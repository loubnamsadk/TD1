import java.util.Scanner;

public class EX10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un entier N : ");
        int N = scanner.nextInt();
        int somme = 0;
        for (int i = 1; i < N; i += 2) {
            somme += i;
        }

        System.out.println("La somme des entiers impairs inférieurs à " + N + " est : " + somme);

        scanner.close();
    }
}

