package Pratica_03.pratica4_cliente_servidor_tcp_multithread;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	ServerSocket socketServidor;
	Socket cliente;
	int porta;
	
	public Servidor(int p) {
		porta = p;
		this.rodar();
	}
	
	private void rodar() {
		try {
			socketServidor = new ServerSocket(porta);
			System.out.println("Servidor rodando na porta " + socketServidor.getLocalPort());
			System.out.println("Hostname" + InetAddress.getLocalHost().getHostName());
			System.out.println("HostAddress" + InetAddress.getLocalHost().getHostAddress());
			System.out.println("Aguardando solicitações de conexão...");
			while(true) {
				cliente = socketServidor.accept();
				ImplServidor servidor = new ImplServidor(cliente);
				Thread t = new Thread(servidor);
				ImplServidor.cont++;
				t.start();
			}

		} catch (Exception e) {
			e.getMessage();		
		}
	}
	
	public static void main(String []args) {
		new Servidor(54321);
	}
}
