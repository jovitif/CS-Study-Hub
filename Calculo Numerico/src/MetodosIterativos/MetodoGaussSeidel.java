package MetodosIterativos;

import java.util.Arrays;
import java.util.Scanner;

public class MetodoGaussSeidel {
	public static class SistemaEquacoesLineares {
	    private double[][] matrizCoeficientes;
	    private double[] vetorTermosIndependentes;
		public double[][] getMatrizCoeficientes() {
			return matrizCoeficientes;
		}
		public void setMatrizCoeficientes(double[][] matrizCoeficientes) {
			this.matrizCoeficientes = matrizCoeficientes;
		}
		public double[] getVetorTermosIndependentes() {
			return vetorTermosIndependentes;
		}
		public void setVetorTermosIndependentes(double[] vetorTermosIndependentes) {
			this.vetorTermosIndependentes = vetorTermosIndependentes;
		}
		public SistemaEquacoesLineares(double[][] matrizCoeficientes, double[] vetorTermosIndependentes) {
			this.matrizCoeficientes = matrizCoeficientes;
			this.vetorTermosIndependentes = vetorTermosIndependentes;
		}
	}
	
	public static double[] gaussSeidel(SistemaEquacoesLineares sistema, double precisao, int maxIteracoes) {
	    int n = sistema.getMatrizCoeficientes().length;
	    double[] solucaoAnterior = new double[n];
	    double[] solucaoAtual = new double[n];
	    int iteracoes = 0;
	    double erro = Double.MAX_VALUE;
	    
	    // Inicializa a solução com zeros
	    for (int i = 0; i < n; i++) {
	        solucaoAtual[i] = 0;
	    }
	    
	    while (erro > precisao && iteracoes < maxIteracoes) {
	        // Atualiza a solução
	        for (int i = 0; i < n; i++) {
	            double soma = 0;
	            for (int j = 0; j < n; j++) {
	                if (j != i) {
	                    soma += sistema.getMatrizCoeficientes()[i][j] * solucaoAtual[j];
	                }
	            }
	            solucaoAnterior[i] = solucaoAtual[i];
	            solucaoAtual[i] = (sistema.getVetorTermosIndependentes()[i] - soma) / sistema.getMatrizCoeficientes()[i][i];
	        }
	        
	        // Calcula o erro
	        erro = 0;
	        for (int i = 0; i < n; i++) {
	            double diff = Math.abs(solucaoAtual[i] - solucaoAnterior[i]);
	            if (diff > erro) {
	                erro = diff;
	            }
	        }
	        
	        iteracoes++;
	    }
	    
	    if (iteracoes == maxIteracoes && erro > precisao) {
	        throw new RuntimeException("O método não convergiu.");
	    }
	    
	    return solucaoAtual;
	}
	
	public static void main(String[] args) {
	    double[][] matrizCoeficientes = {{10, 1}, {1, 8}};
	    double[] vetorTermosIndependentes = {23, 26};
	    SistemaEquacoesLineares sistema = new SistemaEquacoesLineares(matrizCoeficientes, vetorTermosIndependentes);;
	    double precisao = 0.0001;
	    int maxIteracoes = 1000;
	    double[] solucao = gaussSeidel(sistema, precisao, maxIteracoes);
	    System.out.println(Arrays.toString(solucao));
	}
	
}
