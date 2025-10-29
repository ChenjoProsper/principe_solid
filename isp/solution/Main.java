package isp.solution;

public class Main {
    public static void main(String[] args) {
        Eater humain = new Humain();
        Worker robo = new Robo();
        humain.worker();
        humain.eater();
        robo.worker();        
    }
}
