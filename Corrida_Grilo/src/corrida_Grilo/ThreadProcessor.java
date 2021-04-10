package corrida_Grilo;

import java.util.Random;

public class ThreadProcessor extends Thread {

	Grilo [] grilo;
	
	int start, end, chegada;
	Random r = new Random();
	
	public ThreadProcessor(Grilo [] grilo, int start, int end, int chegada) {
		// TODO Auto-generated constructor stub
		this.grilo = grilo;
		this.start = start;
		this.end = end;
		this.chegada = chegada;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int c = start; c < end; c++) {
			while(!grilo[c].getChegada()) {
				grilo[c].setPecurso(r.nextInt(10-1) + 1);
				System.out.println("O Grilo " + (c + 1) + " pulou " + grilo[c].getPulo() + "cm e já percorreu " + grilo[c].getPecorre() + "cm");
				
				if(grilo[c].getPecorre() >= chegada) {
					System.out.println("O Grilo " + (c + 1) + " alcançou a linha de chegada com "+ grilo[c].getContP() +" pulos");
					grilo[c].setChegada(true);					
				}
			}
		}
	}

		
		//super.run();
}

