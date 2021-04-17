package corrida_Grilo;

import java.util.Random;

public class ThreadProcessor extends Thread {
	
	int chegada, n;
	int  pulo, contP, percorre;
	Random r = new Random();
	private Boolean fim = false;
	
	
	public ThreadProcessor(int chegada, int n) {
		// TODO Auto-generated constructor stub
		this.chegada = chegada;
		this.n = n + 1;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(fim == false) {
			pulo = r.nextInt(10-1) + 1;	
			if (percorre<= chegada) {
				percorre += pulo;
				contP++;
				System.out.println("O Grilo " + n + " pulou " + pulo + "cm e já percorreu " + percorre + "cm");
				/*try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}else {
				fim = true;
				System.out.println("O Grilo " + n + " alcançou a linha de chegada com "+ contP +" pulos");
			}
		}
	}		
		//super.run();
}

