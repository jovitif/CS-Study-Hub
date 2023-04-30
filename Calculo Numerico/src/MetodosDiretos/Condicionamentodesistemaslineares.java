package MetodosDiretos;

public class Condicionamentodesistemaslineares {
	public static void main(String []args) {
		double lambda;
		 double[][] A = {{71, 41}, {0.0, 30}};
		 double []b = {100,70};
		 A[1][0] = (A[0][0] * A[1][1])/A[0][1];
		 lambda = A[1][0];
		 System.out.print("Valor de Lamda " + lambda + "\n");
		 int resultado = (int) Math.floor(lambda);
		 int resultado2 = (int) Math.ceil(lambda);
		 double[][] B = {{71, 41}, {resultado, 30}};
		 double[][] C = {{71, 41}, {resultado2, 30}};
		 //Norma de vetores
		 int vet[] = {1, 2, -3, 0};
		 for (int i = 0; i < vet.length; i++) {
			    if (vet[i] < 0) {
			        vet[i] = -vet[i];
			    }
			}
		 int infinito = vet[0];
		 System.out.print("Norma L1: ");
		 int sum = 0;
		 int sum2 = 0;
		 for(int i = 0; i < vet.length; i++) {
			 sum = sum + vet[i];
			 sum2 = sum2 + (vet[i] * vet[i]);
		 }
		 System.out.print(sum + "\n");
		 System.out.print("Norma L2: raiz de " + sum2 +" = " + Math.sqrt(sum2) + "\n");
		 for (int i = 1; i < vet.length; i++) {
			    if (vet[i] > infinito) {
			        infinito = vet[i];
			    }
			}

			System.out.println("Norma L3: " + infinito);
			//Norma de matrizes
			int [][] vet2 = {{3,-5,7},
							{1,-2,4},
							{-8,1,-7}};
			
			for (int i = 0; i < vet2.length; i++) {
			    for (int j = 0; j < vet2[i].length; j++) {
			        if (vet2[i][j] < 0) {
			            vet2[i][j] = -vet2[i][j];
			        }
			    }
			}
			
			
			int maxSum = Integer.MIN_VALUE; // inicializa com o menor valor possível
			for (int j = 0; j < vet2[0].length; j++) { // itera pelas colunas
			    int colSum = 0; // inicializa a soma da coluna
			    for (int i = 0; i < vet2.length; i++) { // itera pelas linhas
			        colSum += vet2[i][j]; // soma o valor da célula à soma da coluna
			    }
			    if (colSum > maxSum) { // se a soma da coluna atual for maior que o valor máximo encontrado até agora
			        maxSum = colSum; // atualiza o valor máximo
			    }
			}
			System.out.println("Maior valor de soma das colunas: " + maxSum);
			
			int maxSum2 = Integer.MIN_VALUE; // inicializa com o menor valor possível
			for (int i = 0; i < vet2.length; i++) { // itera pelas linhas
			    int rowSum = 0; // inicializa a soma da linha
			    for (int j = 0; j < vet2[i].length; j++) { // itera pelas colunas
			        if (vet2[i][j] < 0) { // se o valor for negativo, transforma em positivo
			            vet2[i][j] = -vet2[i][j];
			        }
			        rowSum += vet2[i][j]; // soma o valor da célula à soma da linha
			    }
			    if (rowSum > maxSum2) { // se a soma da linha atual for maior que o valor máximo encontrado até agora
			        maxSum2 = rowSum; // atualiza o valor máximo
			    }
			}
			System.out.println("Maior valor de soma das linhas: " + maxSum2);
	}
		 
}

