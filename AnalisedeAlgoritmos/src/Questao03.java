/*
	3. O que caracteriza o pior caso, caso médio e melhor caso 
 	do fragmento de código, a seguir? Justifique apresentando a 
 	função de complexidade que representa cada caso.
 	Pior caso: O(n)
	Caso médio: O(n/2)
	Melhor caso: O(1)
 */
public class Questao03 {
	static int calculaMenor(int V[], int n){ 
		int i, menor; 
		menor = V[0]; 
		for(i = 0; i < n; i++) 
			if (V[i] < menor) 
				menor = V[i];
						return menor; 
	}
	public static void main(String []args) {
		int V[] = {10,42,52,12,41,64, 1,23};
		int tam = V.length;
	for(int i = 0; i < tam; i++)
		System.out.println(V[i]);
	System.out.println("O menor número é " + calculaMenor(V,tam));
		
	}
}
