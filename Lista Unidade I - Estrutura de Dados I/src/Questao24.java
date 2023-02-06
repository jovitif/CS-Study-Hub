import java.util.Scanner;

public class Questao24 {
	private static Scanner scanner = new Scanner(System.in);
	
	  public static double potencial(double numero, int potencia) {
	    	return Math.pow(numero, potencia);
	  }
	  
	  public static double raizQuadrada(double numero) {
		  return Math.sqrt(numero);
	  }
	  
	  public static int fatorial(int numero) {
		  int resultado = 1;
		  System.out.print(numero + "! = ");
          for (int i = 1; i <= numero; i++) {
        	  resultado *= i;
        	  System.out.print(i + "*");
          }
          System.out.print(" = ");
          return resultado;
	  }
	  
	public static void main(String []args) {
		int opcao;
	    double numero;

	  
	    do {
	      System.out.println("Calculadora");
	      System.out.println("1 - Potência");
	      System.out.println("2 - Raiz quadrada");
	      System.out.println("3 - Fatorial");
	      System.out.println("0 - Sair");
	      System.out.print("Escolha uma opção: ");
	      opcao = scanner.nextInt();

	      switch (opcao) {
	        case 1:
	          System.out.print("Insira o número: ");
	          numero = scanner.nextDouble();
	          System.out.print("Insira a potência: ");
	          int potencia = scanner.nextInt();
	          System.out.println(potencial(numero,potencia));
	          break;
	        case 2:
	          System.out.print("Insira o número: ");
	          numero = scanner.nextDouble();
	          System.out.println(raizQuadrada(numero));
	          break;
	        case 3:
	          System.out.print("Insira o número: ");
	          int numerofatorial = scanner.nextInt();
	          
	          System.out.println(fatorial(numerofatorial));
	          break;
	        case 0:
	          System.out.println("Saindo da calculadora...");
	          break;
	        default:
	          System.out.println("Opção inválida.");
	      }
	    } while (opcao != 0);
	}
}
