package lecture3.interfaces.measureable;

public class Rectangle implements Measurable2D {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        // does such rectangular exists?
        // you should write some data validation
    }



    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
