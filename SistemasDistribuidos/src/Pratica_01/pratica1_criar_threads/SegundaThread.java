package Pratica_01.pratica1_criar_threads;

public class SegundaThread extends Thread{
	@Override
	public void run() {
		System.out.println("Executando método run() da thread " + currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			}

	}
	public static void main() {
		SegundaThread t0 = new SegundaThread();
		SegundaThread t1 = new SegundaThread();
		t0.run();
		t1.run();
	}
}
