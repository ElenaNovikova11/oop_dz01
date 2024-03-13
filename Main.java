public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Круга", 9.8);
        Rectangle rectangle = new Rectangle("Прямоугольника", 11.0, 15.3);
        Square square = new Square("Квадрата", 5);

        circle.calculateArea(null, null, 0);
        circle.calculatePerimeter(null, null, 0);

        rectangle.calculateArea(null, null, 0, 0);
        rectangle.calculatePerimeter(null, 0, 0, 0);

        square.calculateArea(null, null, 0);
        square.calculatePerimeter(null, 0, 0);
    }
}
