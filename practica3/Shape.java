package practica3;
public abstract class Shape {
    String color;
    boolean filed;

    public Shape(){
    }
    public Shape(String color, boolean filed) {
        this.color = color;
        this.filed = filed;
    }

    public String getColor() {
        return color;
    }

    public boolean isFiled() {
        return filed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFiled(boolean filed) {
        this.filed = filed;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString(){
        return  null;
    }

}
