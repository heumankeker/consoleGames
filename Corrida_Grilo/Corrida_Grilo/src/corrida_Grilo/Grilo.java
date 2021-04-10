package corrida_Grilo;

import java.util.Random;

public class Grilo {
private int  pulo, contP, percorre;
private Boolean chegada = false;
Random r = new Random();

public Grilo() {
	
}


public void setPecurso(int pulo) {
	this.pulo = pulo;
	percorre += pulo;
	contP++;
}
public int getPulo(){
	return pulo;
}

public int getContP(){
	return contP;
}

public int getPecorre(){
	return percorre;
}

public void setChegada(Boolean chegada) {
	this.chegada = chegada;
}

public Boolean getChegada() {
	return chegada;
}

public  void corrida(Grilo grilo, int chegada, int n) {
	while(!grilo.getChegada()) {
		if (grilo.percorre <= chegada) {
			grilo.setPecurso(r.nextInt(10-1) + 1);
			System.out.println("O Grilo " + (n + 1) + " pulou " + grilo.pulo + "cm e já percorreu " + grilo.percorre + "cm");
		}else {
			System.out.println("O Grilo " + (n + 1) + " alcançou a linha de chegada com "+ grilo.contP +" pulos");
			grilo.setChegada(true);
		}
	}					
}	
}
