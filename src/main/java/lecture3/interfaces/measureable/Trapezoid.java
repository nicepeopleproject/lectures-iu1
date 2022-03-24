package lecture3.interfaces.measureable;

public class Trapezoid implements Measurable2D {
    private double baseA;
    private double baseB;
    private double h;

    public Trapezoid(double baseA, double baseB, double h) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.h = h;
        //data validation
    }


    @Override
    public double getArea() {
        return (baseA + baseB) / 2. * h;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "baseA=" + baseA +
                ", baseB=" + baseB +
                ", h=" + h +
                '}';
    }
}
