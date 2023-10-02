public class rectangle extends shape{
    protected double width, length;

    public rectangle(String name) {
        super(name);
    }

    public rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2*(width + length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}

