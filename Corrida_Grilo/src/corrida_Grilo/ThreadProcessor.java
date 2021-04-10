package corrida_Grilo;

public class ThreadProcessor extends Thread {

	Grilo grilo;
	
	int chegada, n;
	
	public ThreadProcessor(int chegada, int n) {
		// TODO Auto-generated constructor stub
		this.grilo = new Grilo();
		this.chegada = chegada;
		this.n = n;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		grilo.corrida(grilo, chegada, n);
		
	}		
		//super.run();
}

