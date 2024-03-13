public class Rectangle extends GeometricShapes {
    public Rectangle(String name, double length, double width) {
        super(name, length, length, width, width);
    }

    public void calculateArea(String name, Double S, double length, double width) {
        S = (getLength() * getWidth());
        String result = String.format("%.2f", S);
        System.out.println("Площадь " + getName() + ": длина " + getLength() + ", ширина " + getWidth() + " = " + result);
    }

    public void calculatePerimeter(String name, double P, double length, double width) {
        P = ((getLength() + getWidth()) * 2);
        String result = String.format("%.2f", P);
        System.out.println("Периметр " + getName() + ": длина " + getLength() + ", ширина " + getWidth() + " = " + result);
    }
}
