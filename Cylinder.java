public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(double radIn, double heigIn)
    {
        base = new Circle(radIn);
        height = heigIn;
    }
    public double vol()
    {
        return base.Area()*height;
    }
    public double sa()
    {
        return 
        (2*base.Area()) + 
        (base.Circumference()*height);
    }
}
