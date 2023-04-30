package MetodosIterativos;

import java.util.Arrays;
import java.util.Scanner;

/*
Veremos nessa seção dois métodos iterativos básicos para obter uma aproximação para a solução 
de um sistema linear. Geralmente em um método iterativo iniciamos com uma aproximação para a 
solução (que pode ser ruim) e vamos melhorando essa aproximação através de sucessivas iterações.
*/
public class MetodoJacob {
	public static double[] jacobi(double[][] A, double[] b, double[] x0, double tol, int N) throws Exception {
        //preliminares
        int n = A.length;
        double[] x = new double[n];
        int it = 0;
        //iteracoes
        while (it < N) {
            it++;
            //iteracao de Jacobi
            for (int i = 0; i < n; i++) {
                x[i] = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        x[i] -= A[i][j] * x0[j];
                    }
                }
                x[i] /= A[i][i];
            }
            //tolerancia
            if (normaInfinita(subtrairVetores(x, x0)) < tol) {
                return x;
            }
            //prepara nova iteracao
            x0 = Arrays.copyOf(x, n);
        }
        throw new Exception("num. max. de iteracoes excedido.");
    }
    
    public static double normaInfinita(double[] v) {
        double max = Math.abs(v[0]);
        for (int i = 1; i < v.length; i++) {
            double abs = Math.abs(v[i]);
            if (abs > max) {
                max = abs;
            }
        }
        return max;
    }
    
    public static double[] subtrairVetores(double[] v1, double[] v2) {
        double[] resultado = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            resultado[i] = v1[i] - v2[i];
        }
        return resultado;
    }
    
    public static void main(String []args) {
    	double[][] A = {{3,1,-1},{2,-4,2},{-1,2,5}};
    	double[] b = {7,4,-5};
    	double[] x0 = {0, 0, 0};
    	double tol = 1e-6;
    	int N = 1000;
    	try {
    		double[] x = jacobi(A, b, x0, tol, N);
    		System.out.println(Arrays.toString(x));
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    }
}
