package lecture3.interfaces.measureable;

public class AreaCalculator {
    public static void main(String[] args) {
        Measurable2D[] figures = new Measurable2D[]{
                new Circle(5.),
                new Rectangle(1, 2),
                new Trapezoid(1, 2, 3),
        }; // is there another way to do that?
        Triangle triangle = new Triangle(2, 2, 3);

        for (Measurable2D figure : figures) {
            System.out.println(figure + ":" + figure.getArea());
        }

    }
}
