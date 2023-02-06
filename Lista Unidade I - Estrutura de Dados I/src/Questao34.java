import java.util.Scanner;

/*
 * Construa um programa que conte a quantidade de vezes que as palavras de uma frase aparecem.
 * Exemplo: "estude muito sempre sempre estude" Resultado: estude=2 muito=1 sempre=2
 * */
public class Questao34 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Digite a sua frase:");
		String frase = scanner.nextLine();
		byte tam = 1;
		for (int i = 0; i < frase.length(); i++) 
			if(frase.charAt(i) == ' ') 
				tam++;
			
		//cria o array pra armazenar cada palavra
		Palavra[] palavrinha = new Palavra[tam];
		
		//loop para inicializar cada letra da palavra
		for (int i = 0; i < palavrinha.length; i++) {
			palavrinha[i] = new Palavra();
			palavrinha[i].palavra = frase.substring(1, 4);
			palavrinha[i].quantidade++;

		}
		
		for(int i = 0; i < palavrinha.length; i++) {
			System.out.println("vetor " + i + ":" + palavrinha[i].palavra);
		}
		
	
}
}
class Palavra{
	String palavra;
	int quantidade;
}
