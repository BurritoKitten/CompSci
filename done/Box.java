public class Box {
    private double length;
    private double width;
    private double height;
    private String color;
    private boolean hasALid;

    //constructor - creates/initializes an instance of a class
    public Box(double l, double w, double h, String c, boolean lid){
        length = l;
        width = w;
        height = h;
        color = c;
        hasALid = lid;
    }
    //overload the constructor
    public Box(double l, double w, double h){
        length = l;
        width = w;
        height = h;
        color = "purple";
        hasALid = true;
    }
    //default constructor
    public Box(){
        length = 1.0;
        width = 1.0;
        height = 1.0;
        color = "white";
        hasALid = false;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        height = (h>0) ? h : height;
    }
    public double volume(){
        return length * width * height;
    }
    public String toString(){
        String r = "Box has been printed";
        return r;
    }
    public boolean isTaller(Box other){
        boolean r = (height>other.getHeight()) ? true : false;
        return r;
    }
    public static void main(String[] args){
        Box b1 = new Box(6.5, 8.3, 9.4, "brown", false);
        Box b2 = new Box(3.6, 2.8, 7.4);
        Box b3 = new Box();
        b3.setHeight(5.3);
        System.out.println(b3.getHeight());
        System.out.println(b1.volume());
        System.out.println(b1);
        System.out.println(b1.isTaller(b3));

    }
}
