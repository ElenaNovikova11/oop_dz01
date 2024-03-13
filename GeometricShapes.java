public class GeometricShapes {
    @SuppressWarnings("unused")
    private String name;
    @SuppressWarnings("unused")
    private Double radius;
    @SuppressWarnings("unused")
    private Double length;
    @SuppressWarnings("unused")
    private Double width;
    @SuppressWarnings("unused")
    private Double side;

    public GeometricShapes(String name, double radius, double length, double width, double side) {
        this.name = name;
        this.radius = radius;
        this.length = length;
        this.width = width;
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public Double getRadius() {
        return radius;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    public Double getSide() {
        return side;
    }
}
