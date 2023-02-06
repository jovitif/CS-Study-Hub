import java.util.Scanner;

/*
 * Construa e use uma função que produz um novo vetor de inteiros
 * com a ordem inversa do vetor original passado por parâmetro.
 * */
public class Questao27 {
	public static void preencherVetor(int vet[]) {
		int tam = vet.length;
		for(int i = 0; i < tam; i++) {
			System.out.print("Digite a posição ["+i+"]:");
			vet[i] = scanner.nextInt();
		}
	}
	
	public static void mostrarVetor(int vet[]) {
		int tam = vet.length;
		for(int i = 0; i< tam; i++) {
			System.out.println("A posição ["+i+"]:" + vet[i]);
		}
	}
	
	public static int[] trocarVetor(int vet[]) {
		int tam = vet.length;
		int []copia = new int[tam];
		for (int i = 0; i< tam; i++) {
			copia[i] = vet[(tam-1) - i];
		}
		return copia;
	}
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Digite o tamanho do vetor:");
		int tam = scanner.nextInt();
		int vet[] = new int[tam];
		preencherVetor(vet);
		System.out.println("Vetor em ordem:");
		mostrarVetor(vet);
		int vetorCopia[] = trocarVetor(vet);
		System.out.println("Vetor trocado:");
		mostrarVetor(vetorCopia);
	}
}
