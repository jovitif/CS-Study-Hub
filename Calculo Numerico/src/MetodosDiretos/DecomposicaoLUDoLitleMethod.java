package MetodosDiretos;

import java.util.Arrays;
import java.util.Scanner;

public class DecomposicaoLUDoLitleMethod {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] A = {{1, 1, 1}, {2, 1, -1}, {2, -1, 1}};
        double[] b = {-2, 1, 3};
        int n = A.length;

        double[][] L = new double[n][n];
        double[][] U = new double[n][n];

        for (int j = 0; j < n; j++) {
            L[j][j] = 1.0;
            for (int i = 0; i <= j; i++) {
                double s1 = 0.0;
                for (int k = 0; k < i; k++) {
                    s1 += U[k][j] * L[i][k];
                }
                U[i][j] = A[i][j] - s1;
            }
            for (int i = j+1; i < n; i++) {
                double s2 = 0.0;
                for (int k = 0; k < j; k++) {
                    s2 += U[k][j] * L[i][k];
                }
                L[i][j] = (A[i][j] - s2) / U[j][j];
            }
        }

        double[] y = new double[n];
        for (int i = 0; i < n; i++) {
            double s = 0.0;
            for (int j = 0; j < i; j++) {
                s += L[i][j] * y[j];
            }
            y[i] = b[i] - s;
        }

        double[] x = new double[n];
        for (int i = n-1; i >= 0; i--) {
            double s = 0.0;
            for (int j = i+1; j < n; j++) {
                s += U[i][j] * x[j];
            }
            x[i] = (y[i] - s) / U[i][i];
        }

        System.out.println("A matriz L é:");
        for (double[] row : L) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("A matriz U é:");
        for (double[] row : U) {
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