package aulaTread.loiane;

public class UsandoIsAliveJoin implements Runnable {
	private String nome;
	private int tempo;
	
	public UsandoIsAliveJoin(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		//Thread t = new Thread(this);
		//t.start();
	}

	@Override
	public void run() {
		try {
			for(int i = 0; i < 6; i++) {
			System.out.println(nome + " contador " + i);
			
				Thread.sleep(tempo);
			}
			System.out.println(nome + " terminou a execução!");
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}

}
