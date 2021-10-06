public class RacingCricket {

    static int countCrickets = 8;
    final static int TOTAL_DISTANCE = 800;

    public static void main(String[] args) {
        
        for(int i = 1; i <= countCrickets; i++){
            new JumpingCricket("GRILO_" + i, TOTAL_DISTANCE).start();
        }
    }
}
