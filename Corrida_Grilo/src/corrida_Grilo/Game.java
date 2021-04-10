package corrida_Grilo;

import java.util.Random;

public class Game {
	
	private Grilo [] grilos;
	private int chegada;
	Random r = new Random();
	
	
	public void createGrilo(int q) {
		grilos = new Grilo[q];
		for (int c = 0; c < q ; c++) {
			grilos[c] = new Grilo();
		}
		
	}
	
	public void corrida(){
		chegada =  50;
		createGrilo(5);
	
		for(int c = 0; c < grilos.length; c++) {
			grilos[c].corrida(grilos[c], chegada, c);
			
		}
			
	}
	
}
