package psyh;

public class Triangle {
    private double a;
    private double b;
    private double c;
    private double area;

    public Triangle(){super();}

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        area = area();
    }

    public double getArea() {
        return area;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
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
