package Questao01;

import java.util.Scanner;

public class Questao01 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Digite o tamanho da sua pilha:");
		int tam = scanner.nextInt();
		PilhaInterface<String> pilhao = new Pilha<String>(tam);
		pilhao.coloqueAi("João");
		pilhao.coloqueAi("Maria");
		pilhao.coloqueAi("Goku");
		pilhao.coloqueAi("Batman");
		pilhao.coloqueAi("Lady Gaga");
		String valorRetorno;
		valorRetorno = pilhao.boraOlharoTopo();
		System.out.println(valorRetorno + " está no topo");
		valorRetorno = pilhao.tireAi();
		System.out.println(pilhao.boraOlharoTopo() + " está no topo");
		pilhao.vamoMostrar();
		pilhao.olhaiTamanho();
		pilhao.limparTudo();
		pilhao.vamoMostrar();
		pilhao.olhaiTamanho();
		boolean valor = pilhao.taCheio();
		System.out.print(valor);
		pilhao.coloqueAi("Samara");
		pilhao.coloqueAi("Ben 10");
		pilhao.vamoMostrar();
	}
}
