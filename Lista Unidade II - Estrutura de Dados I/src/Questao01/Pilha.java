package Questao01;

import java.util.Arrays;

public class Pilha <Generico> implements PilhaInterface <Generico> {
	private int valorTopo;
	private int tamanho;
	private Object []Array;

	public Pilha(int tamanho) {
		this.valorTopo = -1;
		this.tamanho = tamanho;
		this.Array = new Object[tamanho];
	}

	public boolean taCheio() {
		if(valorTopo == tamanho - 1) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void coloqueAi(Generico valor) throws Excessao{
		System.out.println("\n\nColocando elemento na pilha...\n\n");
		if(taCheio()) {
			throw new Excessao("\nERRO: Pilha com capacidade máxima atingida valor=["+valor+"]!!!\n");
		}
		valorTopo = valorTopo + 1;
		Array[valorTopo] = valor;
	}
	
	public boolean taVazio() {
		if(valorTopo == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	@SuppressWarnings("unchecked")
	public Generico boraOlharoTopo() throws Excessao{
		if(taVazio()) {
			throw new Excessao("\nErro: pilha vazia!\n");
		}
		Generico valorRetorno = (Generico) Array[valorTopo];
		return valorRetorno;
	}
	
	@SuppressWarnings("unchecked")
	public Generico tireAi() throws Excessao{
		System.out.println("Retirando o ultimo elemento...");
		Generico retorno;
		if(taVazio()) {
			throw new Excessao("\nErro: pilha vazia!");
		}
		retorno = (Generico) Array[valorTopo];
		valorTopo = valorTopo -1;
		return retorno;
	}
	
	public void vamoMostrar() {
		int i;
		System.out.println("Mostrando todos os elementos da pilha:");
		for(i = 0; i <= valorTopo; i++) {
			System.out.println("vetor["+i+"] = " + Array[i]);
		}
	}
	
	public void olhaiTamanho() {
		System.out.print("Tamanho do vetor = " + (valorTopo + 1) + " posições");
	}
	
	public void limparTudo() {
		Arrays.fill(Array, null);
	}
}
