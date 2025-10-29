package isp.erroner;

public class Robo implements Worker {
    @Override
    public void worker(){
        System.out.println("Les robos travaillant sans fatigue");
    }

    @Override
    public void eater(){
        System.out.println("l'on ne doit pas faire manger un robot");
        throw new UnsupportedOperationException("Les Robots ne mangent pas");
    }
}
