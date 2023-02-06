import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Evolua a questão anterior. Permita que o programa salve o resultado em um
 * arquivo de texto CSV. Permita que o programa abra o arquivo de texto CSV e exiba o conteúdo na tela
 * */
public class Questao35 {
	
	public static void main(String []args) {
		String path = "C:\\Users\\Usuário\\Desktop\\teste.txt"; //caminho do arquivo
		FileReader fr = null; //classe para ler string de dados
		BufferedReader br = null; //gerencia a memoria para leitura de forma mais rapida
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				br.close();
				fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
