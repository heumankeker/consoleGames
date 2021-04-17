package corrida_Grilo;


public class Game {
	
	private int chegada, q, timePercorrido, timePulo;
	ThreadProcessor winner, vice;
	
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
		
		winner = threads[0];
		vice = threads[0];
		
		for (int c = 0; c < threads.length ;c++)
        {
	    	if(threads[c].contP < winner.contP) {
	    		winner = threads[c];
	    	}
        }
	 	System.out.println( "O Grilo "+ winner.n + " venceu com " + winner.contP + " pulos");
		
	    for (int c = 0; c < threads.length;c++)
        {
			if(winner.contP == threads[c].contP && winner.n != threads[c].n) 
			{
	    	 		System.out.println( "O Grilo "+ c + " empatou com " + threads[c].contP + " pulos");
			}
        }
	 	
	    int corrente = 0; 
	    int timeVencedor = 0;
	    
	    for(int c = 0; corrente < threads.length; c++)
	    {
	    	timePercorrido = 0;
	    	timePulo = 0;
		    for(int l = 0; l < 3; l++) 
		    {
		    	timePercorrido += threads[corrente].percorre;
		    	timePulo += threads[corrente].contP;
		    	if(corrente == winner.n) 
		    	{	  
		    		timeVencedor = c;
		    	}
		    	corrente++;
		    }  
		    System.out.println("O Time " + (c + 1) +" percorreu "+ timePercorrido +"cm com o total de " + timePulo + " pulos");
	    }
	    System.out.println("O Time " + (timeVencedor + 1) + " foi o ganhador.");
	}

}
