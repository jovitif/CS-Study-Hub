import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Questao40 {
    private static final String CODIFICADOR_ARQUIVO_SAIDA = "texto.txt";
    private static final String DECODIFICADOR_ARQUIVO_SAIDA = "textodecodificado.txt";
    private static final HashMap<Character, Character> CODIFICACAO = new HashMap<>();

    static {
        // Define as regras de codificação
        CODIFICACAO.put('Z', 'P');
        CODIFICACAO.put('P', 'Z');
        CODIFICACAO.put('E', 'O');
        CODIFICACAO.put('O', 'E');
        CODIFICACAO.put('N', 'L');
        CODIFICACAO.put('L', 'N');
        CODIFICACAO.put('I', 'A');
        CODIFICACAO.put('A', 'I');
        CODIFICACAO.put('T', 'R');
        CODIFICACAO.put('R', 'T');
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Executa o codificador
        codificar("texto.txt", CODIFICADOR_ARQUIVO_SAIDA);
        
        // Executa o decodificador
        decodificar(CODIFICADOR_ARQUIVO_SAIDA, DECODIFICADOR_ARQUIVO_SAIDA);
    }

    private static void codificar(String arquivoEntrada, String arquivoSaida) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(arquivoEntrada));
        PrintWriter printWriter = new PrintWriter(new File(arquivoSaida));

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            StringBuilder novaLinha = new StringBuilder();

            for (int i = 0; i < linha.length(); i++) {
                char c = linha.charAt(i);

                if (CODIFICACAO.containsKey(c)) {
                    novaLinha.append(CODIFICACAO.get(c));
                } else {
                    novaLinha.append(c);
                }
            }

            printWriter.println(novaLinha.toString());
        }

        scanner.close();
        printWriter.close();
    }

    private static void decodificar(String arquivoEntrada, String arquivoSaida) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(arquivoEntrada));
        PrintWriter printWriter = new PrintWriter(new File(arquivoSaida));

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            StringBuilder novaLinha = new StringBuilder();

            for (int i = 0; i < linha.length(); i++) {
                char c = linha.charAt(i);
                boolean encontrado = false;

                for (char chave : CODIFICACAO.keySet()) {
                    if (CODIFICACAO.get(chave) == c) {
                        novaLinha.append(chave);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    novaLinha.append(c);
                }
            }

            printWriter.println(novaLinha.toString());
        }

        scanner.close();
        printWriter.close();
    }
}