import java.util.Scanner;

/*
 *Construa um programa que identifique o maior e o menor número de um vetor de inteiros 
 * */

public class Questao28 {
	private static Scanner scanner = new Scanner(System.in);
	
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
	
	public static int encontrarMaior(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }
	
	public static int encontrarMenor(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor; 
    }

	
	public static void main(String []args) {
		System.out.print("Digite o tamanho do vetor:");
		int tam = scanner.nextInt();
		int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		int vet[] = new int[tam];
		preencherVetor(vet);
		System.out.println("Vetor em ordem:");
		mostrarVetor(vet);
		maior = encontrarMaior(vet);
		menor = encontrarMenor(vet);
		System.out.print("Maior valor do vetor:" + maior + "\n");
		System.out.print("Menor valor do vetor:" + menor);
	}
}
