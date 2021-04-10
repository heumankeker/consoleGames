package corrida_Grilo;

public class Grilo {
private int  pulo, contP, pecorre;
private Boolean chegada = false;

public Grilo() {
	
}


public void setPecurso(int pulo) {
	this.pulo = pulo;
	pecorre += pulo;
	contP++;
}
public int getPulo(){
	return pulo;
}

public int getContP(){
	return contP;
}

public int getPecorre(){
	return pecorre;
}

public void setChegada(Boolean chegada) {
	this.chegada = chegada;
}

public Boolean getChegada() {
	return chegada;
}

public  void corrida(Grilo grilo, int chegada, int n) {
	while(!grilo.getChegada()) {
		if (grilo.getPecorre() <= chegada) {
			grilo.setPecurso(r.nextInt(10-1) + 1);
			System.out.println("O Grilo " + (n + 1) + " pulou " + grilo.pulo + "cm e já percorreu " + grilo.pecorre + "cm");
		}else {
			System.out.println("O Grilo " + (n + 1) + " alcançou a linha de chegada com "+ grilo.contP +" pulos");
			grilo.setChegada(true);
		}
	}					
}
	
}
