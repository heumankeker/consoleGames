/**
 * JumpingCricket
 */
public class JumpingCricket extends Thread{

    String name;
    int jumpDistance = 0;
    int totalDistance;
    int jumps = 0;
    int jump = 0;
    static int placing = 0;
    final static int MAX_JUMP = 48;


    JumpingCricket( String name, int totalDistance){

        this.name = name;
        this.totalDistance = totalDistance;
    }


    public void jumpingCricket(){
        jumps++;
        jump = (int) (Math.random() * MAX_JUMP);
        jumpDistance += jump;
        if(jumpDistance > totalDistance){
            jumpDistance = totalDistance;
        }
    }

    public void placingCricket(){
        placing++;
        System.out.println(name + " foi o " + placing + " º colocado com " + jumps + " pulos.");
    }

    public void printRacing(){
        
        System.out.println("O " + name + " pulou " + jump + " cm e ja percorreu a distãncia de " + jumpDistance + " cm.");
    }
 
    public void run(){

        while (jumpDistance < totalDistance){
            jumpingCricket();
            printRacing();
        }
        placingCricket();
    }
}