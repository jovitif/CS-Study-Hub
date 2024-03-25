package Pratica_03.pratica4_cliente_servidor_tcp_multithread;

import java.net.Socket;
import java.util.Scanner;

public class ImplServidor implements Runnable{
	Socket socketCliente;
	static int cont = 0;
	boolean conexao = true;
	Scanner entrada;
	
	
	public ImplServidor(Socket s) {
		socketCliente = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String mensagemRecebida;
		System.out.println("Conexão " + ImplServidor.cont + " com o cliente " + socketCliente.getInetAddress().getHostName() + ":" + socketCliente.getInetAddress().getHostAddress());
		try {
			entrada = new Scanner(socketCliente.getInputStream());
			while(conexao) {
				mensagemRecebida = entrada.nextLine();
				if(mensagemRecebida.equalsIgnoreCase("fim"))
					conexao = false;
				else
					System.out.println(mensagemRecebida);
			}
			entrada.close();
			System.out.println("Fim do cliente: " + socketCliente.getInetAddress().getHostName());
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
