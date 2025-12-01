package aulaTread;

public class ThreadRunnable {

	public static void main(String[] args) {
		Thread threadEmail = new Thread(Thread1);
		threadEmail.start();
		
		Thread threadNF = new Thread(Thread2);
		threadNF.start();

	}
	
	private static Runnable Thread1 = new Runnable() {
		
		public void run() {
			for(int pos = 0; pos < 10; pos++) {
				System.out.println("Executando algo rotina, por exemplo envio de e-mail ");
				
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	};
	
	private static Runnable Thread2 = new Runnable() {
		public void run() {
			for(int pos = 0; pos < 10; pos++) {
				System.out.println("Executando algo rotina, por exemplo envio de nota fiscal ");
				
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};

}
