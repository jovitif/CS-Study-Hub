import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 	Evolua a questão anterior. Permita que o programa salve o resultado em um arquivo binário. Permita que o programa abra o arquivo binário e exiba o conteudo na tela.
 * */
public class Questao32 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String path = "Questao32.dat"; 		
		 System.out.print("Quantas pessoas deseja registrar? ");
	        int qtdPessoas = sc.nextInt();
	        List<Pessoa> pessoas  = new ArrayList<Pessoa>();
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
	            pessoas.add(new Pessoa(cpf, nome, idade, sexo, peso, altura));
	            }
	        
	      
		    try {
				escritor(path, qtdPessoas, pessoas);
			} catch (IOException e) {
				System.out.println("Erro na escrita");
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("Pane geral!");
				e.printStackTrace();
			}
		    
		    try {
		    	System.out.println("Lista de Pessoas:\n\n");
				List<Pessoa> listOutput = leitor(path);
				
				for (Pessoa object : listOutput) 
				{
					Pessoa myObj = (Pessoa) object;
					System.out.print( myObj.toString() );
				}
				
			} catch (IOException e) {
				System.out.println("Erro na leitura: IOException");
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.out.println("Erro na leitura: ClassNotFoundException");
				e.printStackTrace();
			}
		    
    }
	
	public static void escritor(String path, int qtdPessoas, List<Pessoa> pessoas) throws IOException 
	{
		File file = new File(path);
    	file.delete();
        file.createNewFile();
        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(file));
        objOutput.writeObject(pessoas);
        objOutput.close();
	}
	
	@SuppressWarnings("unchecked")
	public static List<Pessoa> leitor(String path) throws IOException, ClassNotFoundException 
	{
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		File file = new File(path);
	    
		if(file.exists()) 
		{
			ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(file));
			lista = (ArrayList<Pessoa>) objInput.readObject();
	        objInput.close();
		}
		
		return lista;
	}

}