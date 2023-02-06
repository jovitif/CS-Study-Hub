import java.util.Scanner;

/*
 	Calcule o somatório dos números inteiros do intervalo entre dois números. No mesmo programa,
 	implemente esse cálculo em duas funções:
 	
 		a) Resolva o problema usando estrutura de repetição.
 		b) Resolva o problema com recursividade.
 		c) Analise os pontos positivos e negativos de cada versão.
 		
 		resposta item c): usando estrutura de repetições é mais 
 		facil de entender e gasta menos tempo de execução em casos de intervalos grande. Por outro lado, usando 
 		recursividade temos uma solução mais elegante e legivel para iniciantes de logica de programação.
*/

public class Questao37 {
	public static int somatorio(int num, int num2) {
		int sum = 0;
		if(num < num2) {
			sum = num;
			for(int i = (num+1); i <= num2; i++) 
				sum = sum + i;
		}else {
			sum = num2;
			for (int i = (num2+1); i <= num; i++)
				sum = sum+i;
		}
		return sum;
	}
	
	public static int recursividade(int num, int num2) {
		if(num < num2) {
			if (num == num2) {
		       return num;
		    }
		      return num + recursividade(num + 1, num2);
		}else if(num > num2) {
			if (num == num2) {
			       return num2;
			    }
			      return num2 + recursividade(num, num2+1);
		} else {
			return num;
		}
	}
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		
		System.out.print("Digite o primeiro número:");
		int num = scanner.nextInt();
		
		System.out.print("Digite o segundo número:");
		int num2 = scanner.nextInt();
		// Resolvendo o problema usando estrutura de repetição:
		System.out.println("Somatorio do intervalo entre [" + num + "," + num2 + "] = " + somatorio(num,num2));
		// Resolvendo o problema usando recursividade:
		int result = recursividade(num,num2);
		System.out.println("Somatorio do intervalo entre [" + num + "," + num2 + "] = " + result);
		
	}
}
