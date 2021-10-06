public class CorridaGrilo {

    static int numGrilos = 10;
    final static int TOTAl = 800;

    public static void main(String[] args) {
        
        for(int i = 1; i <= numGrilos; i++){
            new PuloGrilo("GRILO_" + i, TOTAl).start();
        }
    }
}
