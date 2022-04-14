package com.masai;

import java.util.Scanner;

public class Vowel {
	
	void VowelConsonent(char x) {
		int n=(int)x;
		if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' ||  x == 'A' ||  x == 'E' ||  x == 'I' ||  x == 'O' || x == 'U')
				System.out.println("Vowel");
		else if ((n>=65 && n<=90) || (n>=97 && n<=122) )
			System.out.println("Consonant");
		else
			System.out.println("invalid character");
}

	
	
	public static void main(String[] args) {
		
		Vowel obj = new Vowel();
		obj.VowelConsonent('U');
		obj.VowelConsonent('s');
		obj.VowelConsonent('@');

	
	}
}
