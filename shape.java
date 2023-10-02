public abstract class shape {
    protected String name;

    public shape(String name){
        this.name = name;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

