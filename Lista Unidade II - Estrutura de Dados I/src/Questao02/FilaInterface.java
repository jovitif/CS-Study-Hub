package Questao02;

public interface FilaInterface <T>{
	void adicionarElemento(T elemento) throws Excessao;
	T removerElemento() throws Excessao;
	T consultarElemento() throws Excessao;
	boolean estaVazio();
	boolean estaCheio();
	void mostrarElementos();
}
