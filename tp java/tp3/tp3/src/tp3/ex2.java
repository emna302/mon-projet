package tp3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = {7, 5, 3, 9, 6, 1};
        System.out.print("Entrez un entier  a rechercher : ");
        int x = sc.nextInt();

        int ind = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x) {
                ind = i; 
            }
        }

        if (ind != -1)
            System.out.println("L'entier " + x + " est trouvé à l'indice " + ind);
        else
            System.out.println("L'entier " + x + " n'existe pas dans le tableau.");
    }
}
