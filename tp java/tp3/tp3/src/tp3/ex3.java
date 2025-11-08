package tp3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau n : ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            int somme = 0;
            for (int j = 0; j <= i; j++) {
                somme += j;
            }
            tab[i] = somme;
        }

        System.out.println("Contenu du tableau :");
        for (int val : tab) {
            System.out.print(val + " ");
        }
    }
}
