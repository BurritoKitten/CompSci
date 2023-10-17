public class Circle {
    private double radius;

    public Circle(double radiusIn)
    {
        radius = radiusIn;
    }
    public double Area()
    {
        return Math.PI*radius*radius;
    }
    public double Circumference()
    {
        return 2*Math.PI*radius;
    }
}