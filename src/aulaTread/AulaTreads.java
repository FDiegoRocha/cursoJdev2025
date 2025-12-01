package aulaTread;

import javax.swing.JOptionPane;

public class AulaTreads {

	public static void main(String[] args) {
		
		// Thread processando em paralelo do envio de email
		new Thread() {
			
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
							
								
				
			}// metodo para rodar a thread
			
			
			
		}.start(); // Start liga a thread que fica processando paralelamente por trás
		
		// ===============================================================================
		
		// Thread processando em paralelo do envio de nota fiscal
		new Thread() {
			
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
				
				
				
			}// metodo para rodar a thread
			
			
			
		}.start(); // Start liga a thread que fica processando paralelamente por trás
		
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");

		
	}

}
