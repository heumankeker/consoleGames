package corrida_Grilo;


public class Game {
	
	private Grilo [] grilos;
	private int chegada, q;
	
	
	public void createGrilo() {
		for (int c = 0; c < grilos.length ; c++) {
			grilos[c] = new Grilo();
		}
		
	}
	
	public void corrida(){
		chegada =  50;
		q = 4;
		
		grilos = new Grilo[q];
		createGrilo();
		
		int nThreads = 2;
		int elemThread = q/2;
		
		ThreadProcessor [] threads = new ThreadProcessor[nThreads];
	
		
		System.out.println("Paralela:");
		for (int c = 0; c < nThreads; c++) {
			int inicio = c * elemThread;
			int fim = inicio + elemThread;
			threads[c] = new ThreadProcessor(grilos, inicio, fim, chegada);
			threads[c].start();
		}	
		
		for(int c = 0; c < nThreads; c++) {
			try {
				threads[c].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	
}
