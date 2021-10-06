package corrida_Grilo;

import java.util.Random;

public class ThreadProcessor extends Thread {
	
	int chegada, n; // Cria uma variavel para a linha de chegada e o "nome" do grilo
	int  pulo, contP, percorre;// Cria variavel para a distancia do pulo, a quantidade de pulos e a distancia percorrida
	Random r = new Random(); 
	private Boolean fim = false; // Variavel que define se o grilo chegou no final. Começa com false.
	
	
	public ThreadProcessor(int chegada, int n) {
		//Recebe os valos externos dentro da clase
		this.chegada = chegada;
		this.n = n + 1;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Roda até fim ser verdadeiro
		while(fim == false) {
			//Randomiza a distancia dos pulos
			pulo = r.nextInt(10-1) + 1;	
			if (percorre < chegada) { // Se a distancia percorrida for menor que a linha de chegada executa esta parte
				// Soma a distancia dos pulos ao caminho percorrido e a quantidade de pulos
				percorre += pulo;
				contP++;
				System.out.println("O Grilo " + n + " pulou " + pulo + "cm e já percorreu " + percorre + "cm");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else { // Se a distancia percorrida não for menor que a linha de chegada executa esta parte
				fim = true; //Define o final da corrida para o grilo
				System.out.println("O Grilo " + n + " alcançou a linha de chegada com "+ contP +" pulos");
			}
		}
	}		
		//super.run();
}

