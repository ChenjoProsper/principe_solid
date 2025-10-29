package isp.erroner;

public class Humain implements Worker {
    @Override
    public void worker(){
        System.out.println("Les humains se fatigue en travaillant");
    }

    @Override
    public void eater(){
        System.out.println("Les humains mangent pour vivre");
    }
}
