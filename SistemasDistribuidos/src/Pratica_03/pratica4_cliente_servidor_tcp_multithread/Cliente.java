package Pratica_03.pratica4_cliente_servidor_tcp_multithread;

import java.net.InetAddress;
import java.net.Socket;

public class Cliente {
	Socket socket;
	InetAddress inet;
	String ip;
	int porta;
	
	public Cliente(String ip, int porta) {
		this.ip = ip;
		this.porta = porta;
		this.rodar();
	}
	
	private void rodar() {
		try {
			socket = new Socket(ip, porta);
			inet = socket.getInetAddress();
			System.out.println("HostName = " +inet.getHostName());

			System.out.println("HostAddress = " +inet.getHostAddress());
			
			ImplCliente c = new ImplCliente(socket);
			Thread t = new Thread(c);
			t.start();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public static void main(String []args) {
		new Cliente("127.0.0.1", 54321);
	}
}
