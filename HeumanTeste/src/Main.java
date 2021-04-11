import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Main extends Thread implements Runnable {

	//Array at�mico para concorrencia de dados = Define array baseado no n�mero m�ximo de Grilos
	private static AtomicIntegerArray AT = new AtomicIntegerArray(6);
	
	private int nova;//vari�vel para index corrente do array de thread - 
	//A posi��o � passada como refer�ncia para a tread e, indica o local de index do array 
	//onde ser� salvo o numero de pulos realizado pela thread
	//que � id�ntica ao nome da thread
	
	//inicia o construtor da classe Main
	public Main(int nova) {
		this.nova = nova;
	}
	
	//Implementa��odo m�todo principal da thread
	public void run()
	{  
		
		int chegada = 100;     //DIST�NCIA da linha de chegada
		int pulos = 0;        //n�mero de pulos
		int somaPulo = 0;     //soma total de pulos da thread
		int i = 0;
		
		System.out.println("______________________________");
		System.out.println("GRILO Thread " + Thread.currentThread().getName()  + " jogando...\n");
		
		//in�cio do loop de pulos do grilo - sai quando a thread alcan�ar ou ultrapassar "chegada"
			for(i = 0; somaPulo < chegada; i++)
			{
				//gerando um n�mero aleat�rio
				Random r = new Random();
				int valor = r.nextInt(10)+1;//Define o Range m�ximo de cada pulo;
				
				//imcrementa um pulo ao grilo
				pulos++;
				System.out.println("Pulo >>>>> " + pulos + " <<<<<");
				
				//imprime o valor do random gerado
				System.out.println("O grilo pulou..." + valor + "cm!");
				
				//atribui o random gerado � dist�ncia percorrida pelo grilo
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
		
		//vari�vel auxiliar para enviar o index corrent da thread;
		int nova = 0;
		
		//inicializa os valores do vector atomico AT
        for (int i=0; i<AT.length(); i++)
        {
            AT.set(i, 0);
        }
		//inicializa a vari�vel do sleep
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
