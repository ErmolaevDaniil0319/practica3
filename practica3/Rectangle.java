package practica3;
import java.math.*;
public class Rectangle extends Shape{
    private Boolean filled;
    private String color;
    private double width;
    private double length;
    public Rectangle(){
        this.width = 5;
        this.length = 10;
        this.filled = false;
        this.color = "red";
    }
    public Rectangle(double width, double lenght){
        this.width = width;
        this.length = lenght;
        this.filled = false;
        this.color = "red";
    }

    public Rectangle(double width, double lenght, String color, boolean filled){

        this.width = width;
        this.length = lenght;
        this.color = color;
        this.filled = filled;

    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {

        //return Math.PI*radius*radius;
        return  getLength()*getWidth();
    }

    public double getPerimeter() {
        return getLength()*2 + getWidth()*2;


        //return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Shape: Rectangle";
    }
}