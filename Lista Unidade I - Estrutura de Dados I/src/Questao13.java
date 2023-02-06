import java.util.Scanner;
import java.util.Vector;

public class Questao13 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		 Vector<Double> vetor = new Vector<Double>();
		    Double media = 0.0;
			for(int i =1; i <=3; i++) {
				System.out.println("Digite a nota " + i + " : ");
				Double nota = scanner.nextDouble();
				vetor.add(nota);
			}
			
			System.out.println("Notas:");
			for(int i = 0; i < vetor.size(); i++) {
			      System.out.println(vetor.get(i));
			      media = media + vetor.get(i);
			 }
			media = media/vetor.size();
			System.out.println(String.format("Sua media total foi de %.2f", media));
			if(media >= 3.5 && media < 7.0) {
				System.out.println("Recuperação");
				System.out.println("Digite a nota tirada na 4 prova:");
				Double nota4 = scanner.nextDouble();
				media = (media*6+nota4*4)/10;
				System.out.println("Nota: " + media);
				if(media >= 5.0) {
					System.out.println("Aprovado");
				}else {
					System.out.println("Reprovado");
				}
			}else if(media >= 7.0) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
			}
	}
}
