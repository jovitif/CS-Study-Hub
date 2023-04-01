package DesafiosLeetCode;

import java.util.Scanner;

public class ReverseString {
	
	public static void reverseString(char[] s) {
        for(int i = 0; i < (s.length/2); i++){ 
            char temp = s[i]; 
            s[i] = s[s.length -1 - i];
            s[s.length - 1 - i] = temp;
        }   
    }
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String []args) {
		System.out.print("Digite uma palavra: ");
		String palavra = scanner.nextLine();
		char [] vetorPalavra = palavra.toCharArray();
		reverseString(vetorPalavra);
		System.out.print("Palavra invertida: " + vetorPalavra);
	}
}
