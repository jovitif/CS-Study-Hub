import java.util.Scanner;

/*
 * Construa um prorgama pra ler e exibir uma matriz de inteiros.
 * Em tempo de execução, o usuário pode definir o tamanho da matriz
 * */

public class Questao26 {
	public static void preencherMatriz(int [][]matriz) {
		int linhas = matriz.length;
		int colunas = matriz[0].length;
		for (int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				System.out.print("Digite o valor da posição ["+i+"]["+j+"]:");
				matriz[i][j] = scanner.nextInt();
			}
		}
	}
	
	public static void mostrarMatriz(int [][]matriz) {
		int linhas = matriz.length;
		int colunas = matriz[0].length;
		for (int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				System.out.println("O valor da posição ["+i+"]["+j+"]:" + matriz[i][j]);
			}
		}
	}
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Digite o número de linhas da matriz:");
		int numl = scanner.nextInt();
		System.out.print("Digite o número de colunas da matriz:");
		int numc = scanner.nextInt();
		int matriz[][] = new int[numl][numc];
		preencherMatriz(matriz);
		mostrarMatriz(matriz);
	}
}
