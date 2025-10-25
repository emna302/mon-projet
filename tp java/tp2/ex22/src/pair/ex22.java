package pair;
import java.util.Scanner;
public class ex22 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");

        if (sc.hasNextInt()) {
            int nb = sc.nextInt();
            System.out.println("Vous avez saisi : " + nb);

            if (nb % 2 == 0)
                System.out.println("Le nombre est pair.");
            else
                System.out.println("Le nombre est impair.");
        } else {
            System.out.println("Erreur : ce n’est pas un nombre entier !");
        }

     
    }
}