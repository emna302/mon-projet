package tp3;
import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[5];

        for (int i = 0; i < tab.length; i++) {
            System.out.print("Entrez un nombre pour la case " + i + " : ");
            tab[i] = sc.nextInt();
        }

        System.out.println("Contenu du tableau avant tri :");
        for (int n : tab) {
            System.out.print(n + " ");
        }

        Arrays.sort(tab);

   
        System.out.println("\n\nContenu du tableau après tri :");
        for (int n : tab) {
            System.out.print(n + " ");
        }
    }
}
