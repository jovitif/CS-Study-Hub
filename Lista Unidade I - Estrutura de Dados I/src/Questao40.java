import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 	Construa um programa CODIFICADOR que receba um arquivo de texto de entrada e codifique ele usando 
 	um padrão de troca de letras. Após esse processamento, gere um arquivo codificado. Construa outro 
 	programa, que funcionará como DECODIFICADOR, que seja capaz de ler o arquivo codificado e produzir
 	um arquivo de texto decodificado, que deve ser o mesmo texto original. Padrão de troca de letras 
 	para codificar um texto:  Z<=>P E<=>O N<=>L I<=>A T<=>R
*/
public class Questao40 {
	private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
    	String path = "texto.txt";
    	// 	Processo de codificação
    }
    
    public static void Codificador(String path, int iNova, Palavra[] dicionario) throws IOException 
	{
		BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(path) );
		 for(int i=0; i<iNova; i++) {
		        System.out.println(dicionario[i].palavra + " : " + dicionario[i].cont);
		        bufferedWriter.append(dicionario[i].palavra + " : " + dicionario[i].cont + "\n");		        
		    }
		
		bufferedWriter.close();
	}
	
	public static String Leitura(String path) throws IOException 
	{
		BufferedReader bufferedReader = new BufferedReader( new FileReader(path) );
		
		StringBuffer sbResult = new StringBuffer();
		String linha = "";
		
		while (linha != null) 
		{
			sbResult.append(linha + "\n");
			linha = bufferedReader.readLine();
			
			if(linha != null) {
				String[] parts = linha.split(";");
				for (int i = 0; i < parts.length; i++) {
					System.out.print("["+parts[i]+"] ");
				}
			}

		}
		bufferedReader.close();
		
		return sbResult.toString();
	}
}
