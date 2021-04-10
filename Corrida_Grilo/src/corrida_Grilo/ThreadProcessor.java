package corrida_Grilo;

public class ThreadProcessor extends Thread {

	Grilo grilo;
	
	int chegada, n;
	
	private Boolean fim;
	
	public Boolean fim() {
		return fim;
	}
	
	public ThreadProcessor(int chegada, int n) {
		// TODO Auto-generated constructor stub
		this.grilo = new Grilo();
		this.chegada = chegada;
		this.n = n;
		fim = false;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
			fim = grilo.corrida(grilo, chegada, n);
		
	}		
		//super.run();
}

