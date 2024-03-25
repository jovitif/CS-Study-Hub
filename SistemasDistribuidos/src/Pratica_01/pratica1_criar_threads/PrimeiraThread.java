package Pratica_01.pratica1_criar_threads;

public class PrimeiraThread extends Thread{
	@Override
	public void run() {
		System.out.println("Método run() executado pela thread " + Thread.currentThread().getName());
	}
	
	
	public static void main(String []args) {
		Thread thread = new Thread();
		System.out.println(thread.getName());
		
		PrimeiraThread primeirathread = new PrimeiraThread();
		primeirathread.run();
		primeirathread.start();
	
		Thread thread02 = new Thread();
		System.out.println(thread02.getName());

	}
}
