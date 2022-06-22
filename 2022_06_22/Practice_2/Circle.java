package Practice_2;

public class Circle {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void showArea(){
        System.out.printf("圆的面积为：%.2f",Math.PI*getR());
    }
    public void showPerimeter(){
        System.out.printf("圆的周长为：%.2f" ,2*Math.PI*getR());
    }
}
