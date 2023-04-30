package MetodosDiretos;

import java.util.Scanner;

public class SistemasTriangulares {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.println("SOLUÇÃO DE SISTEMAS LINEARES");

		double [][]matriz = {{1,1,1},{1,0,10},{0,10,1}};
		
		
		  System.out.println("\nMATRIZ INFORMADA:");
	        for (int x = 0; x < matriz.length; x++) {
	            for (int y = 0; y < matriz.length; y++) {
	                System.out.print(matriz[x][y] + "\t");
	            }
	            System.out.println();
	        }
	        
	        // Realizando a eliminação de Gauss
	        int n = matriz.length;
	        for (int k = 0; k < n; k++) {
	        	for (int i = k+1; i < n; i++) {
	        		double m = matriz[i][k] / matriz[k][k];
	        		matriz[i][k] = 0;
	        		for (int j = k+1; j < n; j++) {
	        			matriz[i][j] = matriz[i][j] - m*matriz[k][j];
	        		}
	        	}
	        }
	        
	        // Exibindo a matriz triangular superior
	        System.out.println("\nMATRIZ TRIANGULAR SUPERIOR:");
	        for (int x = 0; x < matriz.length; x++) {
	            for (int y = 0; y < matriz[x].length; y++) {
	            	if (y < x) {
	            		System.out.print("0\t");
	            	} else {
	            		System.out.print(matriz[x][y] + "\t");
	            	}
	            }
	            System.out.println();
	        }
	}
}
