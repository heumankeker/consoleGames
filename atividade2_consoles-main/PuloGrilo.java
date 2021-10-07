
public class PuloGrilo extends Thread{

    String name; //id do grilo
    int puloDistancia = 0; //distancia do pulo
    int distanciaTotal;
    int pulos = 0;
    int pulo = 0;
    static int rank = 0;
    final static int MAXPulo = 48;

    PuloGrilo( String name, int totalDist){

        this.name = name;
        this.distanciaTotal = totalDist;
    }

    public void printRank(){
        rank++;
        System.out.println(name + " foi o " + rank + " º colocado com " + pulos + " pulos.");
    }

    public void imprimeCorrida(){
        
        System.out.println("O " + name + "/ pulou " + pulo + "cm e percorreu a distncia de |" + puloDistancia + " cm| ...");
    }
 
    public void run(){

        while (puloDistancia < distanciaTotal){
            puloGrilinho();
            imprimeCorrida();
        }
        printRank();
    }
    
    public void puloGrilinho(){
        pulos++;
        pulo = (int) (Math.random() * MAXPulo);
        puloDistancia += pulo;
        if(puloDistancia > distanciaTotal){
            puloDistancia = distanciaTotal;
        }
    }
}