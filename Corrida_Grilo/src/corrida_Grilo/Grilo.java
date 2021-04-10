package corrida_Grilo;

import java.util.Random;

public class Grilo {
private int  pulo, contP, percorre;
Random r = new Random();

public Grilo() {
	
}


public void setPercurso(int pulo) {
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

public int getPercorre(){
	return percorre;
}



public  Boolean corrida(Grilo grilo, int chegada, int n) {
	if (grilo.percorre <= chegada) {
		grilo.setPercurso(r.nextInt(10-1) + 1);
		System.out.println("O Grilo " + (n + 1) + " pulou " + grilo.pulo + "cm e já percorreu " + grilo.percorre + "cm");
		return false;
	}else {
		System.out.println("O Grilo " + (n + 1) + " alcançou a linha de chegada com "+ grilo.contP +" pulos");
		return true;
	}
}				
	
}
