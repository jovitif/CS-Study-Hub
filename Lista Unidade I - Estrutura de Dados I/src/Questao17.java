import java.util.Scanner;

public class Questao17 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Digite um número inicial:");
		int num01 = scanner.nextInt();
		System.out.print("Digite um número final:");
		int num02 = scanner.nextInt();
		int val = num01;
		
		System.out.println("Utilizando um laço while:");
		while(val <= num02) {
			if(val % 2 != 0)
			System.out.print(val + " ");
			val++;
		}
		
		System.out.println("\nUtilizando um laço do-while:");
		val = num01;
		do {
			if(val % 2 != 0)
			System.out.print(val + " ");
			val++;
		}while(val <= num02);
		
		System.out.println("\nUtilizando um laço for:");
		for(int i = num01; i <= num02; i++) {
			if(i % 2 != 0) 
			System.out.print(i + " ");
		}
	}
}
