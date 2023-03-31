package Questao09;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/*
 	9. Desenvolva um programa que conte as distâncias de uma cidade para todas as outras cidades. Utilize Fila.
Algoritmo:
1. Inicialize todos os elementos vetorResultado com -1, exceto o elemento da cidadeInicial, que
deve ser zero;
2. fila.adicionar( cidadeInicial );
3. Loop (while): Enquanto Fila não for vazia:
3.1. cidadeAtual = fila.remover( );
3.2. Loop (for): para cada cidade ( cidadeVisitada ):
3.2.1. distancia (aresta) = matriz[ cidadeAtual ][ cidadeVisitada ];
3.2.2. Se distancia maior que 0 e vetorResultado[ cidadeVisitada ] ainda é -1 :
vetorResultado[cidadeVisitada] = vetorResultado[cidadeAtual] + distancia;
3.2.3. fila.adicionar( cidadeVisitada )
(perceba que esta cidade entra na fila pra ser tratada como cidadeAtual em 3.1 
*/

public class Questao09 {
	
	public static void main(String[]args) {
		//int [][] matriz2 = new int[6][6];
		int[][] matriz = {
	            {0, 3, 0, 0, 0, 0},
	            {0, 0, 1, 0, 0, 0},
	            {0, 0, 0, 0, 1, 0},
	            {0, 0, 2, 0, 1, 0},
	            {1, 0, 0, 0, 0, 0},
	            {0, 1, 0, 0, 0, 0}
	        };
	        int cidadeInicial = 3;
	        int[] vetorResultado = new int[matriz.length];//vai criar um vetor de tamanho 6
	        for (int i = 0; i < vetorResultado.length; i++) {
	            vetorResultado[i] = -1; //todas as 6 posições vão receber -1
	        } 	
	        vetorResultado[cidadeInicial] = 0; //cidade iicial recebe 0
	        Queue<Integer> fila = new ArrayDeque<>();
	        fila.add(cidadeInicial);
	        while (!fila.isEmpty()) {
	            int cidadeAtual = fila.remove();
	            for (int cidadeVisitada = 0; cidadeVisitada < matriz.length; cidadeVisitada++) {
	                int distancia = matriz[cidadeAtual][cidadeVisitada];
	                if (distancia > 0 && vetorResultado[cidadeVisitada] == -1) {
	                    vetorResultado[cidadeVisitada] = vetorResultado[cidadeAtual] + distancia;
	                    fila.add(cidadeVisitada);
	                }
	            }
	        }
	        for (int i = 0; i < vetorResultado.length; i++) {
	            System.out.println("Distância da cidade " + cidadeInicial + " para a cidade " + i + ": " + vetorResultado[i]);
	        }
	}

}
