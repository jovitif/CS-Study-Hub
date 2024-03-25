package Pratica_03.pratica4_cliente_servidor_tcp_multithread;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ImplCliente implements Runnable {
	
	Socket cliente;
	boolean conexao = true;
	PrintStream saida;
	Scanner teclado;
	
	
	@Override
	public void run() {
		String mensagem;
		try {
			System.out.println("O cliente se conectou");	
			teclado = new Scanner(System.in);
			saida = new PrintStream(cliente.getOutputStream());
			while(conexao) {
				System.out.println("Digite uma menssagem");
				mensagem = teclado.nextLine();
				if(mensagem.equalsIgnoreCase("fim"))
					conexao = false;
				else
					System.out.println("Enviando: " + mensagem);
				saida.println(mensagem);
			}
			saida.close();
			teclado.close();
			cliente.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public ImplCliente(Socket c) {
		this.cliente = c;
	}

}
