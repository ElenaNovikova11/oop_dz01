public class Square extends GeometricShapes {
    public Square(String name, double side){
        super(name, side, side, side, side);
    }
    public void calculateArea(String name, Double S, double side){
        S = (getSide() * getSide());
        String result = String.format("%.2f",S);
        System.out.println("Площадь " + getName()+": сторона " + getSide() + " = " + result);
    }
    public void calculatePerimeter(String name, double P, double side){
        P = getSide() * 4;
        String result = String.format("%.2f",P);
        System.out.println("Периметр " +  getName()+": сторона " + getSide() + " = " + result);
    }
}
