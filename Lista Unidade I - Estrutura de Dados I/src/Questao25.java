import java.util.Scanner;

/*
 * Construa um programa para ler e exibir um vetor de inteiros. Em tempo de execução, o usuário pode definir o tamanho do vetor.
 * */
public class Questao25 {
	private static Scanner scanner = new Scanner(System.in);
	public static void preencherVetor(int vet[]) {
		int tam = vet.length;
		for (int i = 0; i < tam; i++) {
			System.out.print("Digite o valor da posição [" + i + "]:");
			vet[i] = scanner.nextInt();
		}
	}
	
	private static void exibirVetor(int vet[]) 
	{
		int tam = vet.length;
		
		for (int i=0; i<tam; i++) {
			System.out.println("O valor da posição [" + i + "]:" +vet[i]);
		}
	}
	
	
	public static void main(String []args) {
		System.out.print("Digite o tamanho do vetor a ser criado:");
		int tam = scanner.nextInt();
		int vet[] = new int [tam];
		preencherVetor(vet);
		exibirVetor(vet);
	}
}
