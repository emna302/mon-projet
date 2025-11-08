package tp3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre d'élèves : ");
        int n = sc.nextInt();

        double[] notes = new double[n];
        double somme = 0;
        double min = 20, max = 0;
 
        
        for (int i = 0; i < n; i++) {
            System.out.print("note de l'élève " + (i + 1) + " : ");
            notes[i] = sc.nextDouble();
            somme += notes[i];
            if (notes[i] < min) min = notes[i];
            if (notes[i] > max) max = notes[i];
        }

        double moyenne = somme / n;

        System.out.println("Somme des notes : " + somme);
        System.out.println("note maximale : " + max);
        System.out.println("note minimale : " + min);
        System.out.println("moyenne : " + moyenne);
    }
}

