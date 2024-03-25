package Pratica_01.pratica1_criar_threads;

public class MinhaThread implements Runnable {

	@Override
	public void run() {
	System.out.println("Oi, eu sou a "
	+ Thread.currentThread().getName());
	}

}
