package psyh;

public class Triangle {
    private final double a;
    private final double b;
    private final double c;
    private final double area;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        area = area();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", area=" + area +
                '}';
    }

    private double area() {
        return Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c)) / 4;
    }
}
