import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 	Utilizando o recurso Generic de Java, construa um programa que tenha funcinalidades de um CRUD 
 * (create, read, update e delete) de Pessoa
 * */
public class Questao39<T> {
	public static Scanner scanner = new Scanner(System.in);
	private List<T> lista = new ArrayList<>();
	public void adicionarObjeto(T objeto) {
		lista.add(objeto);
	}
	public List<T> listarObjeto(){
		return lista;
	}
	public void atualizarObjeto(T objeto, int indice) {
		lista.set(indice, objeto);
	}
	public void deletarObjeto(int indice) {
		lista.remove(indice);
	}
	public static void main(String []args) {
		Questao39<Pessoas> crud = new Questao39<>();
		Questao39<Objeto> crud2 = new Questao39<>();
		Objeto o1 = new Objeto("Ventilador qualquer",200.19);
		Objeto o2 = new Objeto("Smartphone qualquer", 2549.99);
		Objeto o3 = new Objeto("Televisão qualquer", 10323.99);
		Objeto o4 = new Objeto("Carro do Iron Musku", 10002012010201201.99);
		Pessoas p1 = new Pessoas("João Sales", 19);
		Pessoas p2 = new Pessoas("Maria Antonia",66);
		Pessoas p3 = new Pessoas("Batman",37);
		Pessoas p4 = new Pessoas("Thaiz Carla",392);
		crud.adicionarObjeto(p1);
		crud.adicionarObjeto(p2);
		crud.adicionarObjeto(p3);
		crud2.adicionarObjeto(o1);
		crud2.adicionarObjeto(o2);
		crud2.adicionarObjeto(o3);
		
		System.out.println("Lista de Pessoas: " + crud.listarObjeto());
		crud.atualizarObjeto(p4, 1);
		
		System.out.println("Após atualizações: " + crud.listarObjeto());
		crud.deletarObjeto(2);
		System.out.println("Após atualizações: " + crud.listarObjeto());
		
		
		System.out.println("Lista de objetos: " + crud2.listarObjeto());
		crud2.atualizarObjeto(o4, 1);
		
		System.out.println("Após atualizações: " + crud2.listarObjeto());
		crud2.deletarObjeto(2);
		System.out.println("Após atualizações: " + crud2.listarObjeto());
		
		/*
		 * Independe do objeto que for criado posso utilizar os metodos do crud para realizar ações como listar, adicionar, remover, ou modificar dados
		 * */
		
	}
}
class Objeto {
	private String nome;
	private double valor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Objeto(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Objeto [nome=" + nome + ", valor=" + valor + "]";
	}
	
}
class Pessoas{
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(byte idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "Pessoas [nome=" + nome + ", idade=" + idade + ", altura=" + altura + ", peso=" + peso + ", cpf=" + cpf
				+ "]";
	}
	public Pessoas(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
}
