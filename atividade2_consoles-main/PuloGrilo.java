
public class PuloGrilo extends Thread{

    String name;
    int puloDistancia = 0;
    int distanciaTotal;
    int pulos = 0;
    int pulo = 0;
    static int placing = 0;
    final static int MAXPulo = 48;


    PuloGrilo( String name, int totalDistance){

        this.name = name;
        this.distanciaTotal = totalDistance;
    }




    public void placingCricket(){
        placing++;
        System.out.println(name + " foi o " + placing + " º colocado com " + pulos + " pulos.");
    }

    public void imprimeCorrida(){
        
        System.out.println("O " + name + "/ pulou " + pulo + "cm e percorreu a distncia de |" + puloDistancia + " cm| ...");
    }
 
    public void run(){

        while (puloDistancia < distanciaTotal){
            puloGrilinho();
            imprimeCorrida();
        }
        placingCricket();
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