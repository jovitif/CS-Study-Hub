package MetodosDiretos;

import java.util.Arrays;

// 4.1.1 Eliminação gaussiana com pivotamento parcial
public class EliminacaoGaussiana {
	public static double[] elimination(double[][] A, double[] b) {
	    int n = b.length;
	    double[] x = new double[n];

	    // Cálculo dos pivôs
	    for (int k = 1; k < n; k++) {
	        // Cálculo dos multiplicadores
	        for (int i = k+1; i <= n; i++) {
	            double m = A[i-1][k-1] / A[k-1][k-1];
	            A[i-1][k-1] = 0;
	            b[i-1] = b[i-1] - m*b[k-1];
	            // Atualização dos demais valores da linha
	            for (int j = k+1; j <= n; j++) {
	                A[i-1][j-1] = A[i-1][j-1] - m*A[k-1][j-1];
	            }
	        }
	    }

	    return b;
	}

	public static double[] solveUpperTriangular(double[][] U, double[] b) {
	    int n = b.length;
	    double[] x = new double[n];
	    x[n-1] = b[n-1] / U[n-1][n-1];

	    for (int i = n-2; i >= 0; i--) {
	        double s = 0;
	        for (int j = i+1; j < n; j++) {
	            s = s + U[i][j]*x[j];
	        }
	        x[i] = (b[i] - s) / U[i][i];
	    }

	    return x;
	}

	// Teste com dados
	public static void main(String[] args) {
	   /*
		double[][] Ai = {{3, 2, 4},
	                     {1, 1, 2},
	                     {4, 3,-2}};
	    double[] bi = {1, 2, 3};
*/
		double [][] Ai = {{1,1,1},{1,0,10},{0,10,1}};
		double[] bi = {0,-48,25};
	    // Transformando em sist. equiv.
	    double[] b = elimination(Ai, bi);
	    System.out.println("U = " + Arrays.deepToString(Ai));
	    System.out.println("b = " + Arrays.toString(b));
	    double[] x = solveUpperTriangular(Ai, b);
	    System.out.println("x = " + Arrays.toString(x));
	}
}
