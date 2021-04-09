package corrida_Grilo;

public class Grilo {
private int  pulo, contP, pecorre;
private Boolean chegada = false;

Grilo() {

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

}
