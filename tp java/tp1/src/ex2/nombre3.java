package ex2;
import java.util.Scanner;

public class nombre3 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Donner le nombre 1: ");
	        int a = input.nextInt();

	        System.out.print("Donner le nombre 2 : ");
	        int b = input.nextInt();

	        System.out.print("Donner le nombre 3: ");
	        int c = input.nextInt();

	        int somme = a + b + c;
	        int produit = a * b * c;
	        double moyenne = (a + b + c)/3 ;

	        System.out.println("La somme est : " + somme);
	        System.out.println("Le produit est : " + produit);
	        System.out.println("La moyenne est : " + moyenne);

	     
	    }
	

}
