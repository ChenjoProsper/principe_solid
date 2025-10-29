package lsp.solution;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height){
        this.width = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    @Override
    public double getArea(){
        return width * height;
    }
}
