package isp.erroner;

public class Main {
    public static void main(String[] args) {
        Worker humain = new Humain();
        Worker robo = new Robo();
        humain.worker();
        humain.eater();
        robo.worker();
        robo.eater();
        
    }
}
