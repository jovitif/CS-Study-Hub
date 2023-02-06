import java.util.Scanner;

/*
 *	Construa um programa que inverta a frase digitada pelo usuário. Por exemplo, 
 *	se string1 for "bom dia", então string2 será "aid mob". 
 * */

public class Questao30 {
	private static Scanner scanner = new Scanner(System.in);
	private static char[] inverterString(String frase) {
		 char[] invertida = frase.toCharArray();
		 for (int i = 0, j = invertida.length - 1; i < j; i++, j--) {
		      char temp = invertida[i];
		      invertida[i] = invertida[j];
		      invertida[j] = temp;
		    }
		return invertida;
	}
	public static void main(String []args) {
		System.out.print("Digite uma frase:");
		String frase = scanner.nextLine();
		System.out.println("Sua frase:" + frase);
		char[] invertida = inverterString(frase);
		System.out.println("Frase invertida:" + new String(invertida));
	}
}
