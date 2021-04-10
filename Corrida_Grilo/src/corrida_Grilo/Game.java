package corrida_Grilo;


public class Game {
	
	private int chegada, q, gFinal;
	
	public void corrida(){
		chegada =  50;
		q = 4;
	
		
		int nThreads = q;
		
		ThreadProcessor [] threads = new ThreadProcessor[nThreads];
	
		for (int c = 0; c < q; c++) {
			threads[c] = new ThreadProcessor(chegada, c);
			threads[c].start();
		}	
		
		while(gFinal < q) {
			for(int c = 0; c < threads.length; c++) {
				threads[c].run();
				if(threads[c].fim()) {
					gFinal++;
				}
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

}
