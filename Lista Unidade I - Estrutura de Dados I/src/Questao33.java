
public class Questao33 {
	public static void main(String args[]) {

		//inicializa a string com a palavra
		String palavra = "exatamente";

		//cria o array pra armazenar as letras das palavras
		Dicionario[] dic = new Dicionario[palavra.length()];

		//loop para inicializar cada letra da palavra
		for (int i = 0; i < palavra.length(); i++) {
			dic[i] = new Dicionario();
			dic[i].carac = palavra.charAt(i);
			dic[i].vezes++;

		}

		//loop para contar quantas vezes cada letra aparece
		for (int i = 0; i < palavra.length(); i++) {
			for (int j = 0; j < palavra.length(); j++) {
				// conta quantidade de letras iguais
				if ((dic[i].carac == dic[j].carac) && (i != j)) {
					dic[i].vezes++;
				}
			}
		}

		//imprime o resultado
		for (int i = 0; i < palavra.length(); i++) {
			//imprime letra e quantidade se apenas aparece uma vez
			if (dic[i].vezes == 1) {
				System.out.println(dic[i].carac + "=" + dic[i].vezes);
			} else if (dic[i].vezes > 1) {
				//imprime letra e quantidade se aparece mais de uma vez
				System.out.println(dic[i].carac + "=" + dic[i].vezes);
				for (int j = 0; j < palavra.length(); j++) {
					//zera a contagem de letras já contadas
					if (dic[j].carac == dic[i].carac) {
						dic[j].vezes = dic[i].vezes - dic[i].vezes;
					}
				}
			}

		}

	}
}

//classe para armazenar informações das letras
class Dicionario {
	char carac;
	int vezes;
}