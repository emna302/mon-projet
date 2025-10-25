package ex2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Entrez le rayon du cercle : ");
        double rayon = s.nextDouble();
        cercle c = new cercle(rayon);
        System.out.println("La surface du cercle est : " + c.calculSurface());

        System.out.print("Entrez la longueur du rectangle : ");
        double longueur = s.nextDouble();
        System.out.print("Entrez la largeur du rectangle : ");
        double largeur = s.nextDouble();
        rectangle r = new rectangle(longueur, largeur);
        System.out.println("La surface du rectangle est : " + r.calculSurface());
        
    }
}
