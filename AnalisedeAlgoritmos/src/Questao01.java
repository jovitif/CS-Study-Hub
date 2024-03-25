public class Questao01 {
	static String buscarNum(int []v, int num) {
		for(int i = 0; i < v.length; i++) {
			System.out.println("[" + v[i] + "]");
			if(v[i] == num)
				return "número encontrado";
		}
			
		return "número não encontrado";
	}
	static void preencherVetor(int []v) {
		for(int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random() * (100 - 1 + 1)) + 1;
		}
	}
	
	static int gerarNum(){
		return (int) (Math.random() * (100 - 1 + 1)) + 1;
	}
	public static void main(String []args) {
		int tam = 1000;//para 1000 elementos
		int v[] = new int[tam];
		preencherVetor(v);
		int num = gerarNum();
		System.out.println("Numero gerado: " + num);
        long inicio = System.nanoTime();
		String buscado = buscarNum(v, num);
		long fim = System.nanoTime();

        long tempoTotal = fim - inicio;
		System.out.println("O elemento foi encontrado (?): " + buscado);
        System.out.println("O tempo total foi de " + tempoTotal + " nanosegundos");

	}
}
