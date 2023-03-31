package Questao02;

public class Fila <T> implements FilaInterface <T>{
	private int tamanho;
	private Object[] Vetor;
	private int primeiro;
	private int ultimo;
	
	public Fila(int tamanho) {
		this.primeiro = -1;
		this.ultimo = -1;
		this.tamanho = tamanho;
		this.Vetor = new Object[tamanho];
	}
	
	public void adicionarElemento(T valor) throws Excessao{
		System.out.println("Inserindo um elemento");
		int ultimoElemento = (ultimo + 1) % tamanho;
		if (ultimoElemento == primeiro) {
			throw new Excessao("Fica cheia. O valor " + valor + " não pode ser adicionado");
		}
		ultimo = ultimoElemento;
		Vetor[ultimo] = valor;
		if(primeiro == -1) {
			primeiro = 0;
		}
	}
	
	@SuppressWarnings("unchecked")
	public T removerElemento() throws Excessao{
		System.out.print("Removendo elemento");
		T retorno;
		if(primeiro == -1) {
			throw new Excessao("A fila não contém nenhum elemento");
		}
		retorno = (T) Vetor[primeiro];
		if (primeiro == ultimo) {
			primeiro = -1;
			ultimo = -1;
		}else {
			primeiro = (primeiro + 1) % tamanho;
		}
		return retorno;
	}
	
	@SuppressWarnings("unchecked")
	public T consultarElemento() throws Excessao{
		System.out.println("Consultando o elemento do inicio...");
		T retorno;
		if(primeiro == -1) {
			throw new Excessao("Erro fila vazia");
		}
		retorno = (T) Vetor[primeiro];
		return retorno;
	}
	
	public boolean estaCheio() {
		int ultimoElemento = (ultimo + 1) % tamanho;
		if(ultimoElemento == primeiro) {
			return true;
		}else {
			return false;
		}
	}

	public boolean estaVazio()
	{
	    if( primeiro == -1 ) {
	        return true;
	    }
	    else { 
	    	return false;
	    }
	}
	
	public void mostrarElementos()
	{
		System.out.println("\nExibindo...\n");
		
	    int i = primeiro;
	    
	    if(primeiro == -1) {
	    	return;
	    }
	    	    
	    while(i != ultimo)
	    {
	    	System.out.println("posicao " + i + " = " + Vetor[i] + "\n");

	        i = (i + 1) % tamanho;
	    }
	    System.out.println("posicao " + i + " = " + Vetor[i] + "\n");
	    
		System.out.println("inicio = " + primeiro + "  fim = " + ultimo + "\n");
	}
}
