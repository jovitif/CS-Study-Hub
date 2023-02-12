import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Evolua a questão anterior. Permita que o programa salve o resultado em um
 * arquivo de texto CSV. Permita que o programa abra o arquivo de texto CSV e exiba o conteúdo na tela
 * */
public class Questao35 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Digite uma frase:");
		 // Entrada de dados:
		String frase = scanner.nextLine();	
		
		String path = "arquivo.txt"; 			
	    
		// Separar e contar palavras:
	    String[] arrayPalavras = frase.split(" ");
	    int sizePalavras = arrayPalavras.length;
	    System.out.println("sizePalavras = " + sizePalavras);
	    
	    // Inicializo dicionario
	    Palavra dicionario[] = new Palavra[sizePalavras];
	    for(int i=0; i < sizePalavras; i++) {
	    	dicionario[i] = new Palavra();
	    }
	    
	    // Variaveis de controle
	    boolean flagExiste = false;
	    int iExiste=0;	// indice da palavra encontrada
	    int iNova=0;	// indice da palavra nova
	    
	    // PERCORRER CADA PALAVRA DA FRASE:
	    for(int p=0; p < sizePalavras; p++)
	    {
	    	// Palavra atual
	    	String palavra = arrayPalavras[p];
	    	
           // PROCURAR NA ESTRUTURA SE JA EXISTE palavra
           flagExiste = false;
           
           for(iExiste=0; iExiste<sizePalavras; iExiste++)
           {
               if( dicionario[iExiste].palavra.equals(palavra) == true ) 
               {
                   flagExiste = true;
                   break;
               }
           }

           if(flagExiste == true)
           {
               // Incrementar o cont
               dicionario[iExiste].cont++;
           }
           else
           {
               // Palavra nova, ent�o adiciona	
           	dicionario[iNova].palavra = palavra;
               dicionario[iNova].cont = 1;
               iNova++;
           }
	        
	    }

	    // Imprimir a lista desordenada
	    

	    // Organizar a lista

	    // Imprimir a lista ordenada
	    String textoOutput;
	    try {
			escritor(path, iNova, dicionario);
		} catch (IOException e) {
			System.out.println("Erro na escrita");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Pane geral!");
			e.printStackTrace();
		}
	    
	    try {
			textoOutput = leitor(path);
			System.out.print(textoOutput);
		} catch (IOException e) {
			System.out.println("Erro na leitura");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Pane geral!");
			e.printStackTrace();
		}
	    
	}
	
	public static void escritor(String path, int iNova, Palavra[] dicionario) throws IOException 
	{
		BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(path) );
		 for(int i=0; i<iNova; i++) {
		        System.out.println(dicionario[i].palavra + " : " + dicionario[i].cont);
		        bufferedWriter.append(dicionario[i].palavra + " : " + dicionario[i].cont + "\n");		        
		    }
		
		bufferedWriter.close();
	}
	
	public static String leitor(String path) throws IOException 
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
