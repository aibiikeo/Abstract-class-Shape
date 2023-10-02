public class circle extends shape{
    private double radius;

    public circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

    public double getPerimeter(){
        return 2*3.14*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
