package aulaTread.loiane;

public class TesteIsAliveJoin {

	public static void main(String[] args) {
		UsandoIsAliveJoin thread1 = new UsandoIsAliveJoin("#1", 500);
		UsandoIsAliveJoin thread2 = new UsandoIsAliveJoin("#2", 600);
		UsandoIsAliveJoin thread3 = new UsandoIsAliveJoin("#3", 800);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		
		// Formas de dar prioridade as Threads
		t1.setPriority(5); // 1 a 10
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		// isAlive() = metodo usado para saber se Thread continua em execução (está viva).
		/*while(t1.isAlive() || t2.isAlive() || t3.isAlive()) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		try {
			// join() = Metodo usado para esperar a conclusao de uma determinada Thread
			t1.join();
			t2.join();
			t3.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Programa finalizado");

	}

}
