package hello;

import java.util.Iterator;

public class counter100 {

	public static void main(String[] args) {
		long somme = 0;
		
		for (int j = 0; j <= 100; j++) {
			somme += j;
			
		}
		System.out.println("la somme des 100 premiers nombre : " + somme );
	}

}
