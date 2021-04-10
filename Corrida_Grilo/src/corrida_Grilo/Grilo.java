package corrida_Grilo;

import java.util.Random;

public class Grilo {
private int  pulo, contP, percorre;
Random r = new Random();
private Boolean fim = false;

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



public  void corrida(Grilo grilo, int chegada, int n) {
	while(fim == false) {
		pulo = r.nextInt(10-1) + 1;	
		if (percorre<= chegada) {
		percorre += pulo;
		contP++;
		System.out.println("O Grilo " + (n + 1) + " pulou " + pulo + "cm e já percorreu " + percorre + "cm");
	}else {
		fim = true;
		System.out.println("O Grilo " + (n + 1) + " alcançou a linha de chegada com "+ contP +" pulos");
	}
}
	
	/*if (grilo.percorre <= chegada) {
		grilo.setPercurso(r.nextInt(10-1) + 1);
		System.out.println("O Grilo " + (n + 1) + " pulou " + grilo.pulo + "cm e já percorreu " + grilo.percorre + "cm");
	}else {
		System.out.println("O Grilo " + (n + 1) + " alcançou a linha de chegada com "+ grilo.contP +" pulos");
	}*/
}				
	
}
