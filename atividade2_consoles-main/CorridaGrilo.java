public class CorridaGrilo {

	final static int TOTAl = 800; //linha de chegada
    static int numGrilos = 10; //quantidade de grilos
   
    public static void main(String[] args) {
        
        for(int i = 1; i <= numGrilos; i++){
            new PuloGrilo("GRILO_" + i, TOTAl).start();
        }
    }
} //end
