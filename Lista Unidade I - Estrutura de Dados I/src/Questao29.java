public class Questao29 {
	private static int[] array = { 8, 2, 1, 6, 5 }; //inicializa o arrya com os numero
	private static int indice = 2; //define o índice a ser movido

	public static void main(String[] args) {
		System.out.println("Entrada: ");
		//imprime o array de entrada
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}

		//  move o número da posição do indice para a primeira posição, caso seja necessário
		while (indice > 0 && (array[indice] < array[indice - 1])) {
			//armazena o número na posição indice em uma variável temporária
			int temp = array[indice];
			// move o número da posição indice - 1  para a posição indice
			array[indice] = array[indice - 1];
			//move o número armazenado na variável temporária para a posição indice -1
			array[indice - 1] = temp;
			//decrementa o índice para continuar comparando e movendo o número
			indice--;
		}

		System.out.println("\nSaida: ");
		//imprime o array de saída
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
	}
}