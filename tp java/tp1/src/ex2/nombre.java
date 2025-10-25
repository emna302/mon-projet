package ex2;

import java.util.Scanner;

public class nombre {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
	System.out.print("donner le nombre 1:");
	int x=input.nextInt();
	
	System.out.print("donner le nombre 2:");
	int y=input.nextInt();
		
	int somme=x+y;
	System.out.println("la somme est :"+somme);
		
	}

}
