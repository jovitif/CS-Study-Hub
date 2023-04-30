package MetodosDiretos;
import java.util.Arrays;
public class Metododamatriztridiagonal {
	public static double[] tdma(double[] a, double[] b, double[] c, double[] d) {
		// Preliminares
		double[] cl = new double[b.length];
		double[] dl = new double[b.length];
		double[] x = new double[b.length];
		  // Recupera ordem do sistema
	    int n = b.length;

	    // Calcula cl e dl
	    cl[0] = c[0] / b[0];
	    for (int i = 1; i < n - 1; i++) {
	        cl[i] = c[i] / (b[i] - a[i] * cl[i - 1]);
	    }
	    dl[0] = d[0] / b[0];
	    for (int i = 1; i < n; i++) {
	        dl[i] = (d[i] - a[i] * dl[i - 1]) / (b[i] - a[i] * cl[i - 1]);
	    }
	    x[n - 1] = dl[n - 1];
	    for (int i = n - 2; i >= 0; i--) {
	        x[i] = dl[i] - cl[i] * x[i + 1];
	    }

	    return x;
	}

	public static void main(String[] args) {
	    double[] a = {0, 1, 1,1,1};
	    double[] b = {2, 2, 2,2,2};
	    double[] c = {1, 1, 1,1,0};
	    double[] d = {4, 4, 0,0,2};

	    double[] x = tdma(a, b, c, d);

	    System.out.printf("x = [%.1f, %.1f, %.1f, %.1f, %.1f]%n", x[0], x[1], x[2], x[3], x[4]);

	}
}
