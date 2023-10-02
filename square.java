public class square extends rectangle {
    private double length;

    public square(String name, double length) {
        super(name);
        this.length = length;
    }

    public double getArea() {
        return length * length;
    }

    public double getPerimeter() {
        return 4 * length;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
}

