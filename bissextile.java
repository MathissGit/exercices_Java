package hello;

import java.util.Scanner;

public class bissextile {

	public static void main(String[] args) {
		boolean isRunning = true;
		int choix = 0;
		while(isRunning) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Année : ");
			int year = scan.nextInt();
			if((year % 4 == 0)||(year % 400 == 0 && year % 100 != 0)) {
				System.out.println("l'année " + year +" est bissextile");
			}
			else {
				System.out.println("l'année " + year +" n'est pas bissextile");
			}
			System.out.println("Voulez-vous continuer ? 1 - Oui 2 - Non");
			choix = scan.nextInt();
			if(choix !=1 && choix!=2) {
				System.out.println("Mauvaise saisie. Voulez-vous continuer ? 1 - Oui 2 - Non");
				choix = scan.nextInt();
			} 
			if (choix == 2) {
				isRunning = false;
			}			
		}
			
	}

}
