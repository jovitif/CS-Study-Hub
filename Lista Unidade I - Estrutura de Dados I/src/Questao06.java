import java.util.Scanner;

public class Questao06 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		final double REFRIGERANTE = 1.50;
		final double PIZZA = 3.00;
		final double TAXA = 0.1;
		System.out.println("Digite a quantidade de refrigerantes: ");
		byte quantRefri = scanner.nextByte();
		System.out.println("Digite a quantidade de fatias de pizza: ");
		byte quantPizza = scanner.nextByte();
		System.out.println("Digite a quantidade de pessoas na mesa: ");
		byte quantPessoas = scanner.nextByte();
		System.out.println("Total sem taxa:");
		System.out.println("Quantidade de refrigerantes " + quantRefri + ", valor do refrigerante " + REFRIGERANTE + "R$. Total: " + quantRefri*REFRIGERANTE);
		System.out.println("Quantidade de fatias de pizza " + quantPizza + ", valor do refrigerante " + PIZZA + "R$. Total: " + quantPizza*PIZZA);
		System.out.println("Total: " + (quantRefri*REFRIGERANTE + quantPizza*PIZZA) + " R$");
		
		System.out.println("Total com taxa:");
		System.out.println("Quantidade de refrigerantes " + quantRefri + ", valor do refrigerante " + REFRIGERANTE + "R$. Total: " + quantRefri*REFRIGERANTE);
		System.out.println("Quantidade de fatias de pizza " + quantPizza + ", valor do refrigerante " + PIZZA + "R$. Total: " + quantPizza*PIZZA);
		System.out.println("Taxa do garçon " + TAXA);
		System.out.println("Total: " + ((quantRefri*REFRIGERANTE + quantPizza*PIZZA) + (quantRefri*REFRIGERANTE + quantPizza*PIZZA)*TAXA)  + " R$");
		
		System.out.println("Total com taxa e por pessoa:");
		System.out.println("Quantidade de refrigerantes " + quantRefri + ", valor do refrigerante " + REFRIGERANTE + "R$. Total: " + quantRefri*REFRIGERANTE);
		System.out.println("Quantidade de fatias de pizza " + quantPizza + ", valor do refrigerante " + PIZZA + "R$. Total: " + quantPizza*PIZZA);
		System.out.println("Taxa do garçon " + TAXA);
		System.out.println("Quantidade de pessoas na mesa " + quantPessoas);
		System.out.println("Total: " + ((quantRefri*REFRIGERANTE + quantPizza*PIZZA) + (quantRefri*REFRIGERANTE + quantPizza*PIZZA)*TAXA)/quantPessoas  + " R$");
	}
}
