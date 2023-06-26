package hello;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		int nbr, i;
		System.out.println("Entrez un nombre : ");
		Scanner scan = new Scanner(System.in);
		nbr = scan.nextInt();
		
		System.out.println("La table de mutliplication de " + nbr);
		
		for ( i = 1; i <= 10; i++)
		System.out.println(nbr + " x " + i + " = " + (nbr * i));
	}
}
