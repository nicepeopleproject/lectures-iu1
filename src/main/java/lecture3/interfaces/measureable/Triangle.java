package lecture3.interfaces.measureable;

public class Triangle {
    private double a;
    private double b;
    private double c;
//    private double p;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        // data validation
//        p = (a + b + c) / 2.;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
