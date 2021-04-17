package corrida_Grilo;


public class Game {
	
	private int chegada, q;
	
	public void corrida(){
		chegada =  50;
		q = 12;
		
		int nThreads = q;
		
		ThreadProcessor [] threads = new ThreadProcessor[nThreads];
		for (int c = 0; c < q; c++) {
			threads[c] = new ThreadProcessor(chegada, c);
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
