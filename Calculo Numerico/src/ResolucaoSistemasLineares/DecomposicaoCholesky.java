package ResolucaoSistemasLineares;

import java.util.Arrays;
import java.util.Scanner;

public class DecomposicaoCholesky {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] A = {{2, 3, 1}, {1, 2, 3}, {3, 1, 2}};
        double[] b = {9, 6, 8};
        int n = A.length;

        double[][] L = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                double sum = 0.0;
                for (int k = 0; k < j; k++) {
                    sum += L[i][k] * L[j][k];
                }
                if (i == j) {
                    L[i][j] = Math.sqrt(A[i][i] - sum);
                } else {
                    L[i][j] = (A[i][j] - sum) / L[j][j];
                }
            }
        }

        // Solving L*y = b
        double[] y = new double[n];
        for (int i = 0; i < n; i++) {
            double sum = 0.0;
            for (int j = 0; j < i; j++) {
                sum += L[i][j] * y[j];
            }
            y[i] = (b[i] - sum) / L[i][i];
        }

        // Solving L^T*x = y
        double[] x = new double[n];
        for (int i = n-1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i+1; j < n; j++) {
                sum += L[j][i] * x[j];
            }
            x[i] = (y[i] - sum) / L[i][i];
        }

        System.out.println("A matriz L é:");
        for (double[] row : L) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("As soluções para o sistema Ax = b são:");
        System.out.println("x1 = " + x[0]);
        System.out.println("x2 = " + x[1]);
        System.out.println("x3 = " + x[2]);
        System.out.println("y1 = " + y[0]);
        System.out.println("y2 = " + y[1]);
        System.out.println("y3 = " + y[2]);
    }

}
