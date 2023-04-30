package MetodosDiretos;

import java.util.Scanner;

/*
	Unidade II
	Resolução de Sistemas Lineares: 
		Métodos diretos (eliminação de Gauss e Fatoração LU),
		Métodos iterativos (Método de Gauss-Jacob e Gauss-Seidel)
	Interpolação:
		Polinomial, interpolação linear, fórmula interpolatória de Lagrange,
		Fórmula interpolatória de Newton e interpolação inversa
	
*/

public class Introducao {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.println("SOLUÇÃO DE SISTEMAS LINEARES");
		System.out.print("DIGITE O NÚMERO DE LINHAS DA MATRIZ:");
		int numline = scanner.nextInt();
		double []diagonalprincipal = new double[numline];
		double [][]matriz = new double[numline][numline];
		for(int x = 0; x <numline; x++) {
			for(int y = 0;y<numline;y++) {
				matriz[x][y] = Math.random();
				if(x == y)
					diagonalprincipal[x] = matriz[x][y];
			}
		}
		
		System.out.print("\nDIGITE O VALOR DE b:");
		double []valorb = new double[numline];
		for(int x = 0; x < numline; x++) {
			valorb[x] = scanner.nextDouble();
		}
		
		
		  System.out.println("\nMATRIZ INFORMADA:");
	        for (int x = 0; x < numline; x++) {
	            for (int y = 0; y < numline; y++) {
	                System.out.print(matriz[x][y] + "\t");
	            }
	            System.out.println();
	        }
	        System.out.println("\nVALORES DA DIAGONAL: ");
	        for (int x = 0; x < numline; x++) {
	        	System.out.println(diagonalprincipal[x] + " ");
	        }
	        
	   boolean verdadeiro = false;
	   System.out.println("\nMATRIZ DE ORDEM " + numline +"x" + numline);
	   if(numline == numline)
		   verdadeiro = true;
	   System.out.println("É QUADRATICA (?): " + verdadeiro);
	   
	   System.out.println("\nMATRIZ TRANSPOSTA:");
	   for (int y = 0; y < numline; y++) {
		   for(int x = 0; x< numline; x++) {
			   System.out.print(matriz[x][y] + "\t");
		   }
		   System.out.println(" ");
	   }
	   
	   System.out.println("\nMATRIZ INDENTIDADE:");
	   double [][]matrizindentidade = new double[numline][numline];
		for(int x = 0; x <numline; x++) {
			for(int y = 0;y<numline;y++) {
				if(x == y)
					matrizindentidade[x][y] = 1;
				else
					matrizindentidade[x][y] = 0;
			}
		}
		 for (int x = 0; x < numline; x++) {
	            for (int y = 0; y < numline; y++) {
	                System.out.print(matrizindentidade[x][y] + "\t");
	            }
	            System.out.println();
	        }
		 
		 
	}
}
