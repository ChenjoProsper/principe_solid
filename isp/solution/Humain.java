package isp.solution;

public class Humain implements Eater {
    @Override
    public void worker(){
        System.out.println("Les humains se fatigue en travaillant");
    }

    @Override
    public void eater(){
        System.out.println("Les humains mangent pour vivre");
    }
}
