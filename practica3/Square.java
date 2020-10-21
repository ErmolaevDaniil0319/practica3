package practica3;
import java.math.*;
public class Square extends Rectangle {
    private Boolean filled;
    private String color;
    private double width;
    private double length;
    private double side;


    public Square(){
        this.filled = false;
        this.color = "green";
        this.width = 8;
        this.length = 8;
        this.side = 8;
    }
    public Square(double side){
        this.filled = false;
        this.color = "green";
        this.width = 8;
        this.length = 8;
        this.side = side;

    }
    public Square(double side, String color, boolean filled){
        this.filled = filled;
        this.color = color;
        this.width = 8;
        this.length = 8;
        this.side = side;

    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }



    public void setWidth(double side){
        this.width = side;

    }
    public void setLength(double side){
        this.width = side;

    }
    @Override
    public String toString(){
        return "Shape: Square";
    }
}
