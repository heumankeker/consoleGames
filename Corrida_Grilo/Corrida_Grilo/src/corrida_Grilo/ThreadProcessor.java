package corrida_Grilo;

public class ThreadProcessor extends Thread {

	Grilo [] grilo;
	
	int start, end, chegada;
	
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
			grilo[c].corrida(grilo[c], chegada, c);;
		}
		
		//super.run();
	}
}
