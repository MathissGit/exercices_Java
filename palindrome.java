package hello;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		boolean isPalindrom = true;
		
		int fl = 0;
		int ll = word.length()-1;
		for (int i = 0; i <= word.length()-1; i++) {
			if(word.charAt(fl)!=word.charAt(ll)) {
				isPalindrom = false;
			}
			fl++;
			ll--;
		}
		if (isPalindrom) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("pas palindrome");
		}
	}
}
