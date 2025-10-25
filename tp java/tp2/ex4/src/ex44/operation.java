package ex44;
import java.util.Scanner;

public class  operation {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Entrez  nombre 1: ");
        double a = s.nextDouble();

        System.out.print("Entrez l'opérateur (+, -, *, /) : ");
        char op = s.next().charAt(0);

        System.out.print("Entrez le nombre 2 : ");
        double b = s.nextDouble();

        double resultat = 0;

        if (op == '+')
            resultat = a + b;
        else if (op == '-')
            resultat = a - b;
        else if (op == '*')
            resultat = a * b;
        else if (op == '/') {
            if (b != 0)
                resultat = a / b;
            else {
                System.out.println("Erreur : division par zéro !");
                
            }
        } else {
            System.out.println("Erreur : opérateur invalide !");
            return;
        }

        System.out.println("Résultat = " + resultat);
    }
}
