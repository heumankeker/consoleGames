import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Main extends Thread implements Runnable {

	//Array atômico para concorrencia de dados = Define array baseado no número máximo de Grilos
	private static AtomicIntegerArray AT = new AtomicIntegerArray(6);
	
	private int nova;//variável para index corrente do array de thread - 
	//A posição é passada como referência para a tread e, indica o local de index do array 
	//onde será salvo o numero de pulos realizado pela thread
	//que é idêntica ao nome da thread
	
	//inicia o construtor da classe Main
	public Main(int nova) {
		this.nova = nova;
	}
	
	//Implementaçãodo método principal da thread
	public void run()
	{  
		
		int chegada = 100;     //DISTÂNCIA da linha de chegada
		int pulos = 0;        //número de pulos
		int somaPulo = 0;     //soma total de pulos da thread
		int i = 0;
		
		System.out.println("______________________________");
		System.out.println("GRILO Thread " + Thread.currentThread().getName()  + " jogando...\n");
		
		//início do loop de pulos do grilo - sai quando a thread alcançar ou ultrapassar "chegada"
			for(i = 0; somaPulo < chegada; i++)
			{
				//gerando um número aleatório
				Random r = new Random();
				int valor = r.nextInt(10)+1;//Define o Range máximo de cada pulo;
				
				//imcrementa um pulo ao grilo
				pulos++;
				System.out.println("Pulo >>>>> " + pulos + " <<<<<");
				
				//imprime o valor do random gerado
				System.out.println("O grilo pulou..." + valor + "cm!");
				
				//atribui o random gerado à distância percorrida pelo grilo
				somaPulo = somaPulo+ valor;
				System.out.println("e percoreu um total de |" + somaPulo + "|cm!\n");
			
			}
			
			System.out.println("Thread " + nova);
			AT.set(nova, pulos);
			System.out.println("Thread " + Thread.currentThread().getName());
	}  

	private int parseInt(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) throws InterruptedException {
		//MAXIMO de GRILOS/THREADS
		int max = 6;
		
		//variável auxiliar para enviar o index corrent da thread;
		int nova = 0;
		
		//inicializa os valores do vector atomico AT
        for (int i=0; i<AT.length(); i++)
        {
            AT.set(i, 0);
        }
		//inicializa a variável do sleep
		long start = System.currentTimeMillis();
		
		//INICIANDO THREADS
		Main test[] = new Main[max];  
		
	    for(int a = 0; a < test.length; a++)
	    {
	      test[a] = new Main(a);
	      test[a].start();
	      //test[a].join();
	    }
		
	    Thread.sleep(2000);
	    System.out.println("_______________LOADING_______________\n");
	    
		//suspende o start da thread por 3 segundos
        Thread.sleep(3000);

        //imprime o vector AT
        System.out.println("!!! Fim da corrida !!!");
        System.out.println("RESULTADO");
        System.out.println("---" + AT + "---\n");
        Thread.sleep(3000);
        
	    System.out.println("_______________Checando o GRILO Vencedor_______________\n");
	    ;
	    
	}

}
