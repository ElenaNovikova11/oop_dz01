public class Circle extends GeometricShapes {
    public Circle(String name, double radius) {
        super(name, radius, radius, radius, radius);
    }

    public void calculateArea(String name, Double S, double radius) {
        S = (3.14 * (getRadius() * getRadius()));
        String result = String.format("%.2f",S);
        System.out.println("Площадь " + getName() + ": радиус " + getRadius() + " = " + result);
    }

    public void calculatePerimeter(String name, Double P, double radius) {
        P = 2 * 3.14 * getRadius();
        String result = String.format("%.2f",P);
        System.out.println("Периметр " + getName() + ": радиус " + getRadius() + " = " + result);
    }
}
