package corrida_Grilo;

import java.util.ArrayList;
import java.util.Random;

public class Game {
	
	private Grilo [] grilos;
	private int chegada, g;
	Random r = new Random();
	
	private ArrayList<Grilo> grilosF = new ArrayList<Grilo>();
	
	public void createGrilo(int q) {
		grilos = new Grilo[q];
		for (int c = 0; c < q ; c++) {
			grilos[c] = new Grilo();
			grilosF.add(grilos[c]);
		}
		
	}
	
	public void corrida(){
		chegada =  50;
		createGrilo(5);
		
		while(grilosF.isEmpty() == false) {	
			for(int c = 0; c < grilos.length; c++) {
				if (grilos[c].getPecorre() <= chegada) {
					grilos[c].setPecurso(r.nextInt(10-1) + 1);
					System.out.println("O Grilo " + (c + 1) + " pulou " + grilos[c].getPulo() + "cm e já percorreu " + grilos[c].getPecorre() + "cm");
				}else {
					System.out.println("O Grilo " + (c + 1) + " alcançou a linha de chegada com "+ grilos[c].getContP() +" pulos");
					grilosF.remove(grilos[c]);
					
				}
			}						
		}	
			
	}
	

	
}
