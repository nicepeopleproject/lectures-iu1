package lecture3.interfaces.measureable;

public class Circle implements Measurable2D {
    private double r;

    public Circle(double r) {
        this.r = r;
        //data validation
    }

    @Override
    public double getArea() {
        return Math.pow(r, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
