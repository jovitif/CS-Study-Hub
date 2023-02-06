import java.util.Scanner;

/*
 * 		Construa um programa que registre objetos da classe Pessoa, com os seguintes atributos: cpf, 
 * 		nome, idade, sexo, peso, altura, imc. Permita que o usuário defina a quantidade de pessoas em 
 * 		tempo de execução. Ao cadastrar uma pessoa, calcule o IMC(Índice de Massa Corporal). Ao final, 
 * 		exiba a lista de pessoas (com seus respectivos atributos).
 * */
public class Questao31 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
        System.out.print("Quantas pessoas deseja registrar? ");
        int qtdPessoas = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[qtdPessoas];

        for (int i = 0; i < qtdPessoas; i++) {
            sc.nextLine();
            System.out.println("\nPessoa " + (i + 1));
            System.out.print("CPF: ");
            String cpf = sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().charAt(0);
            System.out.print("Peso: ");
            double peso = sc.nextDouble();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(cpf, nome, idade, sexo, peso, altura);
            }
        
        System.out.println("\nLista de pessoas:");
        for (int i = 0; i < qtdPessoas; i++) {
            System.out.println("\nPessoa " + (i + 1));
            System.out.println("CPF: " + pessoas[i].getCpf());
            System.out.println("Nome: " + pessoas[i].getNome());
            System.out.println("Idade: " + pessoas[i].getIdade());
            System.out.println("Sexo: " + pessoas[i].getSexo());
            System.out.println("Peso: " + pessoas[i].getPeso());
            System.out.println("Altura: " + pessoas[i].getAltura());
            System.out.println("IMC: " + pessoas[i].getImc());
        }
    }

}

class Pessoa {
    private String cpf;
    private String nome;
    private int idade;
    private char sexo;
    private double peso;
    private double altura;
    private double imc;

    public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public char getSexo() {
		return sexo;
	}



	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getImc() {
		return imc;
	}



	public void setImc(double imc) {
		this.imc = imc;
	}



	public Pessoa(String cpf, String nome, int idade, char sexo, double peso, double altura) {
        setCpf(cpf);
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setPeso(peso);
        setAltura(altura);
        setImc(calcularImc(peso,altura));
    }
    
	public double calcularImc(double peso,double altura) {
		return peso/(altura*altura);
	}
}